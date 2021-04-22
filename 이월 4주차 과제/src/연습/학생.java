package 연습;

import java.rmi.StubNotFoundException;

public class 학생 {

    //필드
    public String studentName;
    public int grade;
    public int money;

    //생성자
    public 학생(String studentName, int money){
        this.studentName = studentName;
        this.money = money;
    }

    //메서드
    public void takeBus(버스 bus) {  //매개변수 주목.
        bus.take(1000);
        this.money -= 1000;  // null값으로 안 나오려나
    }

    public void takeSubway(지하철 subway) {
        subway.take(1500);
        this.money -= 1500;
    }

    public void showInfo() {
        System.out.println(studentName + "님의 남은 돈은 "+money+"입니다.");
    }



}
