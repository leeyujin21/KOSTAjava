public class WhileTest1 {

	public static void main(String[] args) {
		int dan = 2, i = 1;
		while (i <= 9) {
			System.out.println(String.format("%dx%dx=%2d", dan, i, dan * i));
			i++;
		}
	}

}
