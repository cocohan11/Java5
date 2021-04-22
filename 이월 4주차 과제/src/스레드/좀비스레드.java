package 스레드;

import 생명체.생존자.생존자;
import 생명체.좀비.좀비;
import 아이템.살점;

/*
public class 좀비스레드 implements Runnable {

    private boolean stop;

    public 좀비스레드() {
        this.stop = false;
    }

    //-----------------------------설정값----------------------------------

    생존자 생존자값 = new 생존자(
            "당신이름","",1,300,
            1500,1500,
            0,140000,0,0);
    좀비 좀비값 = new 좀비();

    좀비 오렌지좀비값 = new 좀비(
            "오렌지좀비", "당신이름","오렌지맛 산성 뱉기","카악 퉤~~!!!",1,130,
            1800,1800, 생존자값.공격력,8000, 600);
    살점 오렌지살점 = new 살점("오렌지좀비의 살점", 4, 2,"1.");

    //-----------------------------설정값----------------------------------


    @Override
    public void run() {



        //첫 시작이 겹쳐서 빈 칸 삽입
        System.out.print(" ");
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){}


        try {

            /*        while (오렌지좀비값.남은체력 > 0) {*/

/*
            while (!Thread.currentThread().isInterrupted()) {

                if (오렌지좀비값.남은체력 > 0) {

                    //좀 공격메소드
                    오렌지좀비값.공격(생존자값);

                    if (생존자값.남은체력 <= 0) {

                        //우는얼굴 출력
                        생존자값.사망();

                        //생존자 체력이 0보다 큰 경우
                    } else {

                        //생 맞기 메소드
/*
                        오렌지좀비값.공격_결과(생존자값);*/

/*
                        생존자값.맞기_결과(오렌지좀비값.공격력);
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {}

                    }

                }

            }//~while

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {

            System.out.println("좀비스레드 is dead!");


        }





        System.out.println("좀비스레드 while 탈출");

        // 좀비 남은체력 0이하면 여기에 보상 넣어야되나?
    }


    public void process(){
        Runnable interruptedThread = new 좀비스레드();
        Thread thread = new Thread(interruptedThread);
        thread.start();
        try {
            Thread.sleep(900);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt(); // InterruptedException 발생
    }

}

*/