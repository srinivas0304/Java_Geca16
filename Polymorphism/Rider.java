package Polymorphism;

public class Rider {

	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		v.move();//100-veichle moves.....!
		Vehicle v1=new Bike();
		v1.move();//100-vehicle moves....! by CTB but output from subclass implementation by runtime binding
		Bike b=new Bike();
		b.move();//Bike moves......! but output from subclass implementation by runtime binding	

	}

}
