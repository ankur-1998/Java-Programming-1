//User Defined Exception
class Joy extends Exception{

}

class Triangle{
	double b,h;
	Triangle(double x, double y){
		b = x;
		h = y;
	}
	public void area()throws Joy
	{
		if(b<=0 || h<=0)
			throw new Joy();
		else
			System.out.println("Area is "+(0.5*b*h));
	}
}

class Exception1{
	public static void main(String[] args) {
		Triangle t = new Triangle(0,50);
		try{
			t.area();
		}
		catch(Joy e){
			System.out.println("Length or Breadth cannot be zero");
		}
	}
}