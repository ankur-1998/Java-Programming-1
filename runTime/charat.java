import java.util.*;

class charat{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 2 String:");
		String str1, str2, str3;
		str1 = sc.nextLine();
		str2 = sc.nextLine();
		str3 = str1 + str2;
		System.out.println("--------------------------");
		System.out.println("String 1 is " +str1);
		System.out.println("String 2 is " +str2);
		System.out.println("String 3 is " +str3);
		System.out.println("--------------------------");
	}
}

