package com.arrays;
import java.util.*;
import java.io.*;
import java.lang.*;
public class CheckFloatEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float x[] = new float[]{197.23f, 224.24f, 256.56f};
		float y[] = new float[]{197.23f, 224.24f, 256.56f};
		
		float m[] = new float[]{};
		float n[] = new float[]{};
		
		float p[] = new float[]{+0.00f};
		float q[] = new float[]{-0.00f};
		
		boolean b = Arrays.equals(x, y);
		boolean a = Arrays.equals(m, n);
		boolean c = Arrays.equals(p, q);
		System.out.println("Are two float arrays equal ?:"+b);
		System.out.println("Are two float arrays equal ?:"+a);
		System.out.println("Are two float arrays equal ?:"+c);
	}

}
