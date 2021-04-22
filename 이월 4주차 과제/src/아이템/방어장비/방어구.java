package 아이템.방어장비;

import 아이템.아이템;

public class 방어구 extends 아이템 {


    // 필드
    public int 방어력증가;


    //생성자

    public 방어구() {}

    public 방어구(String 품명, int 가격, int 방어력증가, int 갯수) {
        super(품명, 가격, 갯수);


        this.방어력증가 = 방어력증가;

    }




    //메소드





}
