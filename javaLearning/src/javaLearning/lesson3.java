package javaLearning;

public class lesson3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sum of numbers in an array
		int sum=0;
		int a[]= {2,5,8,7,4};
		for(int i=0;i<a.length;i++) {
			//sum=sum+a[i];
			if(a[i]==7) //position of the value 7 //need to stop when we get results
			{
				System.out.println(i);
				break;//keyword
			}
			
		}
			
		//System.out.println(sum);
	}

}
