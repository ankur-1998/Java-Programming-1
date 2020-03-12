//Compare between literal and new keyword
class Example{
	public static void main(String[] args) {
		
		//literal use
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1==s2); //Output:true

		//new keyword use
		String s3 = new String("abc");
		String s4 = new String("abc");
		System.out.println(s3==s4); //Output:false
	}
}