package 생명체; /*

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



    //------------------------------ 생성자 ------------------------------

    public 생명체(){};  //디폴트 생성자 추가 : 다른 생성자 전부 안 끌고와도 됨

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



    //------------------------------ 메서드 ------------------------------

    //일반공격
    public int 공격하기(String 이름, int 공격력, int 남은체력) {

        System.out.println("o==[]::::::::::::::::>\n");

        System.out.println("[ "+이름+" ]의 일반 공격\n");

        System.out.println("o==[]::::::::::::::::>\n");


        return 남은체력 - 공격력;

    }


    public void 맞기_왼쪽(String 이름, int 공격력, int 남은체력, int 기존체력) {

        System.out.println( "╔═════════════════════════════╗");
        System.out.println( "           [ "+이름+" ] \n");
        System.out.println( "     ╭ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ╮\n" +
                            "           윽...!\n" +
                            "..O°°╰ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ╯\n");
        System.out.println( "  -"+공격력+" 의 데미지를 입었다.");
        System.out.println( "  남은 체력 : "+ 남은체력+"/"+기존체력);
        System.out.println( "╚═════════════════════════════╝\n");


    }


    //좀비맞음
    public void 맞기(String 이름, int 공격력, int 남은체력, int 기존체력) {

        System.out.println("                ╔═════════════════════════════╗");
        System.out.println("                         [ "+이름+" ] \n");
        System.out.println("                    ╭ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ╮\n" +
                           "                           우어억...!\n" +
                           "                    ╰ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ╯°°O..\n");
        System.out.println("                  -"+공격력+" 의 데미지를 입었다.");
        System.out.println("                  남은 체력 : "+ 남은체력+"/"+기존체력);
        System.out.println("                ╚═════════════════════════════╝\n");


    }


    //좀비공격
    public int 공격하기_왼쪽(String 이름, int 공격력, int 남은체력) {

        System.out.println("                         <::::::::::::::::[]==o\n");

        System.out.println("                            [ "+이름+" ]의 공격\n");

        System.out.println("                         <::::::::::::::::[]==o\n");


        return 남은체력 - 공격력;
    }



    //좀비사망 후 보상
    public void 좀비사망(String 이름, int 공격력, int 기존체력, int 골드, int 경험치) {

        System.out.println( "                ╔═════════════════════════════╗");
        System.out.println( "                           [ "+이름+" ] \n");
        System.out.println( "                     ╭ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ╮\n" +
                            "                           우어억...!\n" +
                            "                     ╰ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ╯°°O..\n");
        System.out.println( "                  -"+공격력+" 의 데미지를 입었다.");
        System.out.println( "                  남은 체력 : 0/"+기존체력);
        System.out.println( "                  좀비를 무찔렀다.");
        System.out.println( "                ╚═════════════════════════════╝\n");


        System.out.println( "                            ╔═════════════════╗");
        System.out.println( "                                    보상\n");
        System.out.println( "                               + 좀비의 뼈\n" +
                            "                               + 좀비의 살점\n" +
                            "                               + "+골드+"원\n" +
                            "                               + 경험치:"+경험치+"\n");
        System.out.println( "                            ╚═════════════════╝\n");


    }

    public void 승리의춤(){


        System.out.println( "╔═════════════════════════════════════════════╗\n\n" +

                            "            ██╗    ██╗██╗███╗   ██╗\n" +
                            "            ██║    ██║██║████╗  ██║\n" +
                            "            ██║ █╗ ██║██║██╔██╗ ██║\n" +
                            "            ██║███╗██║██║██║╚██╗██║\n" +
                            "            ╚███╔███╔╝██║██║ ╚████║\n" +
                            "             ╚══╝╚══╝ ╚═╝╚═╝  ╚═══╝\n\n" +
                            "╚════════════════════════════════════════════╝");
        System.out.println( "                                       (0.이전)\n\n\n\n\n");

    }


    // 스킬사용
    public int 스킬공격(String 이름, String 살점이름, String 좀비스킬명, String 스킬대사, int 공격력, int 남은체력) {

        System.out.println("o==[]::::::::::::::::::::::::::::>\n");

        System.out.println( " ...Λ＿Λ\n" +
                            " （ㆍωㆍ)つ━☆*。\n" +
                            " ⊂　　 ノ 　　　.뾰\n" +
                            " 　し-Ｊ　　　°。로 *´¨)\n" +
                            "　 　　　　　..　.· ´¸.·롱*´¨) ¸.·*¨)\n" +
                            "　　 　　　　　　　　(¸.·´ (¸.'*\n");
        System.out.println("╔════════════════════════════════╗\n");

        System.out.println("          변 신(아이템공격)\n\n");

        System.out.println("  한 턴 동안 "+살점이름+"로 변합니다.\n");
        System.out.println("  >>> 기본 공격력 X 3배 상승");
        System.out.println("  "+좀비스킬명+" 공격을 시전합니다.\n");
        System.out.println( "     ╭ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ╮\n" +
                            "        "+스킬대사+"\n" +
                            "..O°°╰ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ╯\n");
        System.out.println("╚════════════════════════════════╝\n");

        System.out.println("o==[]::::::::::::::::::::::::::::>\n");


        return 남은체력 - 공격력;

    }





    public int 좀비보상_골드(int 소지골드, int 골드) {

        return 소지골드 + 골드;
    }

    public int 좀비보상_경험치(int 생존자경험치, int 좀비경험치) {

        return 생존자경험치 + 좀비경험치;
    }

    public int 좀비보상_뼈(int 뼈) {

        return 뼈 + 1;
    }

    public int 좀비보상_살점(int 살점) {

        return 살점 + 1;
    }

    public int 좀비보상_무찌른좀비수(int 좀비수) {

        return 좀비수 + 1;
    }

    public int 스킬사용(int 공격력) {

        return 공격력*3;
    }

    public int 스킬사용끝(int 공격력) {

        return 공격력/3;
    }

    public int 레벨업(int 레벨) {

        return 레벨 + 1;
    }



}
*/