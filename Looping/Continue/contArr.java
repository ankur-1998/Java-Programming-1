import java.io.*;

class contArr{
	public static void main(String[] args) {
		
		int a[] = new int[]{1,2,3,4,5};

		System.out.println("All number except for 3 are:");
		for(int i=0; i<a.length; i++){
			if(a[i]==3)
				continue;
			else
				System.out.println(a[i]);
		}
	}
}