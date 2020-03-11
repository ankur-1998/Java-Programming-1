//Abstract Class
abstract class MyClass{
	abstract void calculate(double x);
}

class Square extends MyClass{
	void calculate(double x){
		System.out.println("Square value is:::"+(x*x));
	}
}

class Sqrt extends MyClass{
	void calculate(double x){
		System.out.println("Square Root value is :::"+(Math.sqrt(x)));
	}
}

class Cube extends MyClass{
	void calculate(double x){
		System.out.println("Cube value is:::"+(x*x*x));
	}
}

class Preferred{
	public static void main(String[] args) {
		
		Square m1 = new Square();
		Sqrt m2 = new Sqrt();
		Cube m3 = new Cube();

		m1.calculate(3);
		m2.calculate(4);
		m3.calculate(5);
	}
}