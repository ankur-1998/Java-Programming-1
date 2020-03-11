import java.io.*;
import java.util.*;

class bit{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 2 numbers:");
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("a bitwise and b " +(a&b));
		System.out.println("a bitwise or b "+ (a|b));
		System.out.println("a bitwise xor b "+ (a^b));
		System.out.println("a bitwise complement "+ (~a));
		System.out.println("left shift a "+ (a<<2));
		System.out.println("right shift a "+ (a>>2));
		System.out.println("zero fill right shift a "+ (a>>>2));
		
	}
}