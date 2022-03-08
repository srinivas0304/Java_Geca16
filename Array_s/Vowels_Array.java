package Array_s;

import java.util.Scanner;

public class Vowels_Array {
	public static void main(String[] args) {
		int count=0;
		System.out.println("Enter a sentence");
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		 
		for (int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
			}
		}
		System.out.println("Number of vowels: "+count);
		
		}
		
	}


