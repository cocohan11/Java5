package 스레드.음악;

import MusicPlayer.MusicPlayer;
import MusicPlayer.MusicVO;
import 생명체.생명체;
import 스레드.button;

import java.util.ArrayList;

public class 키보드 implements Runnable {


    /*
        public boolean onOff;
    */
    button bt;


    public 키보드(button b) {
        bt = b;
    }


    @Override
    public void run() {

        ArrayList<MusicVO> playlist_배경 = new ArrayList<MusicVO>();

        playlist_배경.add(new MusicVO("음악_키보드", "빅뱅", 1000,
                "C:\\Users\\한\\Desktop\\자바유튜브음원\\mp3\\Keyboard Typing Fast.mp3"));


        MusicPlayer mp = new MusicPlayer(playlist_배경);

/*
        boolean onOff = true;
*/


        while (true) {


            if (bt.키보드onOff) {

                mp.play();
/*                System.out.println("음악_키보드 재생");
                System.out.println("슬립으로 6.2초간 재움");*/
                try {
                    Thread.sleep(1700);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            } else if (!bt.키보드onOff) {  //보기편하라고 else가 아니라 else if로함

                mp.stop();  //작동함!
/*                System.out.println("정지");*/

                break;

            }


/*
            System.out.println("아직 반복문 안");
*/

        } //~while

/*
        System.out.println("음악(키보드)스레드 while 탈출");
*/

    }  //~run

}
