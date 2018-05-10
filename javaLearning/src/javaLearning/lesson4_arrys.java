package javaLearning;

public class lesson4_arrys {
	public static void main(String[] args) {
		
		//int a;
		//a=4;
		//a container which stores multiple values of the same data type
		int a[]=new int[5]; //declares an array and allocates memory for the values
		a[0]=2;
		a[1]=1;
		a[2]=3;
		a[3]=5;
		a[4]=12;
		int b[]= {1,2,3,4,5,6,7};
		for (int i=0;i<b.length;i++) {
			System.out.println(b[i]);
			
		}
		
		for(int i=0;i<a.length;i++) {
			
			System.out.println(a[i]);//retrive values present in the array
		}
		
		
	}

}
