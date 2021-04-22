package 연습;
import 연습.ThreadA;

public class WaitNotifyExam {
    public static void main(String[] args){


        Runnable r = new ThreadA();
        Thread thA = new Thread(r);
        ThreadA t = new ThreadA();
        ThreadB n = new ThreadB();


            thA.start();


        for (int x = 0; x < 15; x++) {

            if (x == 8) {

                n.노티(t);

            }


            System.out.println(x + "");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



        System.out.println("ㅇㅇ입니다요");


    }
}


