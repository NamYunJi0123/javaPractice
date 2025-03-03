package updown;
import java.util.Random;
import java.util.Scanner;


public class updown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//업다운 문제
//		- 1에서 100 사이의 랜덤한 숫자를 선택
//		- 사용자가 숫자를 입력하면 컴퓨터는 "업", "다운", 또는 "정답"이라는 메시지를 출력
//		    - 입력한 숫자가 정답보다 작으면 "업" 출력.
//		    - 입력한 숫자가 정답보다 크면 "다운" 출력.
//		    - 정답을 맞추면 "정답! 시도 횟수: X번" 출력.
//		- 사용자가 정답을 맞출 때까지 게임이 계속
		
		
		Random random = new Random();
        int target = random.nextInt(100) + 1; // 1부터 100까지의 랜덤 숫자 생성
        int guess = 0; // 사용자의 입력
        int attempts = 0; // 시도 횟수
        Scanner scanner = new Scanner(System.in);

        System.out.println("업다운 게임에 오신 것을 환영합니다! 1에서 100 사이의 숫자를 맞춰보세요.");

        // 게임 루프
        while (guess != target) {
            System.out.print("숫자를 입력하세요: ");
            guess = scanner.nextInt(); // 사용자 입력 받기
            attempts++; // 시도 횟수 증가

            if (guess < target) {
                System.out.println("업! 더 큰 숫자입니다.");
            } else if (guess > target) {
                System.out.println("다운! 더 작은 숫자입니다.");
            } else {
                System.out.println("정답! 시도 횟수: " + attempts + "번");
            }
        }

        scanner.close();
    }
}