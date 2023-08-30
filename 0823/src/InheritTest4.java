class A{
	//A(){}
	A(int m){}
}

class B extends A{
	int m;
	B(int m){
		super(m); //m이 아니라 숫자 써줘도 에러 안 남
		this.m = m;
	}
}

public class InheritTest4 {

	public static void main(String[] args) {
		
	}
}