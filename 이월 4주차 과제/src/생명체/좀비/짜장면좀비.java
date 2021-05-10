package 생명체.좀비;

import 생명체.생존자.생존자;
import 스레드.button;

public class 짜장면좀비 extends 좀비{

    button bt;
    생존자 생;


    public 짜장면좀비(){}
    public 짜장면좀비(button bt, 생존자 생){

        this.bt = bt;
        this.생 = 생;

    }



    //스킬을 다르게 하고싶어서 클래스 따로 만들었음..
    //스킬 1/2확률로 스킬 발동됐으면 좋겠음
    public void 짜장살점공격(생존자 생, button bt){


/*        if (bt.사냥==1||bt.아이템공격==1|| bt.아이템공격==2 ||bt.아이템공격==3 ) {*/

            System.out.println(
                    "짜장면좀비가 휘두른 면발로 인해 ["+bt.당신이름+"]님의 공격을 반사시킵니다.(-"+생.공격력+")");

            생.남은체력 = 생.남은체력 - 생.공격력;

            if (생.남은체력 <= 0) {

                생.남은체력 = 0;

            }

            System.out.println("남은 체력 : "+생.남은체력+"/"+생.기존체력+"\n\n\n");

        /*}*/

    }





}
