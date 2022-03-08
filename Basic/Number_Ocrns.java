package Basic;

import java.util.Scanner;

public class Number_Ocrns {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.next();
		String s1=sc.next();
		for(int i=0;i<s1.length();i++) {
			int count=0;
			for(int j=0;j<s.length();j++) {
				if(s1.charAt(i)==s.charAt(j)) {
					count++;
				}
			}
			System.out.println("is "+s1.charAt(i)+count);
		}
	}

}
