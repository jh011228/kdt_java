package setTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class LottoSet {
	public static void main(String[] args) {
		printLotto();
	}
	
	
	static void printLotto() {
		Random r = new Random();
		HashSet<Integer> lottoNum = new HashSet<>();
		ArrayList<Integer> result = null;
			while(lottoNum.size() < 6 ) {
				lottoNum.add(r.nextInt(45)+1);
			}
		result = new ArrayList<Integer>(lottoNum);
		Collections.sort(result);	
		System.out.println(lottoNum);
		System.out.println(result);
	}
}
