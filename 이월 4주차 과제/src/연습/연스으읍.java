package 연습;

import java.util.Scanner;

public class 연스으읍 {

    public static void main(String[] args) {
        Scanner 입력 = new Scanner(System.in);

        System.out.println("회복이라 입력하세요");
        String 생존후체력 = 입력.nextLine();
        String str = "회복";


        System.out.println("선언");

        if (생존후체력.equals(str)) {
            System.out.println("회복됐다!");
        } else {
            System.out.println("...");
        }

        System.out.println("if 탈출");
    }
}
