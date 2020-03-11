import java.io.*;
import java.util.*;

class arith{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two numbers:");
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Sum = "+(a+b));
		System.out.println("Sub = "+(a-b));
		System.out.println("Mul = "+(a*b));
		System.out.println("Div = "+(a/b));
		System.out.println("Mod = "+(a%b));
	}
}