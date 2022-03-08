package Basic;

public class Largest_three_num {
	public static void main(String[] args) {
		int a = 20,b=30,c=75,temp,largest;
		temp=a>b?a:b;
		largest=c>temp?c:temp;
		System.out.println(largest);
	}

} 
