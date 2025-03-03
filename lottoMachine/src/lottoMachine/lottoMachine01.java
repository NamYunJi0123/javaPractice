package lottoMachine;
import java.util.Arrays;
import java.util.Scanner;
public class lottoMachine01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//로또 머신 만들기 연습 1 (while문 이용하기)

		int[] lottoMachine = new int[45];
        for (int i = 0; i < lottoMachine.length; i++) {
            lottoMachine[i] = i + 1; // 배열에 1부터 45까지 초기화
        }

        // 로또 번호를 저장할 배열
        int[] lottoBalls = new int[6];
        int bonusNumber = 0; // 보너스 번호
        int count = 0; // 추출된 번호의 개수와 배열의 현재 저장 위치

        // 로또 번호와 보너스 번호를 추출
        while (count < 7) {   // 6개의 메인 번호와 1개의 보너스 번호가 있어서
            // 랜덤 인덱스 선택 (0 ~ 44)
            int index = (int) (Math.random() * 45);

            // 이미 선택되지 않은 번호라면 처리
            if (lottoMachine[index] != 0) {
                if (count < 6) {
                    lottoBalls[count++] = lottoMachine[index]; // 로또 번호 저장
                } else {
                    bonusNumber = lottoMachine[index]; // 보너스 번호 저장
                    count++;
                }
                // 사용된 번호를 0으로 초기화
                lottoMachine[index] = 0;
            }
        }

        // 결과 출력
        System.out.println("로또 번호: " + Arrays.toString(lottoBalls));
        System.out.println("보너스 번호: " + bonusNumber);
        
        //사용자가 선택
        count = 0;
        Scanner scan = new Scanner(System.in);
       //사용자 로또 저장 배열
        int[] userLotto = new int[6];
         
       while(count < 6) {
    	   System.out.println((count+1) +  " 번째 로또 번호 !");
    	   int balls = scan.nextInt();
    	   //중복 체크 
    	   for(int i = 0; i < count; i++) {
    		   if(userLotto[i] == balls) {
    			   System.out.println(balls + " 는 이미 존재하는 번호 !! ");
    			   balls = 0;
    			   break; 
    		   }
    	   }
    	   
    	   if(balls != 0) {
    		   userLotto[count++] = balls; 
    	   }  
       }
       scan.close();
        
       System.out.println("사용자 로또 : ");
       for (int i = 0; i < userLotto.length; i++) {
    	   System.out.print(userLotto[i] + " ");
       }
       
       System.out.println();
        
    }
}
