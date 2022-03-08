package Basic;

import java.util.Scanner;

public class Sum_int_string {//add integers present within the string
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("type here");
		String s=sc.nextLine();
		int i=0;
		for(int j=0;j<s.length();j++) {
			char ch=s.charAt(j);
			if(ch>='0'&&ch<='9') {
			i=i+Integer.parseInt(ch+"");
			System.out.println(i);
			sc.close();
		}		
	}
}
}
