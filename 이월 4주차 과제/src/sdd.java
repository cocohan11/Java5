import 스레드.button;
import 스레드.음악.배경;

import java.util.Scanner;

public class sdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        button bt = new button();

        Runnable music배경 = new 배경(bt);
        Thread 배경t = new Thread(music배경);

        bt.배경onOff = true;
        배경t.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("당신이름 : "+bt.당신이름);
    }
}
