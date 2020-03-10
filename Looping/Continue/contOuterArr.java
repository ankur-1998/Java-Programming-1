class contOuterArr{
	public static void main(String[] args) {
		
		int a[][] = new int[][]{{1,2},{2,3}};
		//int n = a.length;
		//System.out.println(n);
		Outer:
		for(int i=0;i<a.length;i++){
			//int q = a[i].length;
			//System.out.println(q);
			for(int j=0;j<a.length;j++){
				if(a[i][j]==3)
					continue Outer;
				else
					System.out.println("Element is : "+a[i][j]);
			}
		}
	}
}