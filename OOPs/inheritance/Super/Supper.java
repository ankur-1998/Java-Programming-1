//Super Keyword
class A{
	int a,b;
	public void read(int m, int n){
		a = m;
		b = n;
	}
	public void display(){
		System.out.println("Value "+a);
		System.out.println("Value "+b);
	}
}

class B extends A{
	int x,y;
	public void read(int i, int j, int k, int l){
		super.read(i,j);
		x = k;
		y = l;
	}
	public void display(){
		super.display();
		System.out.println("Value "+x);
		System.out.println("value "+y);
	}
}

class Supper{
	public static void main(String[] args) {
		
		B b = new B();
		b.read(5,6,7,8);
		b.display();
	}
}