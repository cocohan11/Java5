package 연습;

public class ThreadA implements Runnable {



    ThreadB t = new ThreadB();
    WaitNotifyExam w = new WaitNotifyExam();

    @Override
    public synchronized void run() {

        for (int i = 0; i < 10; i++) {

            if (i == 4) {

                t.웨잇();
            }

            System.out.println(i+"ThreadA의 methodA() 작업 실행");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("for빠져나옴");

    }
}


