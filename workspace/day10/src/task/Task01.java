package task;
//메소드 문제
public class Task01 {
	public static void main(String[] args) {
		Task01 t1 = new Task01();
		//1. 문자열 속의 단어를 공백 기준으로 세기 
		//메소드명 : countWord
		//매개변수 : String str
		//ex) I love java => 3개
		//ex) 안녕하세여 저는 홍길동입니다 java 공부 중입니다 => 6개
		
		//2. 주민등록번호로 성별 판단 getGender //1,3 = 남자 2,4 => 여자
		//3. 학생 3명의 수학점수, 국어점수, 영어점수를 받아 평균을 구하여 각 학생별 학점 구하기 getGrade 
		// 95 >= A+, 90 >= A, 85 >= B+, 80 >= B, 75 >= C+, 70 >= C 69 <= F
		String check = "안녕하세요 저는 홍길동입니다 java 공부 중입니다";
		System.out.println(t1.countWord(check));
		String num ="011228-3";
		System.out.println(t1.getGender(num));
	}
	//1. 문자열 속의 단어를 공백 기준으로 세기 
		// 1) 리턴타입 => String
		// 2) 메소드명 => checkSum
		// 3) 매개변수 => int num
		// 4) 실행할문장 =>num 2로 나눠서 나머지가 0이면 짝수 아니면 홀수 return
	int countWord(String str) {
		int count =1;
		if(str.length()==0)return 0;
		if(str.charAt(0)==' ')count--;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				count++;
			}
		}
		return count;
	}
	//2. 주민등록번호로 성별 판단 getGender //1,3 = 남자 2,4 => 여자
			// 1) 리턴타입 => String
			// 2) 메소드명 => checkSum
			// 3) 매개변수 => int num
			// 4) 실행할문장 =>num 2로 나눠서 나머지가 0이면 짝수 아니면 홀수 return
	String getGender(String num) {
		if(num.length()!=8)return null;
		if(num.charAt(num.length()-1)=='1'||num.charAt(num.length()-1)=='3') {
			return "남자";
		}
		else if(num.charAt(num.length()-1)=='2'||num.charAt(num.length()-1)=='4') {
			return "여자";
		}
		else {
			return "잘못된 입력입니다.";
		}
	}
	//3. 학생 3명의 수학점수, 국어점수, 영어점수를 받아 평균을 구하여 각 학생별 학점 구하기 getGrade 
	// 95 >= A+, 90 >= A, 85 >= B+, 80 >= B, 75 >= C+, 70 >= C 69 <= F
				// 1) 리턴타입 => String
				// 2) 메소드명 => checkSum
				// 3) 매개변수 => int num
				// 4) 실행할문장 =>num 2로 나눠서 나머지가 0이면 짝수 아니면 홀수 return
//	String getGrade(int math,int kor,int eng) {
//		int total = math + kor + eng;
//		double avg = total/3d;
//		
//	}
}

