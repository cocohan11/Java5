package 연습;

public class 확률 {


    public static void main(String[] args) {

        while (true) {


            for (int i = 0; i < 10; i++) {

                if (Math.random() <= 0.8) {

                    System.out.println(i);
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("miss");
                }
            }

        }
    }
}
