class Person {
	String name;
	int age;

	String info() {
//		return String.format("이름: %s\n나이: %d", name, age);
		return "이름: " + name + "\n" + "나이: " + age;
	}
}

public class ClassTest2 {
	public static void main(String[] args) {
		Person per1 = new Person();
		per1.name = "홍길동";
		per1.age = 20;
		System.out.println(per1.info()); // info method 호출

		Person[] parr = new Person[5];
		parr[0] = new Person();
		parr[1] = new Person();
		parr[2] = new Person();
		parr[3] = new Person();
		parr[4] = new Person();
	}
}