package constructorBasic01;
//1번 : 생성자 기초
public class TvMain {
	public static void main(String[] args) {
		Tv myTv = new Tv(10,5,"black","LG");
		
		System.out.println(myTv.brand+" tv 를 조작합니다");
		System.out.println(myTv.color+" 색상 tv의 채널은 "+myTv.ch);
//		myTv.nextChannel();
//		myTv.powerOnOff();
//		myTv.nextChannel();
//		myTv.decreaseVolume();
		
//		Tv myTv2 = new Tv();
//		myTv2.ch=100;
//		myTv2.color="red";
//		myTv2.vol=50;
//		myTv2.brand="삼성";
//		System.out.println(myTv2.brand+" tv 를 조작합니다");
//		System.out.println(myTv2.power);
//		myTv2.previousChannel();
//		myTv2.powerOnOff();
//		myTv2.previousChannel();
		
	}
}
