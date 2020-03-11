import java.io.*;

class p2{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader ir = new InputStreamReader(System.in); 
		BufferedReader br = new BufferedReader(ir);
		
		System.out.println("Enter 2 Integers:");
		int a,b,c;
		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		c = a+b;
		System.out.println("------------------------");
		System.out.println("Value of A is "+a);
		System.out.println("Value of B is "+b);
		System.out.println("Addition of A and B is "+c);
		System.out.println("-------------------------");

		System.out.println("Enter 2 Float:");
		float d,e,f;
		d = Float.parseFloat(br.readLine());
		e = Float.parseFloat(br.readLine());
		f = d + e;
		System.out.println("------------------------");
		System.out.println("Value of D is "+d);
		System.out.println("Value of E is "+e);
		System.out.println("Addition of D and E is "+f);
		System.out.println("-------------------------");

		System.out.println("Enter 2 Double:");
		double g,h,i;
		g = Double.parseDouble(br.readLine());
		h = Double.parseDouble(br.readLine());
		i = g + h;
		System.out.println("------------------------");
		System.out.println("Value of G is "+g);
		System.out.println("Value of H is "+h);
		System.out.println("Addition of G and H is "+i);
		System.out.println("-------------------------");

		System.out.println("Enter 2 String:");
		String str1, str2, str3;
		str1 = br.readLine();
		str2 = br.readLine();
		str3 = str1 + str2;
		System.out.println("--------------------------");
		System.out.println("String 1 is " +str1);
		System.out.println("String 2 is " +str2);
		System.out.println("String 3 is " +str3);
		System.out.println("--------------------------");

		System.out.println("Enter 2 Long:");
		double j,k,l;
		j = Long.parseLong(br.readLine());
		k = Long.parseLong(br.readLine());
		l = j + k;
		System.out.println("------------------------");
		System.out.println("Value of J is "+j);
		System.out.println("Value of K is "+k);
		System.out.println("Addition of J and K is "+l);
		System.out.println("-------------------------");

		System.out.println("Enter 2 Short:");
		short m,n,o;
		m = Short.parseShort(br.readLine());
		n = Short.parseShort(br.readLine());
		o = (short)(m + n);
		System.out.println("------------------------");
		System.out.println("Value of M is "+m);
		System.out.println("Value of N is "+n);
		System.out.println("Addition of M and O is "+o);
		System.out.println("-------------------------");

		System.out.println("Enter 2 Byte:");
		byte p,q,r;
		p = Byte.parseByte(br.readLine());
		q = Byte.parseByte(br.readLine());
		r = (byte)(p + q);
		System.out.println("------------------------");
		System.out.println("Value of P is "+p);
		System.out.println("Value of Q is "+q);
		System.out.println("Addition of P and Q is "+r);
		System.out.println("-------------------------");

		System.out.println("Enter 2 Boolean:");
		boolean b1,b2,b3,b4;
		b1 = Boolean.parseBoolean(br.readLine());
		b2 = Boolean.parseBoolean(br.readLine());
		b3 = (boolean)(b1 && b2);
		b4 = (boolean)(b1 || b2);
		System.out.println("------------------------");
		System.out.println("Value of b1 is "+b1);
		System.out.println("Value of b2 is "+b2);
		System.out.println("AND Operation between b1 and b2 is "+b3);
		System.out.println("OR Operation on b1 and b2 is "+b4);
		System.out.println("-------------------------");

		System.out.println("Enter a Character:");
		char ch1;
		ch1 = (char)br.read();
		int i1 =(int)(ch1);
		System.out.println("------------------------");
		System.out.println("ASCII Value of char1 is "+i1);
		System.out.println("VALUE of character is "+ch1);
		System.out.println("-------------------------");
	}
}
