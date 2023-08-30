class Person{
	int age;
	String name;
	Person(){
		this("none", 0);	//괄호가 있으니까 method //this에 괄호 붙은건 생성자에서만 가능
		//생성자에서 다른 생성자 호출 시 반드시 생성자 맨 처음에 호출해야 함
//		age = 0;
//		name = "none";
	}
	Person(String n, int a){
		age = a;
		name = n;
	}
	Person(String n){
		this(n, 0);
//		age = 0;
//		name = n;
	}
	Person(int a){
		this("none",a);
//		age = a;
//		name = "none";
	}
	Person(Person p){
		name = p.name;
		age = p.age;
	}
	String info() {
		return "이름: " + this.name + ", 나이: "+this.age;
	}
//	String info(Person this) {
//		return "이름: " + this.name + ", 나이: "+this.age;
//	}
}
public class ConstructorTest1 {
	public static void main(String[] args) {
		Person per1 = new Person("홍길동",20);
		Person per2 = new Person();
		per2.name = "고길동";
		per2.age = 30;
		per2.info();	//Person.info(per2)
		Person per3 = new Person("차길동");
		Person per4 = new Person(40);
		Person per5 = new Person(per1);
	}
}