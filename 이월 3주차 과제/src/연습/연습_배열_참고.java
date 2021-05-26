package 연습;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class 연습_배열_참고 {
    public static void main(String[] args) {


        //------------- 배열이용해 세 값의 평균 구하기 ~ -----------------
        /*Scanner 입력 = new Scanner(System.in);

        double 숫자[] = new double[3];

        for (int N=0; N<3; N++) {
            System.out.println(N+1+"번째 숫자를 입력하십시오");
            숫자[N] = 입력.nextInt();                            //0번째 사물함칸에 사용자입력값이 들어감.
        }

        double 평균 = (숫자[0]+숫자[1]+숫자[2])/3;
        System.out.println("세 숫자의 평균값은 : "+평균);*/

        //------------- ~ 배열이용해 세 값의 평균 구하기 -----------------



         /*  *
            ***
           *****
            ***
             *

             *
             **
             ***
*/


/*        int[][] array5 = new int[5][];
        array5[0] = new int[1];                        //인덱스0에 1개를 넣겠다
        array5[1] = new int[3];                        //인덱스0에 1개를 넣겠다
        array5[2] = new int[5];                        //인덱스0에 1개를 넣겠다
        array5[3] = new int[7];                        //인덱스0에 1개를 넣겠다
        array5[4] = new int[9];                        //인덱스0에 1개를 넣겠다*/

        //---------------------------------------------------------------------------


/*        int[] row; //참조변수 row를 객체로 만듦.
        row = new int[1];  //한 칸 만듦
        int[] column = new int[]{1,2,3,4,5,6,7,8,9};  //*/


        //---------------------------------------------------------------------------

/*        // 배열 참조변수만 선언
        int[] 배열;
        int 방만들기 [];

        // 참조변수&크기 선언
        int[] 하하 = new int[5];
        int 후하 [] = new int[5];

        // 기존의 참조변수에 크기 할당
        배열 = new int[2];

        // 참조변수&크기 선언 및 값 초기화
        String [] weeks = {"월", "화", "수", "목", "금", "토", "일"};

        // 2차원배열선언
        int[][] arr = new int[4][3];

        // 배열과 for문
        int i=0;
        int[] 울랄 = new int[5];
        for (i =0; i<울랄.length; i++) {
            System.out.println(울랄[i]);
        }*/

        //---------------------------------------------------------------------------
/*        int[] i_array;
        int i_array2[];

        //배열 생성후 초기화하면 배열의 주소가 할당된다. (?)
        int[] i_array1 = new int[8]; //초기값 0

        int[] I_arr;
        I_arr = new int[8];*/
        //---------------------------------------------------------------------------

     /*   //길이가 8인 자동차 객체배열 선언
        Car [] car = new Car[8];

        //각 배열에는 아직 NULL값만 존재한다.
        System.out.println(car[1]);

        //배열안의 자동차클래스를 초기화시켜주어야한다.
        for (int i=0; i< car.length; i++) {
            car[i] = new Car();
        }

        //배열에 주소값이 제대로 설정된다.
        System.out.println(car[1]);
*/
        //---------------------------------------------------------------------------

/*
        // size:10, index range from 0 to 9
        int [] intArr3 = new int[10];

        // size:4, index range from 0 to 3
        int[] intArr4 = {1,2,3,4};

        // size:5, index range form 0 to 4
        int[] intArr5 = {0,0,0,0,0};

        //출력
        System.out.println(Arrays.toString(intArr3));
        System.out.println(Arrays.toString(intArr4));
        System.out.println(intArr4[1]);
*/

      /*
      출력 :
        [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        [1, 2, 3, 4]
        2
*/

        //---------------------------------------------------------------------------

       /* int[] numbers = new int[3];
        numbers[0] = 4;
        numbers[1] = 10;
        numbers[2] = 20;
        // Compile error
        System.out.println(numbers[2]);
        // Run time error


        String[] inventory = new String[2];
        inventory[0] = "거미";
        inventory[1] = "방패";
        System.out.println(inventory[0]);


        String[] fruit = {"apple", "orange"};
        System.out.println(fruit[0]);


        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);


        for (int i=0; i< numbers.length; i++) {   //3대신 numbers.length씀
            System.out.println(numbers[i]);
        }

        for (int 전부출력할래: numbers) {
            System.out.println(전부출력할래);   //신기하다
        }

        for (String 과일다꺼내: fruit) {
            System.out.println(과일다꺼내);
        }
*/
        //---------------------------------------------------------------------------


        //다중배열 방법1
/*        int[][] nubers = {
                {10,30,80},
                {1,3,8},
                {100,200,300}
        };*/

/*
        //다중배열 방법2
        String[][] inventory = new String[2][4];  //new일땐 갯수 나머진 인덱스
        inventory[0][0] = "sword";
        inventory[3][0] = "sword2";
        System.out.println(inventory[0][0]);
*/


/*
        //1차
        for (int x=0; x < nubers.length; x++) {
            for (int y=0; y < nubers[x].length; y++) {
                System.out.print(nubers[x][y]+"\t");
            }
            System.out.println();
        }
*/


        /*
            *
           ***
          *****
           ***
            *

         */



        String[][] star = {
                {"_","_","*","_","_"},
                {"_","*","*","*","_"},
                {"*","*","*","*","*"},
                {"_","*","*","*","_"},
                {"_","_","*","_","_"}


        };

/*
        for (int i=0; i < star.length; i++) {                //star.lenght :4   //1차배열을 뜻함
            for (int j=0; j < star[i].length; j++) {         //stra[i].length :5    //안에 i가 01234 들어감.
                System.out.print(star[i][j]);                                             // 인덱스0인 star줄의 최대길이는 5
            }
            System.out.println();
        }
*/

        //---------------------------------------------------------------------------
/*
        String str = "abc";
        String repeated = str.repeat(3);

        System.out.println(repeated);

        *//*

        *
        ***
        *****
        ***
        *

         *//*

        Scanner 사용자입력 = new Scanner(System.in);
        System.out.println("입력 값: ");
        int 값 = 사용자입력.nextInt();
        if (값%2==0) { //짝수라면
            값 = 값 + 6;
        } else {
            값 = 값 + 5;
        }

        int n = 값;
        while (n >= -값) {

            System.out.println("*".repeat(값+1 - Math.abs(n)));
            n = n -2;
        }*/


        /*

         __*
         _***
         *****
         _***
         __*

         */



        //참고

                Scanner 입력 = new Scanner(System.in);
                char material;

                System.out.println("숫자를 입력하세요 : ");
                int number=입력.nextInt();
                //도형 크기를 결정하는 숫자를 입력 받음.

                material = '#';
                //도형을 채워넣을 문자



                char[][] Matrix = new char[2*number+1][2*number+1];
                // 2n+1 X 2n+1 배열 생성



                //* 매트릭스 빈칸으로 꽉 채우는 코드
                for(int i=0;i<2*number+1;i++)
                {
                    for(int j=0;j<2*number+1;j++)
                    {
                        Matrix[i][j] = ' ';
                    }
                }


                //------------도형 채워넣는 코드----------------------
                //위쪽 산
                for(int i=0;i<number;i++)
                {
                    for(int j=number-i;j<number+i+1;j++)
                    {
                        Matrix[i][j] = material;
                    }
                }

                //가운데 라인
                for(int i=0;i<2*number+1;i++)
                {
                    Matrix[number][i] = material;
                }

                //아래쪽 산
                for(int i=number+1;i<2*number+1;i++)
                {
                    for(int j=i-number;j<3*number-i+1;j++)
                    {
                        Matrix[i][j] = material;
                    }
                }
                //--------------------------------------------------


                // 매트릭스 전체를 출력하는 코드!!
                for(int i=0;i<2*number+1;i++)
                {
                    for(int j=0;j<2*number+1;j++)
                    {
                        System.out.print(Matrix[i][j]);
                    }
                    System.out.print("\n");
                }





        //====================================================================





















    } //~main


}
