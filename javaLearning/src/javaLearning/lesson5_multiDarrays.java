package javaLearning;

public class lesson5_multiDarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a[][]=new int [3][4];
 a[0][0]=1;
 a[0][1]=1;
 a[1][2]=1;
 a[1][1]=1;
 System.out.println(a[1][2]);
 int b[][]= {{2,3,4,},{3,4,5}};
 for (int i=0;i<2;i++) { //stands for row
	 
	 for(int j=0;j<3;j++) //stands for coloumn
	 {
		 System.out.println(a[i][j]);
	 }
 }
 
 
 
		 
	}

}
