//example of abstract class
abstract class Car{
	int regno;
	Car(int r){
		regno = r;
	}
	void openTank(){
		System.out.println("Fill the Tank");
	}
	abstract void steering(int direction, int angle);
	abstract void braking(int force);
}

class Maruti extends Car{
	Maruti(int regno){
		super(regno);
	}
	void steering(int direction, int angle){
		System.out.println("Take a Turn");
		System.out.println("This is ordinary steering");
	}
	void braking(int force){
		System.out.println("Brakes Applied");
		System.out.println("These are hydraulic brakes.");
	}
}

class Santro extends Car{
	Santro(int regno){
		super(regno);
	}
	void steering(int direction, int angle){
		System.out.println("Take a Turn");
		System.out.println("This car uses power steering");
	}
	void braking(int force){
		System.out.println("Brakes Applied");
		System.out.println("This car uses gas brakes.");
	}
}

class Example{
	public static void main(String[] args) {
		
		Maruti m = new Maruti(1001);
		Santro s = new Santro(5005);

		System.out.println("Maruti Car\n-------------");
		Car ref;
		ref = m;
		ref.openTank();
		ref.steering(1,90);
		ref.braking(500);
		System.out.println();
		System.out.println("Santro Car\n-------------");
		ref = s;
		ref.openTank();
		ref.steering(2,45);
		ref.braking(400);
	}
}