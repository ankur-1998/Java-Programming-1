//Write a program to calculate the volume of box using default constructor and methods.
class box{
	double height, width, depth;
	box(){
		height = 2;
		width = 3;
		depth = 4;
	}
	public double volume(){
		return(height*width*depth);
	}
}

class volBox{
	public static void main(String[] args) {
		
		box b1 = new box();
		System.out.println("Volume of box 1 "+b1.volume());

		box b2 = new box();
		System.out.println("Volume of box 2 "+b2.volume());
	}
}