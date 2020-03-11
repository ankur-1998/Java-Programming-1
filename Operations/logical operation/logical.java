import java.io.*;
import java.util.*;

class logical{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 2 boolean values:");
		boolean a,b;
		a = sc.nextBoolean();
		b = sc.nextBoolean();
		
		System.out.println("Value of a && b "+ (a&&b));
		System.out.println("Value of a || b "+ (a||b));
		System.out.println("Value of !(a&&b) "+ !(a&&b));

	}
}