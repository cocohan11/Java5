package 생명체;

public class Player {


    //필드
    public static String 이름;
    String 아이템;
    public static String 무기명;
    public static int 무기공격력;
    public int 기존체력;
    public static int 남은체력;
    public static int 공격력;
    public static int 레벨;
    public static int 피해;
    public static String 스킬;
    public int 골드;
    public int 소지금;
    public int 좀비수;

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





    //생성자
    public Player(String 이름, String 무기명, int 무기공격력, String 스킬, int 기존체력, int 남은체력, int 공격력, int 레벨, int 골드, int 피해) {

        this.이름 = 이름;
        this.무기명 = 무기명;
        this.무기공격력 = 무기공격력;
        this.기존체력 = 기존체력;
        this.남은체력 = 남은체력;
        this.공격력 = 공격력;
        this.레벨 = 레벨;
        this.스킬 = 스킬;
        this.피해 = 피해;
        this.아이템 = 아이템;

    }

    public Player() {
    }

    public Player(int 슬립속도, String 멘트1, String 멘트2,String 멘트3,String 멘트4,String 멘트5,String 멘트6,String 멘트7,String 멘트8,
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





/*
    //생성자
    public Player() {

        this.이름 = 이름;
        this.기존체력 = 기존체력;
        this.남은체력 = 남은체력;
        this.공격력 = 공격력;
        this.레벨 = 레벨;
        this.스킬 = 스킬;
        this.피해 = 피해;

    }
*/


    //메소드
    public void P_info() {

        System.out.println("\n\n\n\n\n\n\n\n\n=========== "+이름+"님의 정보 ===========" +
                "\n 1. 이름 : " + 이름 +
                "\n 1. 레벨 : " + 레벨 +
                "\n 2. 잡은 좀비 수 : " + 좀비수 +
                "\n 3. 공격 : " + 공격력 +
                "\n 4. 체력 : " + 남은체력+"/500"+
                "\n 5. 소지금 : " + 골드 +
                "\n 6. 보유 스킬 : " + 스킬 +
                "\n=================================\n\n");
    }



    public void PlayF_now() {
        System.out.println("생존자 ["+이름 + "]님이 현재 상태입니다.");
        System.out.println("---------------------------");
        System.out.println("레벨 : " + 레벨);
        System.out.println("공격력 : " + 공격력);
        System.out.println("체력 : " + 남은체력+"/"+기존체력);
        System.out.println("---------------------------\n\n\n");

    }

    public void PlayF_a() {
        System.out.println("===========================");
        System.out.println("생존자 ["+이름 + "]님의 공격!!");
        System.out.println("---------------------------");
        System.out.println("체력 : " + 남은체력+"/"+기존체력);
        System.out.println("공격력 : " +공격력 );
        System.out.println("===========================\n\n\n\n");

    }

    public void PlayF_getBeat(){
        System.out.println("=====================================");
        System.out.println("생존자 ["+이름 + "]님이 -"+피해+"만큼 다쳤습니다.");
        System.out.println("-------------------------------------");
        System.out.println("체력 : " + 남은체력+"/"+기존체력);
        System.out.println("공격력 : " + 공격력);
        System.out.println("=====================================");
        System.out.println("╔══════════════════════╗");
        System.out.println("    1.기본공격  2.스킬");
        System.out.println("╚══════════════════════╝\n\n\n");

    }



    public void P_배열sleep() {
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
            try {
                //0.3초 간 중지한다.
                Thread.sleep(슬립속도);
            } catch (Exception e) {
            }

        } //배열, Thread.sleep 사용

    }



}









