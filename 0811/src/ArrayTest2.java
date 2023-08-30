public class ArrayTest2 {

	public static void main(String[] args) {
//		int [] narr1 = new int[] {1,2,3,4,5};  	// 배열 초기화 1
		int [] narr1;
		narr1 = new int[] {1,2,3,4,5};
		
		int [] narr2 = {1,2,3,4,5}; 			// 배열 초기화 2
//		int [] narr2;
//		narr2 = {1,2,3,4,5}	//불가능 반드시 new int[] 해줘야함
		//변수 선언과 초기화를 따로 할 경우 new int[]를 생략할 수 없다
		
		int n = narr1[2];
	}

}
