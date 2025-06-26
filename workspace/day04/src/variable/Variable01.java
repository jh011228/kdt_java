package variable;
// 1번 : 변수 선언
public class Variable01 {

	public static void main(String[] args) {
		//변수 선언
		//자료형
		int number1;  	//정수형 타입의 값을 저장할 수 있는 number1 변수 생성
		boolean isTrue; //논리형 타입의 값을 저장할 수 있는 isTrue 변수 생성
		double number2; //실수형 타입의 값을 저장할 수 있는 number2 변수 생성
		
		//변수에 값 저장(변수를 선언 후 값을 저장해야 한다)
		//변수명 = 값;
		number1 = 10; //10이라는 정수형 값을 number1 변수(저장공간)에 대입한다
		isTrue = true;	//true 라는 논리형 값을 isTrue 변수(저장공간)에 대입한다
		number2 = 3.14;	//3.14 라는 실수형 값을 number2 변수(저장공간)에 대입한다

		System.out.println(10); // 10이라는 정수값을 콘솔창에 출력한다 
		System.out.println(number1); //number1 이라는 변수에 저장된 10이라는 정수형 값을 콘솔창에 출력한다
		System.out.println(number2); //number2 라는 변수에 저장된 3.14 라는 실수형 값을 콘솔창에 출력한다
		System.out.println(isTrue);//isTrue 라는 변수에 저장된 true 라는 논리형 값을 콘솔창에 출력한다
		
		//변수 선언과 동시에 초기화(처음으로 값을 저장하는 것)
		//자료형 변수명 = 값;
		int number3 = 100; //정수를 저장할 수 있는 변수 number3를 선언하고 100이라는 정수형 값으로 초기화했다(저장했다)
		System.out.println(number3);

		int number = 1;
		System.out.println(number);
	}

}
