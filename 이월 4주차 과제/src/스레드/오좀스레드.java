package 스레드;

import 생명체.생존자.생존자;
import 생명체.좀비.좀비;
import 스레드.음악.전투퍽;
import 아이템.아이템;
import 아이템.살점;

public class 오좀스레드 implements Runnable {


    //필드
    살점 i;
    생존자 생존자값;
    좀비 좀비값;
    전투퍽 퍽;
    button bt;



    public 오좀스레드(살점 a, 생존자 b, 좀비 좀, 전투퍽 퍽, button bt) {

        i = a;
        생존자값 = b;
        좀비값 = 좀;
        this.퍽 = 퍽;
        this.bt = bt;
    }


    public void run() {




        //오좀 또는 살점먹는다면
        if (bt.사냥123 == 1 || i.넘버.equals("1.")) {  //오렌지좀비라면 생존자가 맞는 메소드를 이렇게한다.

/*            생존자값.맞기_결과(좀비값);  //윽..! (우선, 좀비의 일반 공격 맞음)


            int 추뎀횟수 = 3;  //이제 추뎀 추가
            int 오좀_추뎀 = 9;

            for (int i=0; i<추뎀횟수; i++) {  //추가데미지 n번..


                System.out.println(
                        "오렌지좀비가 뱉은 산성이 몸을 계속 녹입니다. (-"+오좀_추뎀+")");
                System.out.println(
                        "남은 체력 : ");생존자값.남은체력 = 생존자값.남은체력 - 오좀_추뎀;
                System.out.println(생존자값.남은체력);

                퍽.run();  //맞는 소리
                try {
                    Thread.sleep(2000);  //2초마다 추뎀 반복
                } catch (Exception e) {

                }


            }*/

        } else if (bt.사냥123 == 2) {  //짜장

        } else if (bt.사냥123 == 3) {  //먹물

        }
    }
}
