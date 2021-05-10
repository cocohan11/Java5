
package 생명체.좀비;

import 생명체.생존자.생존자;
import 스레드.음악.전투퍽;

public class 오렌지좀비 extends 좀비{

    //---------------- 필드 ----------------------

    public int 공격력;
    public int 남은체력;
    public int 기존체력;
    public int 경험치 ;
    public int 드랍골드;
    public String 스킬명;
    public String 스킬대사;

    생존자 생;
    좀비 좀비값;
    전투퍽 퍽;


    //---------------- 생성자 ---------------------

    public 오렌지좀비(){}


/*    public 오렌지좀비(
            String 이름, String 상대이름, String 스킬명,
            String 스킬대사, int 레벨, int 공격력,
            int 남은체력, int 기존체력, int 데미지,
            int 드랍골드, int 경험치) {
        super(이름, 상대이름, 스킬명, 스킬대사, 레벨,
                공격력, 남은체력, 기존체력, 데미지, 드랍골드, 경험치);

        this.드랍골드 = 드랍골드;
        this.스킬명 = 스킬명;
        this.스킬대사 = 스킬대사;

    }*/



public void 오좀살점공격(생존자 생, 오렌지좀비 좀, 전투퍽 퍽) {



            int 추뎀횟수 = 3;  //이제 추뎀 추가
            int 오좀_추뎀 = 9;

            for (int i=0; i<추뎀횟수; i++) {  //추가데미지 n번..

                생.남은체력 = 생.남은체력 - 오좀_추뎀;

                System.out.println(
                        "                           오렌지좀비가 뱉은 산성이 몸을 계속 녹입니다. (-"+오좀_추뎀+")");
                System.out.println(
                        "                           남은 체력 : " + 생.남은체력+"/"+생.기존체력);

                퍽.run();  //맞는 소리
                try {
                    Thread.sleep(700);  //n초마다 추뎀 반복
                } catch (Exception e) {

                }


            }

}



}

