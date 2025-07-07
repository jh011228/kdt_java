package mapTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

//1번 : HashMap
public class MapTest01 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		System.out.println(al.toString());
		al.add(1);
		al.add(2);
		al.add(3);
		System.out.println(al); // [ , , ]
		HashMap<String , Integer> map = new HashMap<>();
		System.out.println(map.toString());
		map.put("a",1);
		map.put("b",2);
		map.put("abc",4);
		System.out.println(map); // {key = value}
		System.out.println(map.get("abc")); // 인덱스를 몰라도 key 값으로 해당 value 를 출력할 수 있다
		map.put("f", 10);
		System.out.println(map);
		map.put("d", 4);
		System.out.println(map);
		
		//put(key, 	value) 추가
		//get(key) 	해당 key 의 value 값 반환
		//size()   	해당 요소의 길이 반환
		//keySet()	
		//values()
		System.out.println(map.keySet()); // 반환타입 Set 인터페이스
		Set set = map.keySet();
		System.out.println(set);
		System.out.println(map.values()); // 반환타입 Collection 인터페이스
		Collection co = map.values(); 
		System.out.println(co);
	}
}
