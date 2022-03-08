package Basic;

import java.util.Scanner;

public class Duplicate_str {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		String s1="";
		for(int i=0;i<s.length();i++) {
			if(s1.indexOf(s.charAt(i))==-1) {
				s1=s1+s.charAt(i);
			}
		}
		System.out.println(s1);
		sc.close();
	}

}
