//Abstract Class Program
class MyClass{
	void calculate(double x){
		System.out.println("Square value of "+x+" ::: "+(x*x));
	}
}

class Common{
	public static void main(String[] args) {
		
		MyClass m1 = new MyClass();
		MyClass m2 = new MyClass();
		MyClass m3 = new MyClass();

		m1.calculate(3);
		m2.calculate(4);
		m3.calculate(5);
	}
}
