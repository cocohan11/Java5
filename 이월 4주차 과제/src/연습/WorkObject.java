package 연습;

public class WorkObject {


    public synchronized void methodA() {
        System.out.println("ThreadA의 methodA() 작업 실행");
        try {
            wait(); // ThreadA를 일시 정지 상태로 만듬
        } catch (InterruptedException e) {
        }


/*
        notify(); // 일시 정지 상태에 있는 ThreadB를 실행 대기 상태로 만듬
*/


/*        try {
            wait(); // ThreadA를 일시 정지 상태로 만듬
        } catch (InterruptedException e) {
        }*/
    }




}
