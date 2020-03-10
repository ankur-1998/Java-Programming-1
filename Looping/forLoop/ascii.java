import java.io.*;
import java.util.*;

class ascii{
	public static void main(String[] args) {

		char ch='z';
		for(int i='z';i>='a';i--,ch--){
			System.out.println("ascii of "+ch+" is "+i);
		}

		System.out.println("\n");

		char ch1='Z';
		for(int i='Z';i>='A';i--,ch1--){
			System.out.println("ascii of "+ch1+" is "+i);
		}
	}
}