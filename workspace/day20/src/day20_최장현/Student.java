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

	public int getMathScore() {
		return mathScore;
	}
	public String getName() {
		return name;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	public int getEngScore() {
		return engScore;
	}
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	public int getKorScore() {
		return korScore;
	}
	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}if(obj instanceof Student) {
			String other = ((Student)obj).name;
			return this.name.equals(other);
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		return Integer.hashCode(age);
	}
	@Override
	public String toString() {
		return " 이름 : "+this.name + ", 나이 : "+this.age + ", 수학점수 : "+this.mathScore 
				+", 영어점수 : "+this.engScore+", 국어점수 : "+this.korScore+" , 평균 : "+printAvg()+"\n";
	}
	
//    메소드 : 점수의 합을 구하고 반환하는 메소드(total)
//    평균점수 구하는 메소드(printAvg)
//    학생의 점수를 저장하여 반환하는 메소드(addScore)
	public int total() {
		return mathScore + engScore + korScore;
	}
	
	public int printAvg(){
		return (int)(total()/3d);
	}
	
	String addScore(int mathScore, int engScore, int korScore) {
		setMathScore(mathScore);
		setEngScore(engScore);
		setKorScore(korScore);
		return "수학점수 : "+getMathScore() +" 영어 점수 : "+ getEngScore() + " 국어 점수 : "+getKorScore();
	}
	public String setName(String name) {
		return name;
	}
	
}
