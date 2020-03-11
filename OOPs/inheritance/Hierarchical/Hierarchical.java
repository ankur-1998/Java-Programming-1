//Hierarchical Inheritance
class Student{
	String name;
	int no;
	public void read(String s, int n){
		name = s;
		no = n;
	}
	public void display(){
		System.out.println("Student name: "+name);
		System.out.println("Student no: "+no);
	}
}

class Maths extends Student{
	int mmarks;
	public void readm(String str1, int n1, int n2){
		read(str1,n1);
		mmarks = n2;
	}
	public void displaym(){
		display();
		System.out.println("Maths marks "+mmarks);
	} 
}

class Chemistry extends Student{
	int cmarks;
	public void readc(String str1, int n1, int n2){
		read(str1,n1);
		cmarks = n2;
	}
	public void displayc(){
		display();
		System.out.println("Chemistry marks "+cmarks);
	} 
}

class Physics extends Student{
	int pmarks;
	public void readp(String str1, int n1, int n2){
		read(str1,n1);
		pmarks = n2;
	}
	public void displayp(){
		display();
		System.out.println("Physics marks "+pmarks);
	} 
}

class Hierarchical{
	public static void main(String[] args) {
		
		System.out.println("--------------");
		Maths m = new Maths();
		m.readm("Ram",205,76);
		m.displaym();
		System.out.println("--------------");

		Physics p = new Physics();
		p.readp("Krishna",197,88);
		p.displayp();
		System.out.println("--------------");

		Chemistry c = new Chemistry();
		c.readc("Rahul",201,82);
		c.displayc();
		System.out.println("--------------");
	}
}