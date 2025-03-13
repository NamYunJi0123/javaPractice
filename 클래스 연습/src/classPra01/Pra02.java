package classPra01;

//책 객체들을 저장하고싶습니다.

//책이란, 제목과 작가로 구성되어있습니다.
//만약 작가를 알수없는 책이라면 작가의 이름을 작자미상으로 설정해주세요.

class Book {
	String title;// 제목
	String name;// 작가

	Book(String title) {
		this.title = title;
		this.name = "작자미상";
	}

	Book(String title, String name) {
		this.title = title;
		this.name = name;

	}
	
	
	void printBookInf(){
		System.out.println("책 제목 :" +this.title);
		System.out.println("작가 :" +this.name);
	}
}

public class Pra02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book01 = new Book("흥부와 놀부"); // 객체1
		Book book02 = new Book("해리포터", "롤링"); //객체2

		
		book01.printBookInf();
		book02.printBookInf();
	}

}
