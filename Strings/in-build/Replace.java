class Replace{
	public static void main(String[] args) {
		String str = "Black Rose";
		System.out.println(str);
		//replace
		System.out.println(str.replace('B','R'));
		//replaceFirst
		System.out.println(str.replaceFirst("Bl","Ro"));
		//replaceAll
		System.out.println(str.replaceAll("se","ja"));
	}
}