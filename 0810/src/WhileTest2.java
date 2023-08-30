
public class WhileTest2 {

	public static void main(String[] args) {
		int dan, i=1;
		while (i<=9) {
			dan=2;
			while (dan<=9) {
				System.out.print(String.format("%dx%d=%2d\t", dan, i, dan*i));
			}
			System.out.println();
			i++;
		}

	}

}
