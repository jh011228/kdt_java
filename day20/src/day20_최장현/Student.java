package day20_최장현;

public class Student {
//	1. 학생 성적 관리 프로그램(ArrayList)
//	   사용자 입력을 받아 이름과 점수를 저장
//	   클래스명 : Student (toString 오버라이딩, equals 오버라이딩)
//	      필드 : private 접근제한자
//	      이름
//	      나이
//	      수학점수
//	      영어점수
//	      국어점수
//	      
//	      생성자 : 이름과 나이만 받는 생성자
	
	private String name;
	private int age;
	private int mathScore;
	private int engScore;
	private int korScore;

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	@Override
	public String toString() {
		return super.toString();
	}
	
//    메소드 : 점수의 합을 구하고 반환하는 메소드(total)
//    평균점수 구하는 메소드(printAvg)
//    학생의 점수를 저장하여 반환하는 메소드(addScore)
	int total() {
		return mathScore + engScore + korScore;
	}
	
	int printAvg(){
		return (int)(total()/3d);
	}
	
//	int addScore(int mathScore, int engScore, int korScore) {
//		
//	}
	
}
