package classPra01;

class Carr {
    int currSpeed;  // 현재 속도
    int maxSpeed = 120;  // 최대 속도 (고정값)

    // 생성자
    Carr(int currSpeed) {
        setSpeed(currSpeed);  // 현재 속도 설정 (함수화)
    }

    // 속도를 설정하는 메서드
    void setSpeed(int speed) {
        if (speed > maxSpeed) {
            this.currSpeed = maxSpeed;  // 최대 속도를 초과하면 제한
            System.out.println("모든 자동차들은 최대 속도가 " + maxSpeed + "을 넘길 수 없습니다.");
        } else {
            this.currSpeed = speed;  // 정상 범위 속도 설정
        }
    }

    // 현재 속도를 출력하는 메서드
    void displaySpeed() {
        System.out.println("현재 속도: " + currSpeed);
    }
}

public class Pra05 {
    public static void main(String[] args) {
        Carr car = new Carr(130);  // 현재 속도를 130으로 설정
        car.displaySpeed();      // 현재 속도 출력

        car.setSpeed(90);        // 속도를 90으로 설정
        car.displaySpeed();      // 현재 속도 출력
    }
}


