package updown;

import java.util.Random;
import java.util.Scanner;

public class updwon02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//업 다운 2번째
		
		Random random = new Random();
		int rand = random.nextInt(100) + 1;
		System.out.println("업다운 게임에 오신걸 환영합니다! 1부터 100까지 숫자를 입력해주세요");
		int input = 0 ;
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		
		while(rand != input) {
			System.out.println("숫자를 입력해주세요!");
			input = scanner.nextInt(); // 사용자 입력 받기
			count++; 
			
			if(rand>input) {
				System.out.println("업!!!");
			}
			
			else if(rand<input) {
				System.out.println("다운!!!");
			}
			else {
				System.out.println("정답입니다 축하합니다!!!"+ count+"번째 만에 맞췄습니다" );
			}
			
		}
		

	}

}
