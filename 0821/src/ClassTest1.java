public class ClassTest1 {
	public static void main(String[] args) {
		int n;
		double d;
		
		int[] arr = new int[3];

		Student stu1 = new Student();
		//stu1은 객체를 담고 있는 레퍼런스
		Student stu2;
		
		stu1.name = "홍길동";
		stu1.address = "서울시 금천구";
		stu1.grade = 4;
		stu1.num = 10001;
		
		System.out.println(stu1.info());
	}
}