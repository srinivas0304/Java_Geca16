package Array_s;

import java.util.Scanner;

public class Dishes_Pg {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the size");
		int size=sc.nextInt();
		String[] s=new String[size];
		System.out.println("Enter your PG dishes");
		/*s[0]=sc.next();
		s[1]=sc.next();
		s[2]=sc.next();
		s[3]=sc.next();
		s[4]=sc.next();
		s[5]=sc.next();*/
		for(int j=0;j<s.length;j++) {
			s[j]=sc.next();
		}
		for(String s2:s) {
			System.out.println(s2);
		}
	}

}
