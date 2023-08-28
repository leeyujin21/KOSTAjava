public class VariableTest {

	public static void main(String[] args) {
		char ch = 'A'; // char: 자료형, ch: 변수형,  =: 대입연산자, 'A': 리터럴 데이터
		char up7;
		up7 = '7';
		ch = 'B';
		System.out.println(ch);
		byte bt = 127; //-128~127
		int i = 10;
		float f = 1.25f;
		double d = 3.14;
		boolean b = true;
		String name = "stiven";  //큰 따옴표 -> 문자열
		
		final double pi = 3.14;
		// pi = 3.141;  // final 변수는 변경 불가능한 상수
	}

}