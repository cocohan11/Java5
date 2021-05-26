

class Fight {

    //필드
    int 남는체력;
    int 공격력;

   //생성자
   Fight(int a, int b) {

        남는체력 = a;
        공격력 = b;
    }

    //메소드
    static int M_result(int a, int b) {

        return a - b;

    }

}
