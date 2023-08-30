public class InstanceofTest1 {

	public static void main(String[] args) {
		Base b1 = new Base();
		Base b2 = new Derived();
		
		if(b1 instanceof Base) {
			System.out.println("b1 is Base in instance");
		}
		
		if(b1 instanceof Derived) {
			System.out.println("b1 is Derived instance");
		}	//얘는 출력이 안되네
		
		if(b2 instanceof Base) {
			System.out.println("b2 is Base in instance");
		}
		
		if(b2 instanceof Derived) {
			System.out.println("b2 is Derived in instance");
		}
	}

}
