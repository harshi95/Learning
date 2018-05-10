
public class code1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("started java");
		int a=2;
		int b=3;
		int Sum=a+b;
		//System.out.println(Sum);
		System.out.println("Sum is " + Sum);
//call methods form code2
code2 m=new code2();
System.out.println(m.ValidateHeader()); //calling the method form other class by creating an object in the class
	}

}
