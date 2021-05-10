package 생명체;

import 스레드.button;

public class 생명체 {

    //------------------------------ 필드 ------------------------------

    public String 이름;
    public String 상대이름;
    public int 레벨;
    public int 공격력;
    public int 남은체력;
    public int 기존체력;
    public int 데미지;
    public int 경험치;

    public String 멘트1;
    public String 멘트2;
    public String 멘트3;
    public String 멘트4;
    public String 멘트5;
    public String 멘트6;
    public String 멘트7;
    public String 멘트8;
    public String 멘트9;
    public String 멘트10;
    public String 멘트11;
    public int 슬립속도;
    button bt;


    //------------------------------ 생성자 ------------------------------

    public 생명체(){};  //디폴트 생성자 추가 : 다른 생성자 전부 안 끌고와도 됨

    public 생명체(button bt){

        this.bt = bt;
    }

    public 생명체(String 이름, String 상대이름, int 레벨, int 공격력, int 남은체력, int 기존체력, int 데미지, int 경험치) {

        this.이름 = 이름;
        this.상대이름 = 상대이름;
        this.레벨 = 레벨;
        this.공격력 = 공격력;
        this.남은체력 = 남은체력;
        this.기존체력 = 기존체력;
        this.데미지 = 데미지;
        this.경험치 = 경험치;


    }

    public 생명체(int 슬립속도, String 멘트1, String 멘트2,String 멘트3,String 멘트4,String 멘트5) {

        this.멘트1 = 멘트1;
        this.멘트2 = 멘트2;
        this.멘트3 = 멘트3;
        this.멘트4 = 멘트4;
        this.멘트5 = 멘트5;

        this.슬립속도 = 슬립속도;
    }


    public 생명체(int 슬립속도, String 멘트1, String 멘트2,String 멘트3,String 멘트4,String 멘트5,String 멘트6,String 멘트7,String 멘트8,
                  String 멘트9,String 멘트10, String 멘트11) {

        this.멘트1 = 멘트1;
        this.멘트2 = 멘트2;
        this.멘트3 = 멘트3;
        this.멘트4 = 멘트4;
        this.멘트5 = 멘트5;
        this.멘트6 = 멘트6;
        this.멘트7 = 멘트7;
        this.멘트8 = 멘트8;
        this.멘트9 = 멘트9;
        this.멘트10 = 멘트10;
        this.멘트11 = 멘트11;

        this.슬립속도 = 슬립속도;
    }


    //------------------------------ 메서드 ------------------------------

    //일반공격


/*
    public void 승리win(){


        System.out.println( "╔═════════════════════════════════════════════╗\n\n" +

                            "            ██╗    ██╗██╗███╗   ██╗\n" +
                            "            ██║    ██║██║████╗  ██║\n" +
                            "            ██║ █╗ ██║██║██╔██╗ ██║\n" +
                            "            ██║███╗██║██║██║╚██╗██║\n" +
                            "            ╚███╔███╔╝██║██║ ╚████║\n" +
                            "             ╚══╝╚══╝ ╚═╝╚═╝  ╚═══╝\n\n" +
                            "╚════════════════════════════════════════════╝");
        System.out.println( "                                       (0.이전)\n\n");

    }*/





    public int 레벨업(int 레벨) {

        return 레벨 + 1;
    }



    public void 멘트sleep_짧(int 슬립속도,String 멘트1,String 멘트2,String 멘트3,String 멘트4, String 멘트5) {
        //배열, Thread.sleep 사용

        String[] 배열 = {
                멘트1,
                멘트2,
                멘트3,
                멘트4,
                멘트5,

        };

        for (int i = 0; i < 배열.length; i++) {
            //멘트를 출력한다.
            System.out.print(배열[i]);
            try {
                //0.3초 간 중지한다.
                Thread.sleep(슬립속도);
            } catch (Exception e) {
            }

        } //배열, Thread.sleep 사용

    }



    public void 멘트sleep(int 슬립속도, String 멘트1, String 멘트2,String 멘트3,String 멘트4,String 멘트5,String 멘트6,String 멘트7,String 멘트8,
                        String 멘트9,String 멘트10, button bt) {
        //배열, Thread.sleep 사용

        String[] 배열 = {
                멘트1,
                멘트2,
                멘트3,
                멘트4,
                멘트5,
                멘트6,
                멘트7,
                멘트8,
                멘트9,
                멘트10,
        };

            for (int i = 0; i < 배열.length; i++) {

                //멘트를 출력한다.
                System.out.print(배열[i]);

                //내부에서 한 번 판단하게 해보자.
                if (bt.엔터skip.equals("")) {
                    슬립속도 = 0;
                }

                try {
                    //0.3초 간 중지한다.
                    Thread.sleep(슬립속도);
                } catch (Exception e) {
                }
            }


         //배열, Thread.sleep 사용




/*
        System.out.print("@");
*/

    }















}
