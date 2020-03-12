import java.io.*;

public class Example2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s1 = new StringBuffer();
		StringBuffer s2 = new StringBuffer("SRM Institute of Science and Technology");
		StringBuffer s3 = new StringBuffer("Hello World");
		System.out.println(s3);
		System.out.println(s2);
		System.out.println(s1);
		int l1 = s1.length();
		int l2 = s2.length();
		int l3 = s3.length();
		System.out.println("length of StringBuffer object 1 is "+l1);
		System.out.println("length of StringBuffer object 2 is "+l2);
		System.out.println("length of StringBuffer object 3 is "+l3);
	}

}
