class byteDataType{
	public static void main(String args[]) {
		byte a,b,c;
		a = 20;
		b = 30;
		c = (byte)(a+b);
		System.out.println("byte a= "+a+"\nbyte b= "+b);
		System.out.println("ADD = "+c);

		short d,e,f;
		d=4342;
		e=3273;
		f=(short)(d+e);
		System.out.println("short d= "+d+"\nshort b= "+e);
		System.out.println("ADD = "+f);

		int g,h;
		g = -2147483648;
		h = 2147483647;
		System.out.println("int g= "+g+"\nint h= "+h);

		long i,j;
		i = -9223372036854775808L;
		System.out.println("long i = "+i);

		float k;
		k = 3.4e-38f;
		System.out.println("float k= "+k);

		double l;
		l = 1.7e-308;
		System.out.println("double l= "+l);

		char ch;
		ch = '0';
		System.out.println(ch);

		String str;
		str = "Hello I'm Ankur!!!";
		System.out.println(str);

		Boolean x,y;
		x = true;
		y = false;
		System.out.println("Boolean values are " +x+" "+y);

	}
}