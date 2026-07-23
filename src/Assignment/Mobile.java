package Assignment;

public class Mobile {
	String brand;
	String model;
	int price;
	public void setMobileDetails(String brand,String model,int price) {
		this.brand=brand;
		this.model=model;
		this.price=price;
		
	}
	public void showDetails() {
		System.out.println("Brand :"+brand);
		System.out.println("Model :"+model);
		System.out.println("Price :"+price);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile obj=new Mobile();
		obj.setMobileDetails("Samsung", "S24", 80000);
		obj.showDetails();

	}

}
