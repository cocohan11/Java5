package 아이템.물약;

import 아이템.아이템;

public class 물약 extends 아이템 {

    // 필드
    int 체력증가;


    //생성자
    물약(){}; // 디폴트생성자 직접 추가

    물약(String 품명, int 가격, int 체력증가, int 갯수) {
        super(품명, 가격, 갯수);


        this.체력증가 = 체력증가;


    }



    //메소드





}
