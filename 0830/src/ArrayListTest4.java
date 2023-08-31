import java.util.ArrayList;
import java.util.List;

public class ArrayListTest4 {
	static void print(List<Integer> list) {
		for (Integer n : list) {
			System.out.print(n + ",");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>(10);
		list1.add(5);
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);

		List<Integer> list2 = list1.subList(1, 4);
		print(list1);
		print(list2);
		System.out.println(list1.containsAll(list2));
		System.out.println("==============");
		list1.retainAll(list2); // list2만 남기고 다 삭제
		print(list1);
		System.out.println("==============");
		list1.add(0, 6); // 0번째에 6 삽입
		print(list1);
		System.out.println("==============");
		list1.set(0, 7); // 0번째 데이터를 7로 변경
		print(list1);
		System.out.println("==============");
		list1.add(7);
		print(list1);
		System.out.println("==============");
		list1.remove(new Integer(7));
		// 특정 데이터를 삭제할 수 있으나 다 삭제하는 것이 아니고,
		// 제일 앞에 있는 특정 데이터를 삭제함
		print(list1);
	}
}