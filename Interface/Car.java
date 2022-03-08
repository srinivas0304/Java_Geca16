package Interface;

public class Car extends Object {
	String bName="Audi";

	public Car() {
		super();
		this.bName = bName;
	}

	@Override
	public String toString() {
		return "Car [bName=" + bName + "]";
	}
	
	public static void main(String[] args) {
		Car obj=new Car();
		System.out.println(obj);
		System.out.println(obj.toString());
	}
	

}