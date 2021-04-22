package 아이템.방어장비;

import 아이템.아이템;

public class 가죽방어구 extends 방어구 {

    //필드
    //생성자
    public 가죽방어구(){};
    public 가죽방어구(String 품명, int 가격, int 방어력증가, int 갯수) {
        super(품명, 가격, 방어력증가, 갯수);


        this.품명 = "가죽방어구";
        this.가격 = 10000;
        this.방어력증가 = 700;

    }


    //메소드
            

}
