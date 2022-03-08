package Array_s;

public class Reverse_String {
	public static void main(String[] args) {
		String s="aba";
		String rev=" ";
		/*rev=s.charAt(0)+rev;
		rev=s.charAt(1)+rev;
		rev=s.charAt(2)+rev;
		rev=s.charAt(3)+rev;
		rev=s.charAt(4)+rev;
		rev=s.charAt(5)+rev;
		rev=s.charAt(6)+rev;
		rev=s.charAt(7)+rev;
		rev=s.charAt(8)+rev;
		rev=s.charAt(9)+rev;*/
		for(int i=0;i<=s.length()-1;i++) {
			rev=s.charAt(i)+rev;
		}
		//System.out.println(rev);
		if(s.equals(rev)) {
			System.out.println("It is Palindrome");
		}
		else {
			System.out.println("It is not a Palindrome");
		}
	}
	

}
