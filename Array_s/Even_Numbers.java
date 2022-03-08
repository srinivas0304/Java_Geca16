package Array_s;

import java.util.*;

public class Even_Numbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int [] a=new int[size];
		System.out.println("enter the numbers");
		/*a[0]=sc.nextInt();
		a[1]=sc.nextInt();
		a[2]=sc.nextInt();*/
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int count=0;
		for(int i:a) {
			if(i%2==0) {
				count++;
			}
		}
		System.out.println("The no.of even no.in the given array is "+count);
		
		
	}
	

}
