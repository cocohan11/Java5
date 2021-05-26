package 생명체;

public class Zombie {

        //필드
        String 이름 = "오렌지맛 좀비";
        String 드랍;
        int 기존체력;
        public static int 남은체력;
        public static int 공격력;
        static int 레벨;
        public int 골드;
        public int 소지금;

        public static int 피해;
        public static int 좀비수;

//      String 외관 = "시큼한 오렌지 냄새가 난다";
//      String 스킬 = "오렌지 산성을 뱉는다.";



        //생성자
        public Zombie(String 이름, int 기존체력, int 남은체력, int 공격력, int 레벨, int 골드, String 드랍,
                      int 피해) {

            this.이름 = 이름; // this쓴 이유:변수랑 헷갈려서. this붙은건 생성자
//하위       this.외관 = visual;
            this.기존체력 = 기존체력;
            this.남은체력 = 남은체력;
            this.공격력 = 공격력;
            this.레벨 = 레벨;
            this.골드 = 골드;
            this.피해 = 피해;
            this.드랍 = 드랍;
            this.좀비수 = 좀비수;
//하위       this.스킬 = 스킬;

        }

    public Zombie(int 레벨, int 골드, int 좀비수, int 소지금, String 드랍) {
        this.레벨 = 레벨;
        this.골드 = 골드;
        this.좀비수 = 좀비수;
        this.소지금 = 소지금;
        this.드랍 = 드랍;
    }





        //메소드


        public void ZFight_hi() {

            System.out.println("=============================");
            System.out.println("   [     "+이름+"     ]");
            System.out.println("-----------------------------");
            System.out.println("레벨 : " + 레벨);
            System.out.println("체력 : " + 남은체력+"/"+기존체력);
            System.out.println("공격력 : " + 공격력);
            System.out.println("골드 : " + 골드);
            System.out.println("-----------------------------");
            System.out.println("어떤 무기를 선택하시겠습니까?");
            System.out.println("1.기본 나무배트(공격력:50)\n2.창(공격력:60)");
            System.out.println("=============================");

        }

        public void  ZFight_getBeat(){
            System.out.println("=====================================");
            System.out.println("["+이름 + "]가 -"+피해+"만큼 다쳤습니다.");
            System.out.println("-------------------------------------");
            System.out.println("체력 : " + 남은체력+"/"+기존체력);
            System.out.println("공격력 : " + 공격력);
            System.out.println("=====================================");
            System.out.println("╔══════════════════════╗");
            System.out.println("    1.기본공격  2.스킬");
            System.out.println("╚══════════════════════╝\n\n\n");

        }


        public void ZFight_a(){
            System.out.println("===========================");
            System.out.println("["+이름 + "]가 공격합니다.");
            System.out.println("---------------------------");
//하위클래스로 빼기  System.out.println("스킬 : "+스킬);
            System.out.println("체력 : " + 남은체력+"/"+기존체력);
            System.out.println("공격력 : " + 공격력);
            System.out.println("===========================\n\n\n");


        }




    public void  Z_getBeat_End(){
        System.out.println( "\n\n\n\n\n\n\n\n" +
                            "╭───────────────────────╮\n" +
                            "  좀비 : 2번 죽다니.......\n" +
                            "╰───────────────────────╯");
        System.out.println("================================");
        System.out.println("["+이름 + "]을 물리쳤습니다!!");
        System.out.println("--------------------------------");
        System.out.println("생존자의 레벨 : " + 레벨);
        System.out.println("잡은 좀비 수 : " + 좀비수);
        System.out.println("골드 : + " + 골드);
        System.out.println("드랍 : + " + 이름+"가 뱉어낸 "+드랍);
        System.out.println("================================");
        System.out.println(".\n.\n.\n.\n.\n 무사히 좀비를 지나 역에 도착합니다..\n.\n.\n.\n.\n");
        System.out.println("" +
                "" +
                "  ┏━━━━━┓\n" +
                " ┏┛ ㅁㅁ ┗┓\n" +
                " ┗━⊙━━⊙━┛\n\n");
        // ★여기로 나옴);

        // 좀비잡고 플레이어의 레벨이 늘어나기



    }

    public void Z_image(){
        System.out.println("          ");
    }






    //---------------------------------------- 김치찌개 좀비 -----------------------------
    public class Zombie_kimchi extends Zombie {

        //필드


        //생성자
        Zombie_kimchi(String 외관, String 이름, int 기존체력, int 남은체력, int 공격력, int 레벨, int 골드,
                      int 피해) { // 넣고싶은거 다 넣어. 어머니클래스까지 합쳐서

            super("김치찌개맛 좀비",150,150,45,1,600, "김치찌개",1);//슈퍼클래스 그대로 씀


        }

        //메소드
        public void ZFight_hi() {

            super.ZFight_hi();

        }

        public void  ZFight_getBeat(){

            super.ZFight_getBeat();

        }


        public void ZFight_a(){

            super.ZFight_a();
        }






    }
// --------------------------------------오렌지 좀비------------------------------------------
    public static class Zombie_orange extends Zombie { //어머니 클래스 호출함


        //필드
        String 스킬;
        String 외관;


        //생성자
        public Zombie_orange(String 스킬, String 외관, String 이름, int 기존체력, int 남은체력, int 공격력, int 레벨, int 골드,
                             int 피해) { // 넣고싶은거 다 넣어. 어머니클래스까지 합쳐서

            super("오렌지맛 좀비",100,100,35,1,500, "오렌지",1);//슈퍼클래스 그대로 씀

            this.스킬 = 스킬;
            this.외관 = 외관;

        }

        //메소드
        public void ZFight_hi() {

            super.ZFight_hi();
            System.out.println("스킬 : "+스킬);
            System.out.println("특징 : "+외관);
            System.out.println("---------------------------\n\n\n");

        }

        public void  ZFight_getBeat(){

            super.ZFight_getBeat();

        }



        public void ZFight_a(){
            System.out.println(이름+"가 "+스킬+"를 시전했다!!");
            super.ZFight_a();
        }

    }
//------------------------------ 짜장면 좀비 ---------------------------------------------
    public static class Zombie_jjajang extends Zombie {

        //필드



        //생성자
        public Zombie_jjajang(String 이름, int 기존체력, int 남은체력, int 공격력, int 레벨, int 골드, String 드랍, int 피해) {
            // 넣고싶은거 다 넣어. 어머니클래스까지 합쳐서

            super("짜장면맛 좀비",150,150,45,1,600, "짜장면", 1);//슈퍼클래스 그대로 씀


        }

        //메소드
        public void ZFight_hi() {

            super.ZFight_hi();
        }

        public void  ZFight_getBeat(){

            super.ZFight_getBeat();

        }


        public void ZFight_a(){
            System.out.println(이름+"가 공격한다!!");
            super.ZFight_a();
        }




    }
}














/*
//공통 속성
    String 이름;
    int 체력;
    int 공격력;
    (int 방어력;)
    int 레벨;
    int 골드;
    (String 드랍아이템;) -->좀비의 속성이 아님


    //좀비 공통 행동
    전염;
    동료 좀비 부르기;
    피 토하기;
    방어 없이 공격당하기;
    팔 잘려도 공격하기;

    //--------오렌지좀비---------

    //오렌지 좀비의 속성
    시큼한 냄새가 난다.

    //오렌지 좀비의 행동
    오렌지쥬스(산성)을 뱉는다 --> 자체 공격력
 */