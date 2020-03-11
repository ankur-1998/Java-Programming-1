//Interface withreference variable
//we can refer members of any class with the reference of interface variable
interface A{
	public void display();
}

class Sample implements A{
	public  void display(){
		System.out.println("A implements in Sample.");
	}
}

class Sample1 implements A{
	public void display(){
		System.out.println("A implements in Sample1.");
	}
}

class InterfaceWithRef{
	public static void main(String[] args) {
		
		A x; // x is a reference variable

		System.out.println("Sample");
		Sample s = new Sample();
		x = s;
		x.display();
		System.out.println("------------------");
		System.out.println("Sample 1");
		Sample1 s1 = new Sample1();
		x = s1;
		x.display();
	}
}
