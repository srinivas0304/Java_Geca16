package Polymorphism;

public class C {
	public static void main(String[] args) {
		A a=new A();
		System.out.println(a.i);
		A a1=new B();
		B a11=(B) (a1);
		System.out.println(a11.i);
		System.out.println(a11.j);
		B b=new B();
		System.out.println(b.j);
	}

}
