import java.io.*;
import java.util.*;

class post{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		int a;
		a = sc.nextInt();
		System.out.println("Value of a = "+a);
		System.out.println("Pre-Increment of a= "+ (a++));
		System.out.println("Value of a = "+a);
		
	}
}