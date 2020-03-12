//Simple Inheritance
class World{
	String name;
	float weight;

	public void read(String s, float f){
		name = s;
		weight = f;
	}
	public void display(){
		System.out.println("Name: "+name);
		System.out.println("Weight: "+weight);
	}
}

class Living extends World{
	String lname;
	int lno;
	public void readl(String s, float f, String ss, int n){
		read(s,f);
		lname = ss;
		lno = n;
	}
	public void displayl(){
		display();
		System.out.println("Living name: "+lname);
		System.out.println("Living number: "+lno);
	} 
}

class Single{
	public static void main(String[] args) {
		Living l = new Living();
		l.read("India",10.00f);
		l.display();

		l.readl("Russia",90.0f,"Russians",1001);
		l.displayl();
	}
}