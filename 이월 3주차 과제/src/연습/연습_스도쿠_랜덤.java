package 연습;

import java.util.Scanner;

public class 연습_스도쿠_랜덤 {
    public static void main(String[] args) {

/*        double 랜덤수 = Math.random();

        double  십곱한값 = 랜덤수*10;

        int 버림값 = (int) 십곱한값;

        int 나머지 = 버림값%4;

        System.out.println(랜덤수);
        if (나머지 == 0) {
            System.out.println(" 위");
        } else if (나머지 == 1) {
            System.out.println(" 아래");

        } else if (나머지 == 2) {
            System.out.println(" 왼쪽");

        }else if (나머지 == 3) {
            System.out.println(" 오른쪽");

        }*/


        //=======================================================

        System.out.println("0, 1, 2 중 하나를 입력하세요(0: 가위, 1: 바위, 2: 보)");
        Scanner 사용자입력 = new Scanner(System.in);
        int 나의선택 = 사용자입력.nextInt();

        double 랜덤수 = Math.random();
        double 십곱한값 = 랜덤수*10;
        int 버림값 = (int)십곱한값;
        int 컴퓨터의선택 = 버림값 % 3;   //0.가위 1.바위 2.보

        System.out.println(랜덤수);


        if (나의선택 == 0) {  //가위
            if (컴퓨터의선택 == 0) { //가위
                System.out.println("나:가위, 컴:가위");
                System.out.println("무승부입니다.");
            } else if (컴퓨터의선택 == 1) {  //바위
                System.out.println("나:가위, 컴:바위");
                System.out.println("컴퓨터가 이겼습니다.");

            } else if (컴퓨터의선택 == 2) {  //보
                System.out.println("나:가위, 컴:보");
                System.out.println("당신이 이겼습니다.");

            }

        } else if (나의선택 == 1) {
            if (컴퓨터의선택 == 0) { //바위
                System.out.println("나:바위, 컴:가위");
                System.out.println("당신이 이겼습니다.");

            } else if (컴퓨터의선택 == 1) {  //바위
                System.out.println("나:바위, 컴:바위");
                System.out.println("무승부입니다.");


            } else if (컴퓨터의선택 == 2) {  //보
                System.out.println("나:바위, 컴:보");
                System.out.println("컴퓨터가 이겼습니다.");


            }
        } else if (나의선택 == 2) {
            if (컴퓨터의선택 == 0) { //보
                System.out.println("나:보, 컴:가위");
                System.out.println("컴퓨터가 이겼습니다.");

            } else if (컴퓨터의선택 == 1) {  //바위
                System.out.println("나:보, 컴:바위");
                System.out.println("당신이 이겼습니다.");


            } else if (컴퓨터의선택 == 2) {  //보
                System.out.println("나:보, 컴:보");
                System.out.println("무승부입니다.");


            }
        }





    }//~main

}
