//check final in interface variables
interface Cricket{
	int p1 = 11;
	int p2 = 1;
}

class Game implements Cricket{
	public void display(){
		System.out.println("Number of players:::"+p1);
		System.out.println("Nymber of keeper:::"+p2);
	}
}

class CheckFinalInInterface{
	public static void main(String[] args) {
		Game g = new Game();
		g.display();
	}
}