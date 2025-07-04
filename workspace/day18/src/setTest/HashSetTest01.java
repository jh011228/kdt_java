package setTest;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest01 {
	public static void main(String[] args) {
		HashSet<String> animalSet = new HashSet<>();
		
		
		animalSet.add("하마");
		animalSet.add("코알라");
		animalSet.add("치타");
		animalSet.add("호랑이");
		animalSet.add("기린");

		System.out.println(animalSet);
		System.out.println(animalSet.toString());
		
		//Iterator : 반복자
		Iterator<String> animalIter = animalSet.iterator();
		while(animalIter.hasNext()) {
			System.out.println(animalIter.next());
		}
		
		
		
		
	}
}
