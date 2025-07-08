package day20_최장현;

import java.util.ArrayList;
import java.util.Scanner;

public class StuMain {
//	   메인 클래스 : StuMain
//	   조건 
//	   - 학생은 최대 7명까지만 존재하고 7명 학생들의 각 평균점수를 출력하기 => 7번 반복하기?
//	   - ArrayList 객체 사용하여 학생 객체들을 저장할 것! 
//	   - 학생 이름이 동일하면 1명의 학생으로 인식할 것   => hashCode의 값은 나이로 반환 =>
//	   - 점수는 0점~100점 사이의 값이어야한다 => 예외처리
//	   - 예외처리 필수 진행(예외처리 클래스 만들어서 진행할 것!)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> student = new ArrayList<>();
		//7번 반복하기
		for(int i=0;i<7;i++) {
			//1 부터 7까지 번째 학생 입력
			System.out.print(i+1 +"번째 학생 입력 : ");
			try {
				//name 에 입력받은 값 대입 
				String name = sc.next();
				//나이 대입
				System.out.print(name +"의 나이는 : ");
				int age = sc.nextInt();
				//Student 클래스 객체에 name, age 넣어서 생성자로 생성하고
				Student st = new Student(name,age);
				//처음은 그냥 넘어가고 두번째부터 이름 같은거 확인해서 아니면 중복하고 하나빼서 다시입력
				if(!student.contains(st)) {
					student.add(new Student(name, age));
				}
				else {
					System.out.println("이름이 중복됩니다 다시 시도합니다.");
					i--;
				}
				//잡다한 오류 다 처리
			} catch (Exception e) {
				System.err.println("오류 발생");
				i--;
				sc.nextLine();
			}
		}
		//student 객체의 크기만큼 반복
		for(int i=0;i<student.size();i++) {
			//student 안에 name 의 점수 입력
			System.out.println(student.get(i).getName() + "의 점수를 차례대로 입력해 주세요");
			try {
				int math = sc.nextInt();
				int eng = sc.nextInt();
				int kor = sc.nextInt();
				//100보다 크거나 0보다 작으면
				if(math>100||math<0||eng>100||eng<0||kor>100||kor<0) {
					try {
						//오류 발생시키고
						throw new ZeroHunException();
					} catch (ZeroHunException e) {
						//멘트 찍어주고
						e.getStackTrace();
					}finally {
						//오류 발생했으니까 다시 돌아가기
						i--;
						sc.nextLine();
					}
					
				}
				//아니면 학생에 점수 집어넣기
				else {
					student.get(i).addScore(math,eng,kor);									
				}
				
			} catch (Exception e) {
				System.out.println("예기치못한 오류발생 다시 시도합니다");
				i--;
				sc.nextLine();
			}
		}
		sc.close();
		//여기서 평균점수까지 다 뽑기
		System.out.println(student);
	}
}
