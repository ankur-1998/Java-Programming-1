//Array outofbound index
import java.io.*;
import java.util.*;

class Exception3{
	public static void main(String[] args) {
		try{
			int ar[] = {1, 2, 3, 4, 5}; 
        	for (int i=0; i<=ar.length; i++) 
          		System.out.println(ar[i]); 
	    }
	    catch(ArrayIndexOutOfBoundsException e){
	    	System.out.println("Out of Index "+e);
	    }

	}
}