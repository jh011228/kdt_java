package interfaceTest06;
//23번 : 어댑터클래스(메인클래스)
public interface Fan {
	int MAX_STRANGTH = 3;
	int MIN_STRANGTH = 0;
	
	void on();
	void off();
	void turbo();
	
	
	//구현 클래스
	//CeilingFan 클래스
	//메소드 천장선풍기를 켭니다, 끕니다, 비워두기
	//TableFan
	//탁자 선풍기를 켭니다, 끕니다, 비워두기
	//TowerFan
	//타워 선풍기를 켭니다, 끕니다, 타워선풍기를 터보모드로 전환합니다
}
