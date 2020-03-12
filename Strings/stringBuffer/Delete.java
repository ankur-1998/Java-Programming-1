//Java StringBuffer delete/remove characterpackage com.stringBuffer;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1 = new StringBuffer("Hello World");
		sb1.delete(0,6);
		System.out.println(sb1);
		
		StringBuffer sb2 = new StringBuffer("apollo");
		System.out.println(sb2);
		
		//sb2.delete(0,sb2.length());
		
		sb2.delete(0,2);
		System.out.println(sb2);
		
		StringBuffer sb3 = new StringBuffer("Hello World");
		System.out.println(sb3.length());
		
		sb3.deleteCharAt(6);
		System.out.println(sb3);
	}

}
