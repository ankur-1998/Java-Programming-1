import java.io.*;
import java.util.*;

class ternary{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 2 numbers:");
		int a,b,c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = (a>b)?a:b;
		System.out.println("Value of a "+a);
		System.out.println("Value of b "+b);
		System.out.println("Value of (a>b)?a:b "+c);

	}
}