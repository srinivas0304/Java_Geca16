package Array_s;

public class Boolean_New_Operator {
	public static void main(String[] args) {
		boolean[] b;
		b=new boolean [3];
		System.out.println(b[0]);//default value
		//System.out.println(b[1]);//default value
		b[1]=true;
		System.out.println(b[1]);//after declaring a variable and initializing a value to the b[1]
		for(boolean b1:b) {
			System.out.println(b1);
		}
		
	}

}
