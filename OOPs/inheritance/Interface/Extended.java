//Extended Interface
import java.io.*;

interface Input{
	void read();
}

interface Measure extends Input{
	void area();
}

class Triangle implements Measure{
	int b,h;
	Triangle(){
		b = 0;
		h = 0;
	}
	public void read(){
		try{
			DataInputStream dis = new DataInputStream(System.in);
			System.out.println("Enter the base = ");
			b = Integer.parseInt(dis.readLine());

			System.out.println("Enter the height = ");
			h = Integer.parseInt(dis.readLine());
		}
		catch(IOException e){
			System.out.println("IO Error");
		}
	}
	public void area(){
		System.out.println("Area of Triangle = "+(0.5*b*h));
	}
}

class Extended{
	public static void main(String[] args) {
		
		Triangle tri = new Triangle();
		tri.read();
		System.out.println("-----------------");
		tri.area();
	}
}