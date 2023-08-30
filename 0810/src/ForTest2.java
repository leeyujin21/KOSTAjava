public class ForTest2 {

	public static void main(String[] args) {
		int i;
		for (i = 1; i<=9; i++) {
			for (int dan = 2; dan<=9; dan++) {
				System.out.print(String.format("%dx%d=%2d\t", dan, i, dan*i));
			}
			System.out.println();
		}
	}

}
