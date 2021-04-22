package 아이템.방어장비;

public class 천방어구 extends 방어구 {

    //필드
    //생성자
    public 천방어구(){};

    천방어구(String 품명, int 가격, int 방어력증가, int 갯수) {
        super(품명, 가격, 방어력증가, 갯수);


        this.품명 = "천방어구";
        this.가격 = 8000;
        this.방어력증가 = 500;

    }


    //메소드
}
