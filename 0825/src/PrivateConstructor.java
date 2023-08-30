class MyArray {	//singleton object
	private int[] arr = new int[10];
	private static MyArray myArray;
	private MyArray() {}
	public static MyArray getMyArrayReference() {
		if(myArray == null) {	//null일때만 생성
			myArray = new MyArray();
		}
		return myArray;	//null이 아닐때는 있는거 보여줌
	}
	public void setData(int idx, int data) {
		arr[idx] = data;
	}
	public int getData(int idx) {
		return arr[idx];
	}
//	static -> 객체 생성 없이도 호출할 수 있는 함수
}

public class PrivateConstructor {

	public static void main(String[] args) {
		MyArray ma1 = MyArray.getMyArrayReference();
		MyArray ma2 = MyArray.getMyArrayReference();
		System.out.println(ma1 == ma2);
		ma1.setData(0, 100);
		System.out.println(ma2.getData(0));
	}
}