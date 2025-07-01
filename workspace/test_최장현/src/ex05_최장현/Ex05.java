package ex05_최장현;

import java.util.Scanner;

//문제 5. 아래 요구사항에 따라 학생 정보를 관리하는 자바 프로그램을 작성하시오.(30점)
//[요구사항]
//(1) Major 열거형(enum) 정의
//상수명 	한글 전공명
//COMPUTER_SCIENCE	컴퓨터공학
//CYBER_SECURITY	정보보안학
//ARTIFICIAL_INTELLIGENCE	인공지능학
//
//각 상수는 한글 전공명을 저장하는 final private koreanName 필드를 갖는다.
//생성자를 통해 초기화하며, 한글명을 반환하는 getKoreanName() 메소드를 작성할 것
//
//(2) Person 클래스 정의
//필드
//    String name
//생성자
//    이름을 매개변수로 받아 초기화
//메소드
//    getName() — 이름 반환
//
//(3) Student 클래스 정의
//Person 클래스를 상속받는다.
//필드
//    int javaScore
//    int dbmsScore
//    int htmlScore
//    Major major
//생성자
//    이름, 전공, 세 과목 점수를 받아 초기화(부모생성자 사용)
//메소드
//    getTotalScore() – 총점 반환
//    getAverageScore() – 정수 평균 반환
//    getMajor() – 전공 반환
//
//(4) Main 클래스 작성
//사용자로부터 학생 수를 입력받는다.
//각 학생에 대해 다음 정보를 입력받는다.
//    이름, 전공 (COMPUTER_SCIENCE / CYBER_SECURITY / ARTIFICIAL_INTELLIGENCE), Java, DBMS, HTML 점수
//
//3명의 학생 점수를 입력받고 결과가 아래와 동일하게 나올 수 있도록 한다.
//1.스캐너 만들기
//2. Student 클래스로 된 배열 만들기
//3. 몇명 입력할지 정하는 문구 출력하기
//4. 입력받기
//5. 반복문으로 이룸,전공,java점수,DBMS점수,HTML점수 입력받아 지역변수에 넣고 배열 안에 객체로 넣기
//6. 성적 출력 반복문으로 num 번만큼 뽑기
public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.print("몇 명의 학생을 입력하시겠습니까? ");
		int num = sc.nextInt();
		Student[] s = new Student[num];
		for(int i=0;i<num;i++) {
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("전공 (COMPUTER_SCIENCE / CYBER_SECURITY / ARTIFICIAL_INTELLIGENCE) : ");
			String major = sc.next();
			System.out.print("Java 점수 : ");
			int jScore = sc.nextInt();
			System.out.print("DBMS 점수 : ");
			int dbScore = sc.nextInt();
			System.out.print("HTML 점수 : ");
			int htScore = sc.nextInt();
			if(major.equals("COMPUTER_SCIENCE")) {
				major = "컴퓨터공학";
			}else if(major.equals("CYBER_SECURITY")) {
				major = "정보보안학";
			}else if(major.equals("ARTIFICIAL_INTELLIGENCE")) {
				major = "인공지능학";
			}else {
				major = "학과 없음";
			}
			s[i] = new Student(name, jScore, dbScore, htScore,major);
		}
		System.out.println("===== 성적출력 =====");
		for(int i=0;i<num;i++) {
			System.out.println(s[i].name+"의 전공은 "+s[i].major+"입니다.");
			System.out.println("총점 : "+s[i].getTotalScore()+"점");
			System.out.println("평균 : "+s[i].getAverageScore()+"점");
			
		}
		sc.close();
	}
}
//(2) Person 클래스 정의
//필드
//	    String name
//생성자
//	    이름을 매개변수로 받아 초기화
//메소드
//	    getName() — 이름 반환
class Person{
	String name;

	public Person(String name) {
		this.name = name;
	}
	String getName() {
		return name;
	}
	//(3) Student 클래스 정의
	//Person 클래스를 상속받는다.
	//필드
//	    int javaScore
//	    int dbmsScore
//	    int htmlScore
//	    String major
	//생성자
//	    이름, 전공, 세 과목 점수를 받아 초기화(부모생성자 사용)
	//
}
class Student extends Person{
	int javaScore;
	int dbmsScore;
	int htmlScore;
//	Major major;
	String major;
	
	public Student(String name, int javaScore, int dbmsScore, int htmlScore, String major) {
		super(name);
		this.javaScore = javaScore;
		this.dbmsScore = dbmsScore;
		this.htmlScore = htmlScore;
		this.major = major;
	}
	//메소드
//    getTotalScore() – 총점 반환 - 필드 3개 다 더하기
//    getAverageScore() – 정수 평균 반환 - 필드 3개 / 3d 를 int 로 강제형변환 
//    getMajor() – 전공 반환
	int getTotalScore() {
		return javaScore+dbmsScore+htmlScore;
	}
	int getAverageScore() {
		return (int)(getTotalScore()/3d);
	}
	String getMajor() {
		return major;
	}
	
}
	
