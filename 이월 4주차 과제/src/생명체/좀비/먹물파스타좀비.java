package 생명체.좀비;

import 생명체.생존자.생존자;

public class 먹물파스타좀비 extends 좀비{


    생존자 생;


    public 먹물파스타좀비(){}
    public 먹물파스타좀비(생존자 생){

        this.생 = 생;
    }


    public void 먹물공격(생존자 생) {


        int 횟수 = 5;

        if (Math.random() <= 0.5) {

            for (int i = 0; i < 횟수; i++) {

                System.out.println(
                    "                         먹물 공격으로 눈이 보이지 않는다!!(공격실패율 100%)");
                생.공격성공률 = 0;  //공격을 무조건 실패하게 만듦

                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }//~for

            System.out.println("\n\n\n\n\n\n\n" +
                    "                                       이제 눈이 보인다!!");
            생.공격성공률 = 0.8;  //다시 되돌려놓음
        }

    }//~메소드드

}
