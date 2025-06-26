package random;

public class Level {
	int levelSetting(int level) {
		if(level>=1 && level<=5) {
			return level*20;
		}
		else {
			System.out.println("잘못된 레벨설정입니다.");
			return 0;
		}
	}
}
