public class ArrayTest7 {
	public static void main(String[] args) {
		int[][] narr = { { 10, 20, 30, 40 }, { 50, 60, 70, 80 }, { 90, 100, 110, 120 } };

		int[][] result = new int[narr.length + 1][narr[0].length + 1];

		for (int i = 0; i < narr.length; i++) {	//행의 개수만큼 반복
			for (int j = 0; j < narr[i].length; j++) {	//열의 개수만큼 반복
				result[i][j] = narr[i][j];
				result[i][narr[i].length] += narr[i][j];	// 마지막 열에 누적
				result[narr.length][j] += narr[i][j];
				result[narr.length][narr[i].length] += narr[i][j];
				}
		}
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.printf("%4d", result[i][j]);
			}
			System.out.println();
		}
	}
}
//  10  20  30  40  100
//  50  60  70  80  260
//  90 100 110 120  420