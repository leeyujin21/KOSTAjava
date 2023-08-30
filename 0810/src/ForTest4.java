
public class ForTest4 {
	public static void main(String []args) {
		int cnt = 5;
//		for(int i=0; i<cnt; i++) {
//			for(int j=0; j<cnt-i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		for (int i=0; i<cnt; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<cnt-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
