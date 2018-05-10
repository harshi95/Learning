
public class Son extends Grandfather {
	public static void main(String[] args) {
		//inherit the grandfather class properties to son class
		Son s=new Son(); //still able to call the city method with son class
		s.city();
		s.country();
		System.out.println(s.i);
		
	}
	public void sonactivites(){
		System.out.println("add");
	}
	
}
