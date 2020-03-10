import java.io.*;
import java.util.*;

class switchcase{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a choice: one, two, three ");

		String str = sc.nextLine();

		switch(str)
		{
			case "one": 
				System.out.println("One player is playing the game");
				break;

			case "two":
				System.out.println("Two players are playing the game");
				break;

			case "three":
				System.out.println("Three players are playing the game");
				break;

			default: 
				System.out.println("You didn't enter a valid value.");
				break;
		}
	}
}