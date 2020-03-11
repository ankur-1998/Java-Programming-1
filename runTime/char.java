import java.io.*;

class charat{
	public static void main(String[] args) throws IOException {
		
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("Enter 2 Character:");
		char ch1,ch2,ch3;
		ch1 = (char)dis.read();
		ch2 = (char)dis.read();
		int i1 =(int)(ch1 + ch2);
		ch3 = (char)(ch1 + ch2);
		System.out.println("------------------------");
		System.out.println("Value of char1 is "+ch1);
		System.out.println("Value of char2 is "+ch2);
		System.out.println("Addition of char1 and char2 is "+i1);
		System.out.println("Resulting Character is "+ch3);
		System.out.println("-------------------------");
	}
}