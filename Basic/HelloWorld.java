package Basic;

public class HelloWorld {
		public static int asd(int a,int b) {
			if(a-b>0) {
				return a+b;
			}
			else {
				return a-b;
			}
		}
		public static void main(String[] args) {
			int ans=5;
			for (int i=1;i*i<=20;i++) {
				ans +=asd(i,i);
			}
			System.out.print(ans);
	}

}
