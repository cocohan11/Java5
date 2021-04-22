package 연습;



public class ThreadB {


    //필드
    ThreadA aa = new ThreadA();


    public synchronized void 웨잇() {

                try {
                    wait();
                } catch (Exception e) {
                }
        }


        //메서드
    public synchronized void 노티(ThreadA a) {


            System.out.println("B에서 notify해줌. 왜 다시 실행안되지");

            aa.notify();
    }
}




