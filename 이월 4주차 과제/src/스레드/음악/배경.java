package 스레드.음악;

import MusicPlayer.MusicPlayer;
import MusicPlayer.MusicVO;
import javazoom.jl.player.MP3Player;
import 스레드.button;

import java.util.ArrayList;
import java.util.Scanner;

public class 배경 implements Runnable {


    button bt;
    String 당신이름;

    public 배경(button b) {
        bt = b;

    }


    @Override
    public void run() {


        System.out.println("\n\n\n\n\n");




        /*MusicPlayer mp = new MusicPlayer(playlist_배경);*/

        while (bt.배경onOff) {


            if (bt.배경onOff) {


            }
/*
        System.out.println("반복문 없앰.. 스레드 탈출11");
*/


        }


    }
}
