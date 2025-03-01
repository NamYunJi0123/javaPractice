package arry;

import java.util.Scanner;

public class array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 문제 풀기

		int[] arr = new int[5];
		Scanner scanner = new Scanner(System.in);

		System.out.println("5개의 숫자를 입력하세요:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 숫자: ");
			arr[i] = scanner.nextInt(); // 사용자 입력 받기

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

	}

}
