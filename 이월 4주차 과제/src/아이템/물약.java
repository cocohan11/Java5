package 아이템;

import 생명체.생존자.생존자;
import 스레드.button;

public class 물약 extends 아이템 {

    // 필드
    // 상속 + @
    public int 체력증가;
    생존자 생;
    button bt;

    //생성자
    public 물약(){}; // 디폴트생성자 직접 추가

    public 물약(String 품명, int 가격, int 갯수, String 넘버, int 체력증가) {
        super(품명, 가격, 갯수, 넘버);

        this.체력증가 = 체력증가;

    }



    //메소드
    //아이템 상위 클래스에서 상속받기


public void 피섭취(물약 a, 생존자 생, button bt){

    if (a.갯수 > 0) {
        생.남은체력 = 생.남은체력 + a.체력증가;
        a.갯수 -= 1;

        if (생.남은체력 >= 생.기존체력) {
            생.남은체력 = 생.기존체력;
        }

        System.out.println("\n\n\n"); //정갈
        System.out.println("                             [" + a.품명 + "]를 1병 마십니다.");  //꿀꺽꿀꺽 효과음 넣고싶다,
        // 슬립이랑
        System.out.println("                             [" + bt.당신이름 + "]님의 남은 체력 : " + 생.남은체력 +
                "/" + 생.기존체력);
    } else {

        //남은 갯수가 없으면 멘트뜨게하기
        System.out.println("\n\n\n\n"); //정갈
        System.out.println("                                  남은 피가 없습니다.");

    }

}

















}
