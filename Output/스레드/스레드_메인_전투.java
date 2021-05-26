package 스레드;

public class 스레드_메인_전투 {

    public static void main(String[] args) {
        //스레드 불러오기

        //플레이어
        Runnable 스레드메인전투11 = new 스레드_플_러너블_사당_배트();
        Thread thread11 = new Thread(스레드메인전투11);
        thread11.start();


        //좀비
        Runnable 스레드메인전투12 = new 스레드_좀비_러너블_사당_배트();
        Thread thread12 = new Thread(스레드메인전투12);
        thread12.start();

        //join으로 스레드 제어 : 해당 쓰레드가 종료되기까지 기다렸다가 다음으로 넘어감.
        try {
            thread12.join();
        }catch (Exception e) {}
        //while빠져나오고 바로 물리쳤다고 끝내기
    }

}
