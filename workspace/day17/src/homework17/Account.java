package homework17;
//2. 은행 계좌 프로그램
//은행계좌 클래스 : Account
//필드 : 잔고 balance
//출금 메소드 : withdraw 매개변수1개 => 잔액보다 출금 금액이 크다면 출금불가 예외 처리 / 현재 잔고는 0원입니다. 
//            출금금액의 0원이 부족하여 출금이 불가합니다. 출력
//입금 메소드 : deposit 매개변수1개 => 잔액에 입급된 금액 추가 후 입금된 금액은 0원입니다. 현재 잔고는 0원입니다 출력
//
//=> 모든 예외처리는 메소드를 사용하는 쪽으로 던지기
public class Account {
	int balance =300;
	
	void withdraw(int money)throws NomoneyException {
		if(money>balance) {
			System.out.println("현재 잔고는 "+balance+"원입니다.");
			System.out.println("출금 금액의 "+(-1*(balance-money))+"원이 부족하여 출금이 불가합니다");
			throw new NomoneyException();
		}
		else {
			balance -= money;
			System.out.println("인출 완료 현재 잔액은 "+balance+"원입니다.");
		}
	}
	void deposit(int money) {
		balance += money;
		System.out.println("입금된 금액은 "+money+"원 입니다.");
		System.out.println("현재 잔고는 "+balance+"원 입니다.");
	}
}
