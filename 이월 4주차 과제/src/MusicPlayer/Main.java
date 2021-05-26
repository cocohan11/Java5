package MusicPlayer;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 메뉴 출력(), 재생정보 출력()
        ArrayList<MusicVO> playlist = new ArrayList<MusicVO>();
        playlist.add(new MusicVO("뱅뱅뱅", "빅뱅", 100,
                "C:\\Users\\한\\Desktop\\자바유튜브음원\\mp3\\Awful_JoshPan.mp3"));
/*
        playlist.add(new MusicVO("뱅뱅뱅", "빅뱅", 100, "D:\\KSH\\music\\bangbangbang.mp3"));
*/


        MusicPlayer mp = new MusicPlayer(playlist);
        boolean onOff = true;

        while (onOff) {
            System.out.println("[1]재생  [2]정지  [3]이전곡  [4]다음곡  [5]종료");
            switch (new Scanner(System.in).nextInt()) {
                case 1:
                    MusicVO currentMusic = mp.play();
                    System.out.println(currentMusic.getTitle());
                    break;
                case 2:
                    mp.stop();
                    System.out.println("정지");
                    break;
                case 3:
                    MusicVO previouMusic = mp.previous();
                    System.out.println(previouMusic.getTitle());
                    break;
                case 4:
                    MusicVO nextMusic = mp.next();
                    System.out.println(nextMusic.getTitle());
                    break;
                case 5:
                    System.out.println("종료");
                    onOff = false;
                    break;
            }

        }
    }

}