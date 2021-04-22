package 연습;

public class 지하철 {

    //필드
    String lineNumber;
    int passengerCount;
    int money;


    //생성자
    public 지하철(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    //메소드
    public void take(int money) {  //메소드 이름 똑같아도 되네
        this.money += money;
        passengerCount++;
    }

    public void showInfo(){
        System.out.println("버스"+lineNumber+"번의 승객은 "+passengerCount+"명이고, 수입은 "+money+"입니다.");
    }




}
