public class CaseTest {

	public static void main(String[] args) {
		byte bt = 10;
		int i = bt;

		byte bt2 = (byte) i; // 똑같이 정수형태더라도 자동형변환은 해주지 않음

		float f = i;
		int i2 = (int) f; // 소수점 잘림

		double d = f;
		float f2 = (float) d;
	}

}