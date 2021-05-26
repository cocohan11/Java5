package 스레드;

import 생명체.Player;
import 생명체.Zombie;

public class 스레드_좀비_러너블_사당_배트 implements Runnable {

    @Override
    public void run() {
        //-----------------------------설정값----------------------------------
        Zombie 전투Z_배트 = new Zombie
                ("오렌지맛 좀비", 300,
                        300, 35,
                        1, 500, "오렌지", Player.공격력);
        Player 전투P_배트 = new Player("yourName", "기본 나무배트",
                0,"매질(+공격력 0)",500,
                500,50,
                1, 0, Zombie.공격력);
        //-----------------------------전투시작----------------------------------


        //첫 시작이 겹쳐서 빈 칸 삽입
        System.out.print(" ");
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){}

        //좀비 전투 스레드 만들기
        while (Zombie.남은체력 > 0) {

            //공격
            전투Z_배트.ZFight_a();
                try {
                Thread.sleep(500);
            }catch (InterruptedException e){}

            //데미지
            Player.남은체력 = Player.남은체력 - Player.피해;
            전투P_배트.PlayF_getBeat();
            try {
                Thread.sleep(5600);
            }catch (InterruptedException e){}


        }

        //while빠져나오고 바로 물리쳤다고 끝내기
        Zombie 레벨골드 = new Zombie(2,500 ,1,500, "오렌지");
        레벨골드.Z_getBeat_End();
        try {
            Thread.sleep(500);
        }catch (InterruptedException e){}

    }

}
