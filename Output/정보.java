package Output;

import java.util.Scanner;

public class 정보 {


    //필드
    String 이름;
    int 기존체력;
    int 남은체력;
    int 공격력;
    int 레벨;
    int 피해;
    String 스킬;
    int 골드;




    //메소드
    void info(){

        System.out.println("\n\n\n\n\n\n\n\n=========== 정 보 ===========\n"+
                            "\n 1. 이름 : "+이름+
                            "\n 2. 잡은 좀비 수 : " +레벨+
                            "\n 3. 공격 : " +공격력+
                            "\n 4. 체력 : " +남은체력+
                            "\n 5. 소지금 : " +골드+
                            "\n 6. 보유 스킬 : " +스킬+

                            "\n\n0. 뒤로가기\n" +
                           "===========================");





        while (true) {
            Scanner 스캐너 = new Scanner(System.in); //스캐너 시작
            int 나가기 = 스캐너.nextInt(); // 0.나가기

            if (나가기 == 0) {
                break;                                  //나가서 아래로 감☆
            }

            else {
                System.out.println("위의 선택지 안에서 고르세요");

            }

        }
        return;

    }

}
