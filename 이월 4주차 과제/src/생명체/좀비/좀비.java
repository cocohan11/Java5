package 생명체.좀비;

import 생명체.생명체;
import 생명체.생존자.생존자;
import 스레드.button;

public class 좀비 extends 생명체 {


    //필드
    생존자 생;
    public int 드랍골드;
    public String 스킬명;
    public String 스킬대사;
/*
    public int 남은체력;
    이거때문에 계속 오류났던 거였어!!!!!!!!!!!!!!!!!!!!!!!!!!!
*/


    public 좀비(생존자 a){

        this.생 = a;
    }




    //생성자
    public 좀비() {


    } // 디폴트생성자 직접 추가


    public 좀비(String 이름){};

    public 좀비(int 남은체력){
        this.남은체력 = 남은체력;
    };




    public 좀비(String 이름, String 상대이름, String 스킬명, String 스킬대사, int 레벨, int 공격력,
              int 남은체력, int 기존체력, int 데미지, int 드랍골드, int 경험치) {
        super(이름, 상대이름, 레벨, 공격력, 남은체력, 기존체력, 데미지, 경험치);

        this.드랍골드 = 드랍골드;
        this.스킬명 = 스킬명;
        this.스킬대사 = 스킬대사;

    }

    //메소드
    public void 좀비스펙(좀비 좀비) {

        System.out.println("                                                        레벨 : " + 좀비.레벨);
        System.out.println("                                                        스킬 : " + 좀비.스킬명);
    }
/*

    public void 맞기(생존자 생존자) {
        this.남은체력 -= 생존자.공격력;
    }*/

    //----------------------------- 전투 ---------------------------------


    public void 공격(생존자 생존자, 좀비 좀) {


        System.out.println("\n\n\n\n\n\n");
        System.out.println("                                                           <::::::::::::::::::[]==o\n");

        System.out.println("                                                           [   "+좀.이름+"   ]의 공격\n");

        System.out.println("                                                           <::::::::::::::::::[]==o\n\n\n\n");

/*        System.out.println("\n\n\n\n");
        System.out.println("                                                         <::::::::::::::::[]==o\n");

        System.out.println("                                                            [ "+좀.이름+" ]의 공격\n");

        System.out.println("                                                         <::::::::::::::::[]==o\n");*/

        생존자.남은체력 = 생존자.맞기(공격력);
/*
        System.out.println("생존자의11 남은체력 : " + 생존자.맞기(공격력));
*/

/*        생존자.맞기(공격력);
        System.out.println("생존자의 남은체력 : "+생존자.맞기(공격력));*/

/*
        생존자.맞기_결과(공격력);
*/

    }


/*

    public void 공격_결과(생존자 생존자) {

    }
*/



        public int 맞기(int 공격력) {

        return 남은체력 - 공격력;
    }


    //좀비맞음
    public void 맞기_결과(생존자 생) {

        String 맞는멘트;

        if (남은체력 <= 0) {

            남은체력 = 0;
            맞는멘트 = "꾸에에엑!!!";
        }

        맞는멘트 = "우어억...!";

        System.out.println("\n\n\n");
        System.out.println("                                                    ╔═════════════════════════════╗");
        System.out.println("                                                             [ "+이름+" ] \n");
        System.out.println("                                                        ╭ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ╮\n" +
                           "                                                               "+맞는멘트+"\n" +
                           "                                                        ╰ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ╯°°O..\n");

        System.out.println("                                                          -"+생.공격력+"의 데미지 **");
        System.out.println("                                                          남은 체력 : "+남은체력+"/"+기존체력);
        System.out.println("                                                    ╚═════════════════════════════╝\n\n\n\n");

/*
        System.out.println("1.공격  2.아이템 공격");
*/
    }

    public int 체력(int 공격력) {

        return 맞기(공격력);
    }














        //----------------------------- 생존자의 아이템 공격 ---------------------------------



    // 아이템사용
    public void 스킬공격(String 살점이름, String 스킬명, String 스킬대사) {


        System.out.println( " ...Λ＿Λ\n" +
                            " （ㆍωㆍ)つ━☆*。\n" +
                            " ⊂　　 ノ 　　　.뾰\n" +
                            " 　し-Ｊ　　　°。로 *´¨)\n" +
                            "　 　　　　　..　.· ´¸.·롱*´¨) ¸.·*¨)\n" +
                            "　　 　　　　　　　　(¸.·´ (¸.'*\n");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }  //0.5초 뒤에 창 뜨기

        System.out.println("╔════════════════════════════════╗\n");

        System.out.println("            아이템 변신\n");


        System.out.println("  한 턴 동안 "+살점이름+"로 변합니다.");
        System.out.println("  공격력 X 3");
        System.out.println("  ["+스킬명+"] 스킬을 시전합니다.\n");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }  //0.5초 뒤에 창 뜨기

        System.out.println( "     ╭ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ╮\n" +
                            "        "+스킬대사+"\n" +
                            "..O°°╰ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ╯\n");
        System.out.println("╚════════════════════════════════╝\n");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }  //0.5초 뒤에 창 뜨기

    }


    //최종
    public void 아이템변신(좀비 좀비) {

        좀비.스킬공격(이름, 스킬명, 스킬대사);

    }

    //---------------------------------- 보상 -------------------------------

    //좀비사망 후 보상  //사용 ㄴㄴ
    public void 사망(int 공격력) {

        System.out.println( "                                                ╔═════════════════════════════╗");
        System.out.println( "                                                           [ "+이름+" ] \n");
        System.out.println( "                                                     ╭ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ╮\n" +
                            "                                                            꾸엑...!\n" +
                            "                                                     ╰ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ╯°°O..\n");
        System.out.println( "                                                  좀비가 "+공격력+" 의 데미지를 입었다.");
        System.out.println( "                                                  남은 체력 : 0/"+기존체력);
        System.out.println( "                                                  좀비를 무찔렀다.");
        System.out.println( "                                                ╚═════════════════════════════╝\n");

/*
        System.out.println( "                            ╔═════════════════╗");
        System.out.println( "                                    보상\n");
        System.out.println( "                               + 좀비의 뼈\n" +
                            "                               + 좀비의 살점\n" +
                            "                               + "+드랍골드+"골드\n" +
                            "                               + 경험치:"+경험치+"\n");
        System.out.println( "                            ╚═════════════════╝\n");*/


    }

    public void 사망_보상(int 드랍골드, int 경험치) {


        System.out.println( "                                                                ╔═════════════════╗");
        System.out.println( "                                                                        보상\n");
        System.out.println( "                                                                   + 좀비의 뼈\n" +
                            "                                                                   + 좀비의 살점\n" +
                            "                                                                   + "+드랍골드+"골드\n" +
                            "                                                                   + 경험치:"+경험치+"\n");
        System.out.println( "                                                                ╚═════════════════╝\n");



    }

    public void 사망_보상_출력(좀비 좀비) {

        사망_보상(좀비.드랍골드, 좀비.경험치);
    }



    public int 보상_골드(int 소지골드) {

        return 소지골드 + 드랍골드;
    }


    public int 보상_경험치(int 생존자경험치) {

        return 생존자경험치 + 경험치;
    }

    public int 좀비보상_뼈(int 뼈) {

        return 뼈 + 1;
    }


    public int 좀비보상_무찌른좀비수(int 좀비수) {

        return 좀비수 + 1;
    }


    //---------------------------------- 스레드 -------------------------------





}