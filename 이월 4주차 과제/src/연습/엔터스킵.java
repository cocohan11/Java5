package 연습;

import 생명체.생명체;
import 스레드.button;
import 스레드.엔터스킵스레드;

import java.util.Scanner;


public class 엔터스킵 {


    public static void main(String[] args) {

        Scanner 입력값 = new Scanner(System.in);
        button bt = new button();
        생명체 생 = new 생명체();


        /*String str;*/

        Runnable 스킵 = new 엔터스킵스레드(bt, 생);
        Thread 스킵t = new Thread(스킵);



        스킵t.start();  //출력먼저 실행...

        bt.엔터skip = 입력값.nextLine();  //여기서 내가 엔터를 치면 ""값이 button에 들어가고 while이 멈추겠지?



/*            for (int i=0; i<10; i++){
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }*/




    }

}
