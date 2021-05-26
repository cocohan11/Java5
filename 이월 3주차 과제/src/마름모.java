import java.util.Scanner;

public class 마름모 {

    public static void main(String[] args) {

        Scanner 사용자입력값 = new Scanner(System.in);
        System.out.println("원하는 줄 수를 입력하세요 : ");


        int N = 사용자입력값.nextInt();

        N = N+1;

        for (int 줄수=1; 줄수<=N; 줄수++) {
            for (int 횟수=N; 횟수>=줄수; 횟수--) {        //5번반복 : _____ 횟수 >= 숫자 << 숫자가 높아져야함
                System.out.print(" ");
            }
            for (int 횟수=1; 횟수<=줄수; 횟수++) {
                System.out.print("*");
            }
            for (int 횟수=2; 횟수<=줄수; 횟수++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //-------------------줄바꿈-------------------
        for (int 중간=1; 중간<=N*2+1; 중간++){
            System.out.print("*");
        } System.out.println();

        //-------------------줄바꿈-------------------
        for (int 줄수=1; 줄수<=N; 줄수++) {
            for (int 횟수 = 1; 횟수 <= 줄수; 횟수++) {
                System.out.print(" ");
            }
            for (int 횟수 = N; 횟수 >= 줄수; 횟수--) {
                System.out.print("*");
            }
            for (int 횟수 = N - 1; 횟수 >= 줄수; 횟수--) {
                System.out.print("*");
            }
            System.out.println();

        }


    }
}

