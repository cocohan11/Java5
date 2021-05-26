package Output;

import java.util.Scanner;

public class MoveNo {
    // 역 도착 - 이동n - 수면y/n


    // 필드
    int SleepBloodRise; //수면 시 체력상승
    int SleepBloodFall; //수면 시 체력감소


    // 메소드
    void MoveNoRest() {

            Scanner 입력 = new Scanner(System.in); //스캐너 시작

            String rest = 입력.next(); //사용자입력

            if (rest.equals("y") ||rest.equals("Y")) {

                System.out.println("숙면을 자서 체력을 "+SleepBloodRise+"만큼 회복합니다."); // << 체력회복 + n 되게 만들기
            }
            else if (rest.equals("n") ||rest.equals("N")) {

                System.out.println("밤 새실건가요.");
                System.out.println("숙면을 취하지 못해 체력이 "+SleepBloodFall+"만큼 고갈되었습니다."); // << 체력고갈 - n 되게 만들기

            } else {
                System.out.println("위의 선택지 안에서 고르세요");
            }

    }
}

//rest를 변수로 만들어야됨
