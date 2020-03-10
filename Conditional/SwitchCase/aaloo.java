import java.io.*;
import java.util.*;

class aaloo{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a choice between [a,b,c]:");

		char ch = sc.next().charAt(0);

		switch(ch)
		{
			case 'a': 
				System.out.println("Aaloo");
				break;

			case 'b':
				System.out.println("Bada Aaloo");
				break;

			case 'c':
				System.out.println("Chhota Aaloo");
				break;

			default: 
				System.out.println("Sir ab jane bhi do");
				break;
		}
	}
}