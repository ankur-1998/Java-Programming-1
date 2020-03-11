//Arithmetic Exception
import java.io.*;
import java.lang.*;

class Exception2{
	public static void main(String[] args)throws IOException {
		int a,b,c;
		DataInputStream dis = new DataInputStream(System.in);
		try{
			System.out.println("Enter number1: ");
			a = Integer.parseInt(dis.readLine());
			System.out.println("Enter number2: ");
			b = Integer.parseInt(dis.readLine());

			if(b==0)throw new ArithmeticException();
			c = a/b;
			System.out.println("C value is "+c);
		}
		catch(ArithmeticException e){
			System.out.println("Cannot divide by zero. "+e);
		}
		/*catch(NumberFormatException e){
			System.out.println("Please enter a number. "+e);
		}*/
		catch(IOException e){
			System.out.println("fgsfdgd"+e);
		}
		finally{
			dis.close();
		}
	}
}