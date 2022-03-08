package inheritance;

public class Ride {
public static void main(String[] args) {
	Bike b=new Bike(47.5,"Activa",900.0);
	System.out.println(b.bName);
	System.out.println(b.price);
	System.out.println(b.topSpeed);
	System.out.println("*******************************");
	Vehicle v=new Vehicle(48.7);
	b.driving();
	System.out.println(v.topSpeed);

}
}
