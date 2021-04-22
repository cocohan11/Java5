package 연습;

class StopThread implements Runnable{
    public void run() {
        try {
            while(!Thread.currentThread().isInterrupted()){
                System.out.println("Thread is alive...");
                Thread.sleep(500);//5초간 멈춤
            }
        } catch(Exception e) {
            // TODO: handle finally clause
        }finally {
            System.out.println("Thread is dead...");
        }
    }
}

class Test1 {
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.process();




    }
    public void process() {
        StopThread st  = new StopThread();
        Thread thread = new Thread(st);
        thread.start();
/*        if (오렌지좀비값.남은체력 < 0) {

        thread.interrupt();
        }*/
    }

}


