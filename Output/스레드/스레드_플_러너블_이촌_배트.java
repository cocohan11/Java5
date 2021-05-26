package 스레드;

import 생명체.Player;
import 생명체.Zombie;

import java.util.Scanner;

public class 스레드_플_러너블_이촌_배트 implements Runnable {
//플레이어 전투 스레드

    @Override
    public void run() {
        //-----------------------------설정값----------------------------------

        Scanner 입력 = new Scanner(System.in); //스캐너 시작

        //생성자값 지정해줘야되서 미리 써둠
        Zombie.공격력 = 55;
        Player 전투P_배트 = new Player(Player.이름, "기본 나무배트",
                0,"매질(+공격력 0)",500,
                500,50,
                3, 0, Zombie.공격력);
        Zombie 전투Z_배트 = new Zombie
                ("김치찌개맛 좀비", 300,
                        300, 55,
                        3, 500, "김치찌개", Player.공격력);

        //-----------------------------전투시작----------------------------------

        System.out.println(Player.무기명 + "을 골랐습니다.");
        System.out.println("╔══════════════════════╗");
        System.out.println("     1.기본공격  2.스킬");
        System.out.println("╚══════════════════════╝\n\n");


        //플레이어, 좀비 스레드 각각 만듦.
        //1.공격력50  2.공격력75
        while (Zombie.남은체력 > 0) {

            // 스캐너
            int 스레드전투 = 입력.nextInt();

            // 1 : 기본공격
            if (스레드전투 == 1) {
                Player.공격력 = 50;
                전투P_배트.PlayF_a();
            }
            // 2 : 스킬
            else if (스레드전투 == 2) {
                System.out.println("       │   ╔════════════════════════╗");
                System.out.println("       └───   1.연속 가격  2.화염병");
                System.out.println("           ╚════════════════════════╝\n\n");
                // 스캐너
                int 스레드스킬 = 입력.nextInt();

                // 1 : 연속 가격
                if (스레드스킬 == 1) {
                    System.out.println("[연속 가격] 스킬을 사용합니다.\n" +
                                       "공격력 : 75 (50+25)");
                    Player.공격력 = 50+25;
                    전투P_배트.PlayF_a();

                // 2 : 화염병
                } else if (스레드스킬 == 2) {
                    System.out.println("[화염병] 스킬 사용\n" +
                                       "공격력 : 65 (50+15)\n" +
                                       "+ 화상공격 : 5(5회)\n");
                    Player.공격력 = 50+15;
                    전투P_배트.PlayF_a();
                } else {
                }
            } else {
            }

            //데미지
            //반복해야되서 아래코드 여기 작성
            Zombie.남은체력 = Zombie.남은체력 - Player.공격력;
            Zombie.피해 = Player.공격력;

            if (Player.공격력 == 65 && Zombie.남은체력 > 0) {
                // 3번 반복 : 화상 상태이상
                for (int i=0; i<3; i++) {
                    Zombie.남은체력 = Zombie.남은체력 - 5;
                    System.out.println("╭────────────────╮\n" +
                                       "  좀비 : 뜨거워~~~!\n" +
                                       "╰────────────────╯");
                    System.out.println("");
                    System.out.println("[화염병 공격]으로 인한 화상 : 좀비 체력 -5");
                    System.out.println("좀비의 남은 체력 : "+Zombie.남은체력);
                                        try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {}
                }
            } else {
                전투Z_배트.ZFight_getBeat();
            }
        }

    }

}
