public class Student {
	String name;
	String address;
	int grade;
	int num;
	
	String info(){
		return String.format("이름: %s\n주소: %s\n학년: %d\n학번: %d\n\n",
				name, address, grade, num);
		}
}
