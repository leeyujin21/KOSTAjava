class Number {
	// static이 더 광범위함
	int inum;
	static int snum;

	void imethod() {
		inum = 10;
		snum++; // instance method에서는 static 변수 사용 가능
		imethod2();	// instance method에서는 static 함수든 변수든 다 사용 가능
		smethod();
	}

	void imethod2() {
		
	}

	static void smethod() {
		snum = 100;
//		inum=10;	static method에서는 instance 변수 사용 불가
		smethod2();
//		imethod();	//static method에서는 instance method 호출 불가
	}
	static void smethod2() {
		
	}
}

public class StaticTest1 {
	public static void main(String[] args) {
		// static(class)변수는 객체 생성 없이 사용 가능(프로그램 시작시 이미 변수가 생성되었기 때문)
		System.out.println(Number.snum);
		Number.smethod();
		// static메소드도 호출없이 클래식명만으로도 가능

//		System.out.println(Number.inum);	instance 변수는 객체 생성해야만 사용 가능
//		Number.imehtod();	//instance 메소드는 반드시 객체 생성 후 호출 가능

		Number n = new Number(); // new하는 시점에 생김
		System.out.println(n.inum);
		System.out.println(n.snum); // static 변수는 레퍼런스를 통해서도 접근 가능
		n.imethod();
		n.smethod();
	}
}