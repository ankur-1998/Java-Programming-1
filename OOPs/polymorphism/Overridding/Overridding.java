//Overriding program
import java.io.*;
import java.util.*;

class A{
	void calc(double x){
		System.out.println("Square value = "+(x*x));
	}
}

class B extends A{
	void calc(double x){
		System.out.println("Square-root value = "+(Math.sqrt(x)));
		super.calc(x);
	}
}

class Overridding{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		double n = sc.nextDouble();

		B b = new B();
		b.calc(n);
	}
}