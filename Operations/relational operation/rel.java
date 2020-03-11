import java.io.*;
import java.util.*;

class rel{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 2 numbers:");
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("a equals b " +(a==b));
		System.out.println("a greater than b "+ (a>b));
		System.out.println("a less than b "+ (a<b));
		System.out.println("a greater than equals to b "+ (a>=b));
		System.out.println("a less than equals to b "+ (a<=b));
		System.out.println("a not equals to b "+ (a!=b));
		
	}
}