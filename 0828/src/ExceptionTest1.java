public class ExceptionTest1 {
	public static void main(String[] args) {
		String str = "hong"; // 문자열은 주로 null 보다는 빈문자열인 ""로 초기화 한다
		// 에러타입: java.lang.NullPointerException
		int[] arr = new int[5];
		try {
			System.out.println(str.toString());
			// toString: 문자열 출력해줌 -> null일 때는 에러(모든 클래스가 갖고 있음)
			// 다른 타입일 경우에는 클래스 내용을 문자로 바꿔서 출력
			for (int i = 0; i <= arr.length; i++) {
				arr[i] = i * 10;
			}
		} catch (NullPointerException e) {
			// e.printStackTrace(); // 왜 에러가 뜨는지 알려줌
			System.out.println(e.getMessage());
			// 에러 이유를 짧은 메시지로 보여줌
		} catch (ArrayIndexOutOfBoundsException e) {
			// e.printStackTrace(); // 왜 에러가 뜨는지 알려줌
			System.out.println(e.getMessage());
			// 에러 이유를 짧은 메시지로 보여줌
		}
		System.out.println("종료");
	}
}