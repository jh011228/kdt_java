package switchTest;
//14번 : switch문
public class SwitchTest01 {
	public static void main(String[] args) {
		
//		String animal = "개";
//		
//		switch (animal) {
//			case "곰":
//				System.out.println("선택한 동물은 곰입니다");
//				break;
//			case "양":
//				System.out.println("선택한 동물은 양입니다");
//				break;
//			case "개":
//				System.out.println("선택한 동물은 개입니다");
//				break;
//				
//			default:
//				System.out.println("선택한 동물은 없습니다");
//				break;	
//		}
		switch(30) {
		case 10 : case 9 :
			System.out.println("10입니다");
			break;
		case 100 :
			System.out.println("100입니다");
			break;
		case 30 :
			System.out.println("30입니다");
			break;
			default :
				System.out.println("case에 값이 없습니다");
				break;
		}
		
		
		
		
	}

}
