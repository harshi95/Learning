package javaLearning;

public class lesson6_arrayminnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int abc[][]= {{2,4,5},{1,4,5}};
		int min=abc[0][0];
		for(int i=0;i<2;i++) {
			
			for(int j=0;j<3;j++) {
				if (abc[i][j]<min)
				{
					min=abc[i][j];
				}
				
				
			}
		}
System.out.println(min);
	}

}
