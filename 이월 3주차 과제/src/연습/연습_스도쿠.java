package 연습;

import java.util.Scanner;

public class 연습_스도쿠 {

    public static void main(String[] args) {


        //스캐너
        Scanner 사용자입력 = new Scanner(System.in);
        System.out.println("입력값 : ");
        int 입력값 = 사용자입력.nextInt();



        //입력값 < 3 : 그냥 3으로 출력
        if (입력값 < 3) {
            System.out.println("3 이상을 입력해주세요.");
            입력값 = 3;

        } //탈출해도 입력값=3




        int[][] 스도쿠 = new int[입력값][입력값];

        for (int i=0; i < 스도쿠.length; i++) {

            for (int j=0; j < 스도쿠[0].length; j++) {

                스도쿠[i][j] = 입력값;
                System.out.print(스도쿠[i][j]+" ");
                입력값++;
            }
            System.out.println();
        }









    }
}
