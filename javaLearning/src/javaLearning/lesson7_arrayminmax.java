package javaLearning;

public class lesson7_arrayminmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int abc[][]= {{2,4,5},{3,0,7},{1,2,9}};
		int min=0;
		int mincoloumn=0;
		int k=0;
		for (int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if (abc[i][j]<min)
				{
					min=abc[i][j];
					mincoloumn=j;
					
				}
			}
		}
		int max=abc[0][mincoloumn];
		while(k<3)
		{
			if (abc[k][mincoloumn])
			{
				max=abc[k][mincolu]
			}
		}
		

	}

}
