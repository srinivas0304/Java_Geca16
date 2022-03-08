package Basic;

import java.util.Scanner;

public class Count_num {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please type here");
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='0'&&ch<='9') {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
