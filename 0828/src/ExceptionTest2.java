public class ExceptionTest2 {

	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30, 40, 50, 60 };
		int[] arr2 = { 2, 4, 6, 0, 10 };
		int tot = 0; // sum(arr1[i]/arr2[i])
		int count = arr1.length;
		double avg = 0; // tot/개수
		for (int i = 0; i < arr1.length; i++) {
			try {
				tot += arr1[i] / arr2[i];
				// 상속관계가 큰 catch는 제일 아래에 써준다
				// else if문 처럼 위에부터 실행되기 때문
			} catch (ArithmeticException e) {
				count--;
			} catch (ArrayIndexOutOfBoundsException e) {
				count--;
			} catch (Exception e) {
			} // 괄호가 있는 것만으로도 죽지 않음
				// 최상의 예외 Exception은 맨 마지막에 와야 한다.
		}
		System.out.println(tot);
		System.out.println(tot / (double) count);
		System.out.println("프로그램 종료");
	}
}