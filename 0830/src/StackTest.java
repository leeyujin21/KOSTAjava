import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack stack = new Stack(); // LIFO
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);
		stack.push(500);

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		// stack처럼 쓰기 위해서는 pop()

//		for(Object n : stack) {
//			System.out.println(n);
//		} //list의 기능
	}
}