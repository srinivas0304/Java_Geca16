package Non_Primitive_Casting;

public class Rider {
	public static void main(String[] args) {
		Vehicle obj=new Car();
		((Bike)obj).move();//ClassCastException(During downcasting 
		/*if(obj instanceof Bike)
			((Bike)obj).move();
		else
			((Car)obj).move();*/
	}

}

