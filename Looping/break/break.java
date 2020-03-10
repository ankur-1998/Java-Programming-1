import java.io.*;

public class bbreak{
	public static void main(String[] args){
		
		for(int i=0;i<10000;i++){
			System.out.println(i);
			if(i==500)
				break;
		}
	}
}