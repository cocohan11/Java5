package 스레드.음악;

import MusicPlayer.MusicPlayer;
import MusicPlayer.MusicVO;
import javazoom.jl.player.MP3Player;
import 스레드.button;

import java.util.ArrayList;

public class 전투퍽 implements Runnable{


    button bt;

    public 전투퍽(button b) {
        bt = b;
    }


    @Override
    public void run() {

        ArrayList<MusicVO> playlist_배경 = new ArrayList<MusicVO>();


        playlist_배경.add(new MusicVO("음악_전투", ".", 1000,
                "C:\\Users\\한\\Desktop\\자바유튜브음원\\mp3\\Windshield Hit With Bar.mp3"));




        MusicPlayer mp = new MusicPlayer(playlist_배경);


                mp.play();





/*
        System.out.println("퍽 끝");
*/

    }






}
