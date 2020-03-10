import java.io.*;
import java.util.*;

class oddeven{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");

		int num = sc.nextInt();

		for(int i=1;i<=num;i++){
			if(i%2==0){
				System.out.println(i+" even\n");
			}
			else{
				System.out.println(i+" odd\n");
			}
		}
	}
}