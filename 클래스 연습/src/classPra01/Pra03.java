package classPra01;

//상품 객체들을 다룰 예정입니다.
//상품은 이름,가격,재고가 있습니다.
//만약 재고를 설정하지않으면 0개가 기본설정되도록 해주세요.

class Product {

	String name;
	int price;
	int stock;

	Product(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	Product(String name, int price) {
		this.name = name;
		this.price = price;
		this.stock = 0;
	}
	
	void printProduct(){
		System.out.println("상품 이름: " +this.name);
		System.out.println("상품 가격: " +this.price);
		System.out.println("상품 재고: " +this.stock);
	}

}

public class Pra03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product pro1 = new Product("티비", 10000, 1);
		Product pro2 = new Product("티비", 10000);
		
		pro1.printProduct();
		pro2.printProduct();
	}

}
