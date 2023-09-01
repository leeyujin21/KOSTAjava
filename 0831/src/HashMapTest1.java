import java.util.HashMap;
import java.util.Map;

public class HashMapTest1 {
	public static void main(String[] args) {
		Map<String, Integer> hmap = new HashMap<>();
		hmap.put("1001", 35); // 데이터 삽입(key, value)
		if (hmap.containsKey("1001") == false) { // 동일키가 있는지 확인하고 없을때 넣어라
			hmap.put("1001", 40);
		}
		hmap.put("1002", 20);
		hmap.put("1003", 33);
		hmap.put("1004", 27);
		Integer value = hmap.get("1001"); // key로 value 조회
		System.out.println(value);
		System.out.println("=====================");
		for (Integer n : hmap.values()) { // value 전체 목록 조회
			System.out.println(n);
		}

		System.out.println("=====================");
		for (String k : hmap.keySet()) { // key 전체 목록을 통해
//			System.out.println(hmap.get(k)); // value조회
			System.out.println(String.format("key: %s, value: %d", k, hmap.get(k)));
		}
		hmap.remove("1004");
		System.out.println("=====================");
		for (Map.Entry<String, Integer> entry : hmap.entrySet()) {
			System.out.println(String.format("key: %s, value: %d", entry.getKey(), entry.getValue()));
		}
	}
}