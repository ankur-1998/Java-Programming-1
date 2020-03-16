package com.arrays;

import java.util.*;
import java.io.*;
import java.lang.*;
public class CheckByteEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte x[] = new byte[]{27,78,12};
		byte y[] = new byte[]{27,78,12};
		
		byte m[] = new byte[]{};
		byte n[] = new byte[]{};
		
		boolean b = Arrays.equals(x, y);
		boolean a = Arrays.equals(m, n);
		System.out.println("Are two byte arrays equal ?:"+b);
		System.out.println("Are two byte arrays equal ?:"+a);
	}

}
