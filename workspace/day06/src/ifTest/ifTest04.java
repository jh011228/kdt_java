package ifTest;

//13 : if~ if 문, if~else if if 문 차이 / if 문 중첩 
public class ifTest04 {
	public static void main(String[] args) {
		//if~if 문 : 위 조건식이 true 라도 아래 if 문 조건식 확인
		int num = 10, grade = 100;
//		if(num>5){
//			System.out.println("num은 5보다 큽니다");
//		}
//		if(num>3) {
//			System.out.println("num은 3보다 큽니다");
//		}
//		
		// if~else if 문 : 위 조건식이 true 면 아래 조건식 무시 
		if(num>5){
			System.out.println("num은 5보다 큽니다");
		}
		else if(num>3) {
			System.out.println("num은 3보다 큽니다");
		}
		
		
		//if 문 중첩
		// 90점 이상 = A, 100점은 만점
		
//		if(grade==100) {
//			System.out.println("만점으로 A");
//		}
//		else if(grade>=90) {
//			System.out.println("A");
//		}
//			
		if(grade>=90) {
			if(grade ==100) {
				System.out.println("만점으로 A");
			}
			else {
				System.out.println("A");
			}
		}
		
	}
}
