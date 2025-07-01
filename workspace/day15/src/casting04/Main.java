package casting04;

public class Main {
	public static void main(String[] args) {
		
		//업캐스팅
		Hero ironMan = new IronMan("아이언맨");
		ironMan.superPower();//자식클래스 메소드 호출
		
		Hero hulk = new Hulk("헐크");
		hulk.superPower();
		
		//다운캐스팅
		IronMan ironMan2 = (IronMan)ironMan;
		((Hulk)hulk).say();
		
		
		
	}
}
