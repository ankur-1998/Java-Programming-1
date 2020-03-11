class x1{
	void getData(){
		System.out.println("welcome");
	}
}
class dynBind{
	public static void main(String[] args) {
		x1 x = new x1();
		x.getData();
	}
}