package Non_Primitive_Casting;

public class D extends C {
	int l=50;
	public static void main(String[] args) {
		D obj=(D) (new C());
		System.out.println(obj.l);
	}

}
