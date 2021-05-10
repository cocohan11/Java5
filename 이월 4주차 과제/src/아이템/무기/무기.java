package 아이템.무기;

import 아이템.아이템;

public class 무기 extends 아이템 {


    // 필드
    int 공격력증가;


    //생성자
    public 무기(){
        super();

    }; // 디폴트생성자 직접 추가

    public 무기(String 품명, int 가격, int 공격력증가, int 갯수, String 넘버) {
        super(품명, 가격, 갯수, 넘버);


        this.공격력증가 = 공격력증가;

    }



    //메소드





}
