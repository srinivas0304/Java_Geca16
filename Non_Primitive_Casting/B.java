package Non_Primitive_Casting;

public class B extends A {
		int j=25;
	public static void main(String[] args) {
		A obj=new B();
		B temp=(B) (obj);
		System.out.println(obj.i);
		System.out.println(temp.j);
		System.out.println(temp.i);
		System.out.println(temp.toString());
	
}
}