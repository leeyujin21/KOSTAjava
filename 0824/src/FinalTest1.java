class TempClass{	//static final public 등등 다 제어자
	final int x;	//생성자에서 초기화 하거나 명시적 초기화 하거나 명시적 초기화는 비효율적
	//일반 클래스의 final변수는 명시적 초기화보다 생성자에서 초기화하는게 효율적이다.
	static final int sx = 100;
	TempClass(int x){
		this.x = x;	//instance final은 생성자에서 초기화 한다.
//		sx = x;	//static final은 생성자에서 초기화 할 수 없다.
	}
	void method(int x) {
//		this.x = x;
	}
}

public class FinalTest1 {
	public static void main(String[] args) {
		final int n;
		n = 10;
		System.out.println(n);
		
		new TempClass(20);
		new TempClass(30);
	}
}