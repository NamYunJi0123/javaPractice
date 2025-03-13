package classPra01;

//자동차 클래스를 구현해주세요.
//자동차는 현재 속도를 보여줄 수 있고,
//모든 자동차들은 최대 속도가 120을 넘길수없습니다.

class Car {
	int currentSpeed;// 속도
int maxSpeed;

	Car(int currentSpeed) {
		this.currentSpeed = currentSpeed;
		this.maxSpeed = 120;
		
		if(maxSpeed<currentSpeed) {
			this.currentSpeed=this.maxSpeed;
			System.out.println("모든 자동차들은 최대 속도가 "+this.maxSpeed+"을 넘길수없습니다.");
		}
	}
}

public class Pra04 {
	public static void main(String[] args) {
		
		Car car01 = new Car(120);
		
		System.out.println(car01.currentSpeed);

	}

}
