import java.io.*;
import java.util.*;

class instance{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ");

		String str = sc.nextLine();
		
		boolean res = str instanceof String;
		System.out.println(str+" is an instance of String " +res);

	}
}