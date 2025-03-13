package classPra01;

//원 클래스를 선언해주세요.

//원 객체들은 이름과 반지름, 넓이를 가집니다.
//넓이는 반지름x반지름x3.14로 계산합니다.
//예를들어,
//도넛은(는) 반지름이 1입니다. 도넛의 넓이는 3.14입니다.
//피자은(는) 반지름이 10입니다. 피자의 넓이는 314.0입니다.
class Circle {
	String name;// 이름
	int radius;// 반지름
	double area;// 넓이 반지름*반지름*3.14

	Circle(String name,int radius) {
		this.name = name;
		this.radius = radius;
		this.area = this.radius * this.radius * 3.14;
	}
	
	void  printCircleInfor() {
		System.out.println("원 이름 : "+this.name);
		System.out.println("반지름 : "+this.radius);
		System.out.println("넓이 : "+this.area);
	}
	


}

public class Pra01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Circle circle01 = new Circle("도넛",1);
		Circle circle02 = new Circle("피자",10);
		
		circle01.printCircleInfor();
		circle02.printCircleInfor();
	

	}
	

}
