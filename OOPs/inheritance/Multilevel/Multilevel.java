//Multilevel Inheritance
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

class Dept extends Student{
	String dname;
	int dno;
	public void readd(String str1, int n1, String str2, int n2){
		read(str1, n1);
		dname = str2;
		dno = n2;
	}
	public void displayd(){
		display();
		System.out.println("Dept name: "+dname);
		System.out.println("Dept no: "+dno);
	}
}

class Course extends Dept{
	String cname;
	int cno;
	public void readc(String str1, int n1, String str2, int n2, String str3, int n3){
		readd(str1,n1,str2,n2);
		cname = str3;
		cno = n3;
	}
	public void displayc(){
		displayd();
		System.out.println("Course name: "+cname);
		System.out.println("Course no: "+cno);
	}
}

class Multilevel{
	public static void main(String[] args) {
		Course c = new Course();
		c.readc("Ankur",197,"CSE",3020,"BTECH",101);
		System.out.println("-------------------");
		c.display();
		System.out.println("-------------------");
		c.displayd();
		System.out.println("-------------------");
		c.displayc();
	}
}