package inheritance;

public class Bike extends Vehicle {
	String bName;
	double price;
	public Bike(double topSpeed,String bName, double price) {
		super(topSpeed);
		this.bName = bName;
		this.price = price;
	}
	public void driving() {
		System.out.println(this.bName);
		System.out.println(this.price);
		System.out.println(this.topSpeed);
	}

}
