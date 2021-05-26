public class 인벤 {

    //필드
    public String 무기1;  //기본 나무배트
    public String 무기2;  //창
    public String 드랍1;  //오렌지
    public String 드랍2;  //짜장면
    public String 드랍3;  //김치찌개
    public int 골드;


    //생성자
    public 인벤(String 무기1, String 무기2, String 드랍1, String 드랍2, String 드랍3, int 골드) {
        this.무기1 = 무기1;
        this.무기2 = 무기2;
        this.드랍1 = 드랍1;
        this.드랍2 = 드랍2;
        this.드랍3 = 드랍3;
    }






    //메소드
    public void 인벤() {
        System.out.println(" \n\n\n\n\n\n\n\n=============== 소지품 ===============");
        System.out.println(" 무기 : "+무기1+무기2+" ");
        System.out.println(" 포션 : "+드랍1+드랍2+드랍3+" ");
        System.out.println(" 골드 : "+골드+" ");
        System.out.println(" ===================================\n\n");
    }

}


//static쓰지말고 main에서 인스턴스 만들면 됨.