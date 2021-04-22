package 스레드;

import 생명체.생존자.생존자;
import 생명체.좀비.좀비;

import java.util.Scanner;
import java.util.TreeMap;

public class 좀비스레드2 implements Runnable {
    //-----------------------------설정값----------------------------------

/*
    int 남은체력;
*/
    생존자 생존자값;

    좀비 오렌지좀비값;


    public 좀비스레드2(생존자 b, 좀비 좀남은체력) {  //객체가 될 것이다.

        생존자값 = b;
        오렌지좀비값 = 좀남은체력;

/*        오렌지좀비값 = new 좀비(
                "오렌지좀비", "","오렌지맛 산성 뱉기",
                "카악 퉤~~!!!",1,130,
                1380,1500, 생존자값.공격력,
                8000, 600);*/
    }


    //-----------------------------설정값----------------------------------


    @Override
    public void run() {

        //서브스레드 시작 후 3초 정지해야 동시에 공격 안 함.
        System.out.println("99 ");
        try {
            Thread.sleep(4000);
        } catch (Exception e) {

        }  //공격 안 하고 7초 있으면 좀비가 날 때림




    while (생존자값.남은체력 > 0 && 오렌지좀비값.남은체력 > 0) {


            if (오렌지좀비값.남은체력 <= 0) {
                System.out.println("좀비뒤짐ㅋ");
/*
                좀비값.남은체력 = 0;
*/
                break;
            }

            System.out.println("4생존자 남은체력 : " + 생존자값.남은체력);


            System.out.println("                     <::::::::::::::::::::[]==o\n");

            System.out.println("                       [   오렌지 좀비   ]의 공격\n");

            System.out.println("                     <::::::::::::::::::::[]==o\n\n\n\n");





            System.out.println("5오렌지좀비 공격력 : " + 오렌지좀비값.공격력);
            생존자값.남은체력 = 생존자값.남은체력 - 오렌지좀비값.공격력;

            if (생존자값.남은체력<=0){

                생존자값.남은체력=0;

                System.out.println("생존자 체력0됨");

                생존자값.맞기_결과(오렌지좀비값);  //윽..!

                생존자값.패배lose();   //사망ㅜㅜ


                break;

            }

            System.out.println("6생존자 남은체력 : " + 생존자값.남은체력);

            생존자값.맞기_결과(오렌지좀비값);  //윽..!

            System.out.println("7                        5초 쉬고 좀비스레드공격");


            try {
                Thread.sleep(3000);
            } catch (Exception e) {

            }



/*
            if (오렌지좀비값.남은체력 <= 0) {
                System.out.println("좀비뒤짐");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }*/


        } //~while





        //---------------------- 생존자값.남은체력 <= 0 --------------------------------
        System.out.println("8좀비스레드 while 탈출*****");
        System.out.println("(Press Any number)");








    } //~run



}






