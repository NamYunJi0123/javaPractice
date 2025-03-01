package model;

public class ProductDTO {
	private static int NUM=1001;
	private int num; // PK
	private String name;
	private int price;
	private int stock;
	private int count;
	
    private String condition; //자바에서 개발용으로 생성한 멤버변수 
    public ProductDTO() {   // 기본 생성자 생성 하기
    	
    }
    
	public ProductDTO(String name,int price,int stock) {
		this.num=ProductDTO.NUM++;
		this.name=name;
		this.price=price;
		this.stock=stock;
		this.count=0;
	}
	public ProductDTO(String name,int price,int stock,boolean flag) {
		this.name=name;
		this.price=price;
		this.stock=stock;
		this.count=0;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	@Override
	public String toString() {
		if(this.stock<=0) {
			return "품절상품";
		}
		return "ProductDTO [num=" + num + ", name=" + name + ", price=" + price + ", stock=" + stock + ", count="
				+ count + "]";
	}

	

	
}
