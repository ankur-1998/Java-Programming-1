class x1{
	void getData(int y){
		System.out.println(y);
	}
}
class msgPassing{
	public static void main(String[] args) {
		x1 x = new x1();
		x.getData(100);
	}
}