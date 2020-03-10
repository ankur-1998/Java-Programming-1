import java.io.*;
import java.util.*;

class simpleFor{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");

		int num = sc.nextInt();

		for(int i=0;i<num;i++)
			System.out.println("index is: "+i);

		System.out.println("\n");

		for(int i=0;i<num;i+=2)
		{
			System.out.println("index is: "+i);
			i++;
		}
	}
}