package Array_s;

public class Immutable_S {
	public static void main(String[] args) {
		String s=" ";
		char[] ch= {'a','b','c'};
		/*s=s+ch[0];
		s=s+ch[1];
		s=s+ch[2];*/
		for(char ch1:ch) {
			s=s+ch1;
		}
		System.out.println(s);
		
	}
}
