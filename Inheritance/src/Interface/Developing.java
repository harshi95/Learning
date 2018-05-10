package Interface;

public class Developing implements Bankingclient,Domainclient {
	// a class is required to implement the methods (all) present in Bankingclient
//extra methods can also be added
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developing d=new Developing();// d is responsible for calling all the methods of the Developing class
		d.paycreditcard();
		Bankingclient dr=new Developing();//dr is responsible for calling all the methods of the Bankingclient class
		//this is called run time polymorphism-used in webdriver
		

	}

	@Override
	public void paycreditcard() {
		// TODO Auto-generated method stub
		System.out.println("credit card implemented");
		
	}

	@Override
	public void transferbalance() {
		// TODO Auto-generated method stub
		System.out.println("transfer implemented");
		
	}

	@Override
	public void checkingbalance() {
		// TODO Auto-generated method stub
		System.out.println("balance implemented");
		
	}
	public void login() {
		
		System.out.println();
	}

}
