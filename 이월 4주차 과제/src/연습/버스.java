package 연습;

public class 버스 {

    //필드
    int busNumber;
    int passengerCount;
    int money;


    //생성자
    public 버스(int busNumber) {

        this.busNumber = busNumber;
    }

    //메소드
    public void take(int money) {
        this.money += money;
        passengerCount++;
    }

    public void showInfo(){

        System.out.println("버스"+busNumber+"번의 승객은 "+passengerCount+"명이고, 수입은 "+money+"입니다.");
    }




}
