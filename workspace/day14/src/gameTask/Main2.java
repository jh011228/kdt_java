package gameTask;

import java.util.Random;
import java.util.Scanner;

public class Main2 {
   public static void main(String[] args) {
	   // ++ 적을 만들어서 선택해서 공격하게해라
//      사용자에게 캐릭터를 선택하게 하고 1. 마법사, 2. 전사, 3. 로그
//      선택한 캐릭터로 반복적으로 메뉴 실행
//      1. 기본공격, 2. 스킬공격, 3. 특수공격, 4. 종료
	   
      Scanner sc = new Scanner(System.in);
      int choice;
      Character[] job = new Character[4];
      while(true) {
         System.out.println("캐릭터를 선택하세요.\n" 
               + "1. 마법사\n"
               + "2. 전사\n"
               + "3. 로그\n"
               + "입력 : ");
         choice = sc.nextInt();
         sc.nextLine();
         if(choice == 1) {
            job[choice] = new Wizard();
            break;
         }else if(choice == 2) {
            job[choice] = new Warrior();
            break;
         }else if(choice == 3) {
            job[choice] = new Rogue();
            break;
         }else {
            System.out.println("번호를 다시 입력하세요");
         }
      }
      Random r = new Random();
      Monster monster = new Monster("큰 쥐",100, 10, 2, 5, 20);
      String msg = "\n1. 일반공격\n2. 스킬공격\n3. 특수공격\n4. 종료\n번호입력 : ";
      while (true) {
    	 job[choice].showStatus();
    	 monster.showStatus();
         System.out.println(msg);
         int select = sc.nextInt();
         switch(select) {
         case 1:
            job[choice].normalAttack();
            monster.hp -= job[choice].nomalDmg;
            break;
         case 2:
        	 job[choice].skillAttack();
        	 monster.hp -= job[choice].skillDmg;
            break;
         case 3:
        		 job[choice].specialAttack();   
        		 monster.hp -= job[choice].specialDmg;
            break;
         case 4:
            System.out.println("게임종료");
            sc.close();
            return;
         default:
            System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            
         }
         if(monster.hp>0) {
        	int rs = r.nextInt(3);
        	if(rs==0) {
        		monster.normalAttack();
        		job[choice].hp -= monster.nomalDmg;
        	}else if(rs==1&&monster.mp>0) {
        		monster.skillAttack();
        		job[choice].hp -= monster.skillDmg;
        	}else {
        		monster.specialAttack();
        		job[choice].hp -= monster.specialDmg;
        	}
        	if(job[choice].hp<=0) {
        		System.out.println("패배....");
        		System.out.println("게임 종료");
        		break;
        	}
         }
         else {
        	 job[choice].showStatus();
        	 monster.showStatus();
        	 System.out.println("승리!!!!!!!!");
        	 break;
         }

      }

      
   }
}
