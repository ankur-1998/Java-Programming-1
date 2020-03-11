//Not a prefered way
class MyClass{
	void calculate_square(double x){
		System.out.println("Square value of "+x+" ::: "+(x*x));
	}
	void calculate_sqrt(double x){
		System.out.println("Square root value of "+x+" ::: "+(Math.sqrt(x)));
	}
	void calculate_cube(double x){
		System.out.println("Cube value of "+x+" ::: "+(x*x*x));
	}
}

class NotPreferred{
	public static void main(String[] args) {
		
		MyClass m1 = new MyClass();
		MyClass m2 = new MyClass();
		MyClass m3 = new MyClass();

		m1.calculate_square(3);
		m2.calculate_sqrt(4);
		m3.calculate_cube(5);
	}
}
