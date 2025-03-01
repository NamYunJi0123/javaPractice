package test;


class Bank {
 private int money = 10000; // 공유 자원 (공동 계좌)

	// 동기화된 출금 메서드
	public synchronized void getMoney(int amount, String name) {
		if (money >= amount) {
			money -= amount;
			System.out.println(name + "가 " +amount + "원을 출금했습니다.");
			System.out.println("남은 금액은 " + money + "원입니다.");
		} else {
			System.out.println(name + "가 " + amount + "원을 출금하려 했으나 실패했습니다. (잔액 부족)");
			System.out.println("남은 금액은 " + money + "원입니다.");
		}
	}
}

// 출금을 수행하는 사람 (각 스레드)
class Person implements Runnable {
	private Bank bank;
	private String name;
	private int amount;

	public Person(Bank bank, String name, int amount) {
		this.bank = bank;
		this.name = name;
		this.amount = amount;
	}

	@Override
	public void run() {
		bank.getMoney(amount, name); // 출금 실행
	}
}

public class Test01 {
	public static void main(String[] args) {
		Bank bank = new Bank();

		// Runnable 구현 객체 생성
		Runnable father = new Person(bank, "아빠", 2000);
		Runnable mother = new Person(bank, "엄마", 1000);
		Runnable brother = new Person(bank, "동생", 3000);
		Runnable me = new Person(bank, "나", 5000);

		// Thread 객체에 Runnable을 넘겨주기
		Thread fatherThread = new Thread(father);
		Thread motherThread = new Thread(mother);
		Thread brotherThread = new Thread(brother);
		Thread meThread = new Thread(me);

		fatherThread.start();
		motherThread.start();
		brotherThread.start();
		meThread.start();
	}
}
