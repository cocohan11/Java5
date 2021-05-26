import java.util.Scanner;

public class 원 {
    public static void main(String[] args) {

        Scanner 사용자입력 = new Scanner(System.in);
        System.out.println("입력값 : ");
        int r = 사용자입력.nextInt();
        r += 10;   //최소 7부터 시작해야 원 다운 원이 만들어짐


        //변수
        String 별 = "* ";
        String 띄 = "_ ";


        //바둑판 생성
        String[][] 바둑판 = new String[2*r+1][2*r+1];


        for (int i=0; i<2*r+1; i++) {
            for (int j=0; j<2*r+1; j++) {
                바둑판[i][j] = 띄;
            }
        }
        //================================ 원 만들기 ===============================


/*
         (여기서 헤맴)
         for (int x= 0; x< 2*r+1; x++) {

            for (int y= 0; y< 2*r+1; y++) {

                if (x*x +y*y <= r*r) {

                    바둑판[x][y] = 별;
                } else {
                    바둑판[x][y] = 띄;
                }
            }
        }*/


        for (int x= 0; x< 2*r+1; x++) {
            for (int y= 0; y< 2*r+1; y++) {
                                                            //원의 방정식 사용 : x^2 + y^2 = r^2
                                                            //+9 : +9만큼 했더니 옆구리,꼭대기,밑동이 안정적이라서 더함.
                if ( (x-r)*(x-r) +(y-r)*(y-r) <= r*r+9) {   //원의 중심이 0,0이 아니라 r,r이라서 빼줌
                                                            //원래식은 '=' 이지만 반지름보다 더 작은 x와 y값을 찍어내려고 '<'부등호 씀
                    바둑판[x][y] = 별;
                } else {
                    바둑판[x][y] = 띄;
                }
            }
        }


        //================================ 전체 출력 ===============================
                for (int i=0; i<2*r+1; i++) {
            for (int j=0; j<2*r+1; j++) {
                System.out.print(바둑판[i][j]);
            }
            System.out.println();
        }

    }


}
