package interfaceTest06;

public class TableFan extends FanAdapter {

	@Override
	public void on() {
		System.out.println("탁자 선풍기를 켭니다");
	}

	@Override
	public void off() {
		System.out.println("탁자 선풍기를 끕니다");
	}



}
