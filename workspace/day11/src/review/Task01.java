package review;

import java.util.Scanner;


//메소드 문제
public class Task01 {
	public static void main(String[] args) {
		Task01 t1 = new Task01();
		//1. 문자열 속의 단어를 공백 기준으로 세기 
		//메소드명 : countWord
		//매개변수 : String str
		//ex) I love java => 3개
		//ex) 안녕하세여 저는 홍길동입니다 java 공부 중입니다 => 6개
		String check = "  안녕하세요 저는 홍길동입니다 java 공부 중입니다 ";
		System.out.println(t1.countWord(check));

		//2. 주민등록번호로 성별 판단 getGender //1,3 = 남자 2,4 => 여자
		String num ="011228-3";
		System.out.println(t1.getGender(num));
		//3. 학생 3명의 수학점수, 국어점수, 영어점수를 받아 평균을 구하여 각 학생별 학점 구하기 getGrade 
		// 95 >= A+, 90 >= A, 85 >= B+, 80 >= B, 75 >= C+, 70 >= C 69 <= F
		System.out.println(t1.getGrade(100,100,100));
		System.out.println(t1.getGrade(55,75,59));
		System.out.println(t1.getGrade(80,90,75));
		
		Scanner sc = new Scanner(System.in);
		int[][] scores = t1.inputScore(3, 3, sc);
		for(int i=0;i<scores.length;i++) {
			String grade = t1.getGrade(scores[i][0],scores[i][1],scores[i][2]);
			System.out.println((i+1)+"번 학생의 학점 : "+grade);
		}
	}
	//1. 문자열 속의 단어를 공백 기준으로 세기
		// 1) 리턴타입 => int
		// 2) 메소드명 => countWord
		// 3) 매개변수 => String str
		// 4) 실행할문장 =>
//						strip 으로 처음, 마지막 공백 제거
//						split(" ") 으로 공백 제거하고 나머지 배열 안에 넣고
//						배열 길이만큼 count++ 
//			
	int countWord(String str) {
		int count =0;
		boolean a = true;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' '&& a) {
				count++;
				a = false;
			}
			else if(str.charAt(i) == ' ') {
				a = true;
			}
		}
//		int count = 0;
//		String delete = str.strip();
//		String[] arr = delete.split(" ");
//		for(int i=0;i<arr.length;i++) {
//			if(str.isEmpty())count=0;
//			else count++;
//		}
		return count;
	}
	
	//2. 주민등록번호로 성별 판단 getGender //1,3 = 남자 2,4 => 여자
			// 1) 리턴타입 => String
			// 2) 메소드명 =>getGender
			// 3) 매개변수 => String num
			// 4) 실행할문장 =>num.charAt(num.length-1) == num의 마지막 자리 찾아서 1,3인지 2,4인지 확인 후 여자/남자 체크
//							xxxxxx-xxxxxx이면 - 찾아서 다음자리로 확인
	String getGender(String num) {
		if(num.length()!=8)return null;
		if(num.charAt(num.length()-1)=='1'||num.charAt(num.length()-1)=='3') {
			return "남자입니다";
		}
		else if(num.charAt(num.length()-1)=='2'||num.charAt(num.length()-1)=='4') {
			return "여자입니다";
		}
		else {
			return "잘못된 입력입니다.";
		}
//		for(int i=0;i<num.length();i++) {
//			if(num.charAt(i)=='-') {
//				if(num.charAt(i+1)=='1'||num.charAt(i+1)=='3') {
//					return "남자";
//				}
//				else if(num.charAt(i+1)=='2'||num.charAt(i+1)=='4') {
//					return "여자";
//				}
//				else {
//					return "잘못된 입력입니다.";
//				}
//			}
			
		
		
	}
	//3. 학생 3명의 수학점수, 국어점수, 영어점수를 받아 평균을 구하여 각 학생별 학점 구하기 getGrade 
	//3명 => 9번 변수 만들어야함, main / 새로만든 클래스일까 
//	 95 >= A+, 90 >= A, 85 >= B+, 80 >= B, 75 >= C+, 70 >= C 69 <= F
//				 1) 리턴타입 => String
//				 2) 메소드명 => getGrade
//				 3) 매개변수 => int math,kor,eng
//				 4) 실행할문장 =>세 값을 더해 3으로 나눈후 검증한다. switch??너무오래걸림 해결책 95 위 숫자를 전부 95로 만들고 95만쓴다/
//						rank 만 알려주면 괜찮은데 rank 말고 숫자도 뽑으면 문제 생김 -> 뽑을때는 avg로 쓴다 ->
//					
	String getGrade(int math,int kor,int eng) {
		int total = math + kor + eng;
		double avg = total/3d;
		String rank = "";
		if(avg>=95)rank="A+";else if(avg>=90)rank="A";else if(avg>=85)rank="B+";else if(avg>=80)rank="B";
		else if(avg>=75)rank="C+";else if(avg>=70)rank="C";else if(avg<=69)rank="F";
		else {
			rank=null;
		}
//		if(avg>=95)avg=95;if(avg>=85)avg=85;if(avg>=80)avg=80;
//		switch((int)avg) {
//		case 95: case 96 : case 97 :case 98 : case 99 : case 100 : rank ="A";break;
//		case 
//		}
		//2차원 배열 이용
		
		return rank;
		
	}
	int[][] inputScore(int studentCnt, int subjectCnt, Scanner sc){
		int[][] scores = new int[studentCnt][subjectCnt];
		
		for(int i = 0;i<studentCnt;i++) {
			System.out.println((i+1)+"번 학생의 점수를 입력하세요!");
			for(int j=0;j<subjectCnt;j++) {
//				System.out.println(i+" "+j);
				String subject = "";
				if(j==0) {
					subject="수학";
				}else if(j==1) {
					subject="국어";
				}else if(j==2) {
					subject="영어";
				}
				System.out.println(subject + "점수 입력 : ");
				scores[i][j] = sc.nextInt();
			}
		}
		return scores;
	}
}

