//Program for calculate Area, of Square, Rectangle using Interface
//Single Intewrface implemented Multiple classes
import java.io.*;
interface Measure{
	void read();
	void area();
}
class Square implements Measure{
	int a;
	Square(){
		a=0;
	}
	public void read(){
		try{
			DataInputStream dis = new DataInputStream(System.in);
			System.out.println("Enter the SIDE =");
			a = Integer.parseInt(dis.readLine());
		}
		catch(IOException e){
			System.out.println("Input and Output Error.");
		}
	}
	public void area(){
		System.out.println("Area of Square = "+(a*a));
	}
}

class Rectangle implements Measure{
	int l,b;
	Rectangle(){
		l=0;
		b=0;
	}
	public void read(){
		try{
			DataInputStream dis = new DataInputStream(System.in);
			System.out.println("Enter the Length = ");
			l = Integer.parseInt(dis.readLine());
			System.out.println("Enter the Breadth = ");
			b = Integer.parseInt(dis.readLine());
		}
		catch(IOException e){
			System.out.println("Input and Output Error.");
		}
	}
	public void area(){
		System.out.println("Area of Rectangle = "+(l*b));
	}
}

class ComputeArea{
	public static void main(String[] args)throws IOException {
		
		Square sq = new Square();
		sq.read();
		System.out.println("-------------");
		sq.area();
		System.out.println();

		Rectangle rec = new Rectangle();
		rec.read();
		System.out.println("-------------");
		rec.area();
		System.out.println();
	}
}