package methodTest;

import java.util.Arrays;
import java.util.Scanner;

public class MethodTask {
	public static void main(String[] args) {
//		//1. 음수를 양수로, 양수를 음수로 바꿔주는 메소드
//		//changeSign 매개 리턴 o
		MethodTask mt = new MethodTask();
		System.out.println(mt.changeSign(100));
		System.out.println(mt.changeSign(-100));
		//2. 이름 정수 받아와서 정수만큼 이름 출력
		//printName 매개 리턴 o 
		System.out.println(mt.printName(10,"짱구"));
		//3. 10 이하 숫자 1로 10 초과 숫자 100으로 
		//changeNumber 매개 리턴 o
		System.out.println(mt.changeNumber(10));
		System.out.println(mt.changeNumber(11));
		//4. 5개의 정수 중 평균 반환 메소드
		//getAvg 매개o(배열) 리턴 o
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.print((i+1)+"번 정수 : ");
			arr[i] = sc.nextInt();
		}
		System.out.printf("평균값 : %.1f",mt.getAvg(arr));
		System.out.println();
//		//5. 정수 배열 중 최대값 최소값 출력 메소드
//		//printMinMax 매개 변수 o(배열), 리턴 x
		mt.printMinMax(arr);
//		6. 소-> 대문자 대문자-> 소문자 바꾼꾸는 메소드
//		BanAnA -> bANaNa
//		 changeCase 매개변수 반환값 자유 형변환하셈
		mt.changeCase("BanAnA");
		mt.changeCase("bANaNa");
		System.out.println();
		//7. 아이디와 비밀번호 입력받아 로그인하기
		//login 매개 o 리턴 o (리턴타입 boolean)
		//main 메소드에서 id가 admin이고 비밀번호가 1234이면 관리자님 환영합니다 출력
	    //둘중하나라도 틀리면 다시 확인하세요 출력	
		sc.nextLine();
		System.out.print("아이디 입력 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 입력 : ");
		String password = sc.nextLine();
		
		if(mt.login(id, password)) {
			System.out.println("관리자님 환영합니다.");
		}
		else {
			System.out.println("다시 확인하세요");
		}
	}
	//1) 기능을 생각한다(양수면 음수로 음수면 양수로)
		//	반환타입 메소드명(자료형 매개변수){ }
		//2) 반환타입이 생각나지 않는다면 우선 void 를 작성한다
		//	void 메소드명(){}
		//3) 메소드명을 생각한다(기능에 알맞은 이름으로, 가능하면 동사로)
		//4) 매개변수를 생각한다(매개변수 2개)
		//5) 실행할 문장을 작성한다
		//6) 리턴값을 생각한다
		//7) 리턴타입을 리턴값에 맞는 타입으로 변경한다
	int changeSign(int num) {
		return num*-1;
	}
	//1) 기능을 생각한다(name을 num 번 반복해서 출력)
		//	반환타입 메소드명(자료형 매개변수){ }
		//2) 반환타입이 생각나지 않는다면 우선 void 를 작성한다
		//	void 메소드명(){}

		//3) 메소드명을 생각한다(printName)
		//4) 매개변수를 생각한다(매개변수 2개)
		//5) 실행할 문장을 작성한다
		//6) 리턴값을 생각한다
		//7) 리턴타입을 리턴값에 맞는 타입으로 변경한다
	String printName(int num,String name) {
		for(int i=0;i<num;i++) {
			System.out.print(name+" ");
		};
		System.out.println();
		return "횟수 : "+num+", 이름 : "+name;
	}
	//1) 기능을 생각한다(10이하는 1로, 10초과는 100으로 바꾼다)
		//	반환타입 메소드명(자료형 매개변수){ }
		//2) 반환타입이 생각나지 않는다면 우선 void 를 작성한다
		//	void 메소드명(){}

		//3) 메소드명을 생각한다(기능에 알맞은 이름으로, 가능하면 동사로)
		//4) 매개변수를 생각한다(매개변수 2개)
		//5) 실행할 문장을 작성한다
		//6) 리턴값을 생각한다
		//7) 리턴타입을 리턴값에 맞는 타입으로 변경한다
	int changeNumber(int num) {
//		if(num<=10) {
//			num = 1;
//		}
//		else if(num>10) {
//			num = 100;
//		}
		return num<=10 ? 1 : 100;
	}
	//1) 기능을 생각한다(배열을 받아서 정렬하고 가운데 리턴)
		//	반환타입 메소드명(자료형 매개변수){ }
		//2) 반환타입이 생각나지 않는다면 우선 void 를 작성한다
		//	void 메소드명(){}

		//3) 메소드명을 생각한다(기능에 알맞은 이름으로, 가능하면 동사로)
		//4) 매개변수를 생각한다(매개변수 2개)
		//5) 실행할 문장을 작성한다
		//6) 리턴값을 생각한다
		//7) 리턴타입을 리턴값에 맞는 타입으로 변경한다
	double getAvg(int[] arr) {
		int total =0;
		for(int num : arr) {
			total +=num;
		}
		return total/(double)arr.length;
	}
	//1) 기능을 생각한다(최소값, 최대값을 0, 마지막 인덱스로 적어 확인)
		//	반환타입 메소드명(자료형 매개변수){ }
		//2) 반환타입이 생각나지 않는다면 우선 void 를 작성한다
		//	void 메소드명(){}

		//3) 메소드명을 생각한다(기능에 알맞은 이름으로, 가능하면 동사로=>printMinMax)
		//4) 매개변수를 생각한다(매개변수 2개)
		//5) 실행할 문장을 작성한다
		//6) 리턴값을 생각한다
		//7) 리턴타입을 리턴값에 맞는 타입으로 변경한다
	void printMinMax(int[] arr) {
		Arrays.sort(arr);
		System.out.println("최소값 : "+arr[0]);
		System.out.println("최대값 : "+arr[arr.length-1]);
	}
	//6. 소-> 대문자 대문자-> 소문자 바꾼꾸는 메소드

	//1) 기능을 생각한다(소문자를 대문자로,  대문자를 소문자로 변경)
	//	반환타입 메소드명(자료형 매개변수){}
	//2) 반환타입이 생각나지 않는다면 우선 void 를 작성한다
	//	void 메소드명(){}
	//3) 메소드명을 생각한다(기능에 알맞은 이름으로, 가능하면 동사로 => changeCase)
	//4) 매개변수를 생각한다(매개변수 1개)
	//5) 실행할 문장을 작성한다
	//5-1 반복문으로 word 길이만큼 반복
	//5-2 word 한글자한글자 나눠서 대문자면 소문자로 소문자면 대문자로 변경
	//6) 리턴값을 생각한다 x
	//7) 리턴타입을 리턴값에 맞는 타입으로 변경한다 x
	void changeCase(String word) {
		for(int i=0;i<word.length();i++) {
			
			if(word.charAt(i)>='a') {
				int a = word.charAt(i)-'a'+'A';
			
				System.out.print((char)a);
			}
			if(word.charAt(i)<'a') {
				int a = word.charAt(i)-'A'+'a';
				System.out.print((char)a);
			}
		}
		System.out.println();
	}
	//1) 기능을 생각한다(아이디,비밀번호 검사)
	//	boolean 메소드명(자료형 매개변수){}
	//3) 메소드명을 생각한다(기능에 알맞은 이름으로, 가능하면 동사로=>login)
	//4) 매개변수를 생각한다(매개변수 2개) id,password
	//5) 실행할 문장을 작성한다 return id.equals("admin") && password.equals("1234");
	//6) 리턴값을 생각한다
	//7) 리턴타입을 리턴값에 맞는 타입으로 변경한다
	//7. 아이디와 비밀번호 입력받아 로그인하기
	boolean login(String id,String password) {
		return (id.equals("admin")&&password.equals("1234"));
	}
}
