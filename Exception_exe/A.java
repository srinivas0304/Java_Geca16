package Exception_exe;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class A {
	public static void main(String[] args) throws FileNotFoundException {
		run();
	}
public static void run() throws FileNotFoundException {
	walk();
}
public static void walk() throws FileNotFoundException{
	FileInputStream fin=new FileInputStream(" ");
}
}

