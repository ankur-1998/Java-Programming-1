//Write a program for parameterized constructor
class Account{
	int accno;
	double balance;

	Account(){
		accno = 0;
		balance = 0.0;
	}
	Account(int an){
		accno = an;
		balance = 0.0;
	}
	Account(int an, double k){
		accno = an;
		balance = k;
	}
	public void read(int an, double k){
		accno = an;
		balance = k;
	}
	public void display(){
		System.out.println("Account number is "+accno);
		System.out.println("Balance is "+balance);
	}
}

class BankAcc{
	public static void main(String[] args) {
		
		Account a1 = new Account();
		System.out.println("Account 1");
		a1.display();
		System.out.println("------------------");

		Account a2 = new Account(5);
		System.out.println("Account 2");
		a2.display();
		System.out.println("------------------");
		
		Account a3 = new Account(10,500);
		System.out.println("Account 3");
		a3.display();
		System.out.println("------------------");

		System.out.println("Read Method");
		a3.read(15,1000);
		a3.display();
		System.out.println("------------------");
	}
}