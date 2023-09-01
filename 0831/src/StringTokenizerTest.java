import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
//		StringTokenizer st = new StringTokenizer("apple,banana,orange");
//		while(st.hasMoreTokens()) {
//			System.out.println(st.nextToken());
//		}
		StringTokenizer st = new StringTokenizer("apple#banana$orange,kiwi", "#$,");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}