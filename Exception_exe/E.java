package Exception_exe;



public class E {
	String name;
	double sal;
	public E(String name, double sal) {
		super();
		this.name = name;
		if(sal>0.0) {
		this.sal = sal;
	}
		else {
			throw new SalaryIncorrectException();
		}
	}
	public static void main(String [] args) {
		new E("Sri",-12544.23);
	}
	}


