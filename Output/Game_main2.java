
import 생명체.Player;
import 생명체.Zombie;
import 스레드.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game_main2 {



    public static void main(String[] args) {

        Scanner 입력 = new Scanner(System.in); //스캐너 시작

        // 게임스타트
        System.out.println("\n" +
                           "╔══════════════════════╗\n" +
                           "  맛있는 좀비 GAME START\n" +
                           "╚══════════════════════╝\n");

        //while안에 if안에 if썼더니 됐음!
        while (true) {

                // 문자누를 때 다시 숫자누르라는 안내뜸
                try {

                    // 1.시작  2.설명
                    System.out.println("\n1.시작  2.설명");

                    // 사용자 선택
                    int 도입 = 입력.nextInt();

                    if (도입 == 1) {
                        //배열, Thread.sleep 사용
                        Player 배열 = new Player(200, "게임이 시작됩니다.\n",
                                ".\n",
                                ".\n",
                                ".\n",
                                ".\n",
                                "","","","","","");
                        배열.P_배열sleep();

                        break;

                    } else if (도입 == 2) {

                        //배열, Thread.sleep 사용
                        Player 배열 = new Player(800,
                                "20xx년 한국, 좀비 바이러스가 창궐했습니다.\n",
                                "생존자인 당신은 살아남기위해 고군분투해야합니다.\n",
                                "좀비들을 우선 알아보자면, 좀비는 인간이었을 적 먹었던 음식과 합성되어 좀비로 다시 태어납니다.\n",
                                "좀비화 직전에 국밥을 먹었으면 국밥좀비가 되는 것이지요...\n",
                                "좀비를 무찌르면서 안전지대인 용산으로 가야합니다.\n",
                                "참고로 국밥좀비를 무찌르면 국밥을 준답니다. 라떼좀비를 무찌르면 라떼를 줍니다.\n",
                                "좀비에게서 식량을 취하면서 이동하세요!\n",
                                "행운을 빕니다.\n\n",

                                "0.이전",
                                "","");
                        배열.P_배열sleep(); // ~배열, Thread.sleep 사용

                        }

                        int 이전 = 입력.nextInt();
                        if (이전 == 0) {
                        } else {
                            System.out.println("위의 선택지 안에서 고르세요");
                        }

                }
                // 입력 값의 타입이 맞지 않을 때
                catch (InputMismatchException e) {
                    // Scanner의 버그로 인해 다시 초기화
                    입력 = new Scanner(System.in);
                    System.out.println("※ 숫자만 입력 가능합니다 ※");
                }
        }


            //이름묻기
            System.out.println("당신의 이름을 알려주세요");
            String yourName = 입력.next(); // nextLine쓰면 엔터값이 남아(?) 출력안됨.. next쓰기

            Player 원룸 = new Player(200,
               "\n\n\n\n" +
                    "╯▅╰╱▔▔▔▔▔▔▔╲╯╯☼\n" +
                    "▕▕╱╱╱╱╱╱╱╱╱╲╲╭╭\n",
              "▕▕╱╱╱╱╱╱╱╱┛▂╲╲╭\n" +
                    "╱▂▂▂▂▂▂╱╱┏▕╋▏╲╲\n",
              "▔▏▂┗┓▂▕▔┛▂┏▔▂▕▔\n" +
                    "▕▕╋▏▕╋▏▏▕┏▏▕╋▏▏\n",
              "▕┓▔┗┓▔┏▏▕┗▏┓▔┏▏\n",
              "생존자 " + yourName + "님은 유일한 안전지대인 용산역으로 가서 피신해야 합니다. \n",
              "당신은 현재 사당동 원룸입니다.\n\n","밖으로 나갑니다.\n",".\n",".\n",".\n",".\n");

            원룸.P_배열sleep();
            String 엔터 = 입력.nextLine(); //스캐너 데이터타입이 int라서 String으로 바꿔주려고 작성한 코드
            입력.nextLine(); // 엔터




            //===================================[[ 사당 ]]-->동작-->이촌-->용산===========================================
            while (true) { // 1.행진  2.상태  3.인벤 반복
                try {
                    //배열, Thread.sleep 사용
                    Player 전투시작 = new Player(300, "\n[[ 사당 ]]",
                            "--> 동작 --> 이촌 --> 용산\n",
                            "현재 사당역입니다. 다음 무엇을 하시겠습니까?\n",
                            "1.행진  2.상태  3.인벤\n","","","","","","","");
                    전투시작.P_배열sleep();
                    //~배열, Thread.sleep 사용

                // 사용자 선택
                int 역도착 = 입력.nextInt();

                    if (역도착 == 1) {
                        //배열, Thread.sleep 사용
                        Player 슬립 = new Player(200, "\n\n\n\n동작역을 향해 이동합니다.\n",
                                ".\n",
                                ".\n",
                                ".\n",
                                ".\n",
                                "이동중 좀비가 나타났다...!!\n\n\n\n",
                                "=============================\n          전 투 시 작\n=============================\n",
                                ".\n",".\n",".\n",".\n\n");
                        슬립.P_배열sleep();
                        //~배열, Thread.sleep 사용


                    // ------------------------------- 설정값 -----------------------------------------
                        Player 전투P = new Player(yourName, "기본 나무배트", 0, "매질(+공격력 0)",
                                500, 500, 50, 1, 0,0);
                        Zombie 전투Z = new Zombie("오렌지맛 좀비", 100, 100,
                                35, 1, 500, "오렌지", 0);
                        전투Z.ZFight_hi();



                        int 전투 = 입력.nextInt(); // 1.나무배트  2.창

                    //-------------------------------- 전투시작 -----------------------------------------

                        // 1. 기본 나무배트(in사당)
                        if (전투 == 1) {
                            //스레드 불러오기

                            //플레이어
                            Runnable 스레드메인전투1 = new 스레드_플_러너블_사당_배트();
                            Thread thread1 = new Thread(스레드메인전투1);
                            thread1.start();

                            //좀비
                            Runnable 스레드메인전투2 = new 스레드_좀비_러너블_사당_배트();
                            Thread thread2 = new Thread(스레드메인전투2);
                            thread2.start();

                            //join으로 스레드 제어 : 해당 쓰레드가 종료되기까지 기다렸다가 다음으로 넘어감.
                           try {
                                thread2.join();
                            }catch (Exception e) {}
                            //while빠져나오고 바로 물리쳤다고 끝내기
                        }




                        // 2. 창
                        else if (전투 == 2) {

                            //스레드 불러오기

                            //플레이어
                            Runnable 스레드메인전투3 = new 스레드_플_러너블_사당_창();
                            Thread thread3 = new Thread(스레드메인전투3);
                            thread3.start();


                            //좀비
                            Runnable 스레드메인전투4 = new 스레드_좀비_러너블_사당_창();
                            Thread thread4 = new Thread(스레드메인전투4);
                            thread4.start();

                            //join으로 스레드 제어 : 해당 쓰레드가 종료되기까지 기다렸다가 다음으로 넘어감.
                            try {
                                thread4.join();
                            }catch (Exception e) {}
                            //while빠져나오고 바로 물리쳤다고 끝내기

                        } else {
                            System.out.println("위의 선택지 안에서 고르세요");
                        }

                        //전투함수!!!
                        // 좀비 남은체력이 0이면 물리쳤다면서 끝내기
                        break;

                    // 상태
                    } else if (역도착 == 2) {
                        Player 상태 = new Player(yourName, "창", 30, "창던지기(+공격력 30)", 500, 500, 50, 1, 0,0);
                        상태.P_info();

                    // 인벤
                    } else if (역도착 == 3) {

                        //여길 고쳐야 작동할듯. 문제 : 전투 후 인벤토리를 바꾸고 싶음. 섭취할 수 있도록. 그게 레벨인건데 잘 안됨..
                        // 레벨이 1이상이어야 포션 먹을 수 있음
                        Player 레벨인벤 = new Player();
                        if (Player.레벨 > 1) {
                            인벤 인벤토리 = new 인벤("기본나무 배트 ㅣ", " 창 ㅣ", "오렌지(+50) ", "", "", 500);
                            인벤토리.인벤();

                            // 포션 섭취
                            int 포션 = 입력.nextInt();
                            if (포션 == 1) {
                                Player.남은체력 = Player.남은체력 + 50;
                                if (Player.남은체력 > 500) {
                                    Player.남은체력 = 500;
                                }
                                System.out.println(Player.남은체력 + "/500");
                            } else {
                                System.out.println("위의 선택지 안에서 고르세요");
                            }
                        } else {
                            인벤 인벤토리 = new 인벤("기본나무 배트 ㅣ", " 창 ㅣ", "", "", "", 500);
                            인벤토리.인벤();
                        }
                    } else {
                        System.out.println("위의 선택지 안에서 고르세요");
                    }
                }
                // 입력 값의 타입이 맞지 않을 때
                catch (InputMismatchException e) {
                    입력 = new Scanner(System.in);
                    System.out.println("※ 숫자만 입력 가능합니다 ※");
                }
            }

            //===================================사당-->[[ 동작 ]]-->이촌-->용산===========================================



            입력.nextLine(); // 엔터

            while (true) {
                try {
                //배열, Thread.sleep 사용
                Player 전투시작 = new Player(300,
                        "사당--> [[ 동작★ ]] -->이촌-->용산\n",
                        "현재 동작역입니다. 다음 무엇을 하시겠습니까?\n",
                        "1.행진  2.상태  3.인벤\n","","","","","","","","");
                전투시작.P_배열sleep();
                //~배열, Thread.sleep 사용

                // 사용자 선택
                int 역도착 = 입력.nextInt();

                // 전투
                if (역도착 == 1) {

                    //배열, Thread.sleep 사용
                    Player 슬립 = new Player(200, "\n\n\n\n동작역을 향해 이동합니다.\n",
                            ".\n",
                            ".\n",
                            ".\n",
                            ".\n",
                            "이동중 좀비를 만납니다..!!\n\n\n\n",
                            "=============================\n" +
                                  "          전 투 시 작\n" +
                                  "=============================\n",
                            ".\n",".\n",".\n",".\n\n");
                    슬립.P_배열sleep();
                    //~배열, Thread.sleep 사용

                    Player 전투P = new Player(yourName, "기본 나무배트", 0, "매질(+공격력 0)", 500, 500, 50, 2, 0,0);
                    Zombie.Zombie_jjajang 전투Z = new Zombie.Zombie_jjajang("짜장면맛 좀비", 150, 150, 55, 2, 650, "짜장면", 0);
                    전투Z.ZFight_hi();
                    int 전투 = 입력.nextInt(); // 1.공격  2.스킬

                    // 1. 기본 나무배트(in동작)
                    if (전투 == 1) {

                        //스레드 불러오기

                        //플레이어
                        Runnable 스레드메인전투5 = new 스레드_플_러너블_동작_배트();
                        Thread thread5 = new Thread(스레드메인전투5);
                        thread5.start();


                        //좀비
                        Runnable 스레드메인전투6 = new 스레드_좀비_러너블_동작_배트();
                        Thread thread6 = new Thread(스레드메인전투6);
                        thread6.start();

                        //join으로 스레드 제어 : 해당 쓰레드가 종료되기까지 기다렸다가 다음으로 넘어감.
                        try {
                            thread6.join();
                        }catch (Exception e) {}
                        //while빠져나오고 바로 물리쳤다고 끝내기
                        //여기에 브레이크해야 다시 선택지 안 줌.
                        break;
                    }


                    // 2. 창
                    else if (전투 == 2) {

                        //스레드 불러오기

                        //플레이어
                        Runnable 스레드메인전투7 = new 스레드_플_러너블_동작_창();
                        Thread thread7 = new Thread(스레드메인전투7);
                        thread7.start();


                        //좀비
                        Runnable 스레드메인전투8 = new 스레드_좀비_러너블_동작_창();
                        Thread thread8 = new Thread(스레드메인전투8);
                        thread8.start();

                        //join으로 스레드 제어 : 해당 쓰레드가 종료되기까지 기다렸다가 다음으로 넘어감.
                        try {
                            thread8.join();
                        }catch (Exception e) {}
                        //while빠져나오고 바로 물리쳤다고 끝내기
                        break;

                    } else {
                        System.out.println("위의 선택지 안에서 고르세요");
                    }


                    //전투함수!!!
                    // 좀비 남은체력이 0이면 물리쳤다면서 끝내기

                    //배열, Thread.sleep 사용
                    Player 이촌 = new Player(300,
                            "사당-->동작--> [[ 이촌 ]] -->용산\n",
                            "현재 이촌역입니다. 다음 무엇을 하시겠습니까?\n",
                            "1.행진  2.상태  3.인벤\n","","","","","","","","");
                    전투시작.P_배열sleep();
                    //~배열, Thread.sleep 사용

                    break;
                } else if (역도착 == 2) {
                    Player 상태 = new Player(yourName, "창", 30, "창던지기(+공격력 30)", 500, 500, 50, 2, 0, 0);
                    상태.P_info();
                } else if (역도착 == 3) {

                    // 레벨이 1이상이어야 포션 먹을 수 있음
                    Player 레벨인벤 = new Player();
                    if (레벨인벤.레벨 > 2) {
                        인벤 인벤토리 = new 인벤("기본나무 배트 ㅣ", " 창 ㅣ", "1.오렌지(+50) ", "2.짜장면(+80)", "", 500);
                        인벤토리.인벤();

                        // 포션 섭취
                        int 포션 = 입력.nextInt();
                        if (포션 == 1) {
                            Player.남은체력 = Player.남은체력 + 50;
                            if (Player.남은체력 > 500) {
                                Player.남은체력 = 500;
                            }
                            System.out.println(Player.남은체력 + "/500");
                        } else if (포션 == 2) {
                            Player.남은체력 = Player.남은체력 + 80;
                            if (Player.남은체력 > 500) {
                                Player.남은체력 = 500;
                            }
                            System.out.println(Player.남은체력 + "/500");
                        } else {
                            System.out.println("위의 선택지 안에서 고르세요");
                        }
                    } else {
                        인벤 인벤토리 = new 인벤("기본나무 배트 ㅣ", " 창 ㅣ", "", "", "", 500);
                        인벤토리.인벤();
                    }
                } else {
                    System.out.println("위의 선택지 안에서 고르세요");
                }
            }    // 입력 값의 타입이 맞지 않을 때
                catch (InputMismatchException e) {
                    입력 = new Scanner(System.in);
                    System.out.println("※ 숫자만 입력 가능합니다 ※");
                }
            }

        System.out.println("이제 이촌가자");




        //===================================사당-->동작--> [[ 이촌]] -->용산===========================================

        while (true) {
            try {
            //배열, Thread.sleep 사용
            Player 전투시작 = new Player(300,
                    "사당-->동작-->[[ 이촌 ]]-->용산\n",
                    "현재 이촌역입니다. 다음 무엇을 하시겠습니까?\n",
                    "1.행진  2.상태  3.인벤\n","","","","","","","","");
            전투시작.P_배열sleep();
            //~배열, Thread.sleep 사용

            // 사용자 선택
            int 역도착 = 입력.nextInt();

            // 전투
            if (역도착 == 1) {

                //배열, Thread.sleep 사용
                Player 슬립 = new Player(200, "\n\n\n\n용산역을 향해 이동합니다.\n",
                        ".\n",
                        ".\n",
                        ".\n",
                        ".\n",
                        "이동중 좀비를 만납니다..!!\n\n\n\n",
                        "=============================\n" +
                                "          전 투 시 작\n" +
                                "=============================\n",
                        ".\n",".\n",".\n",".\n\n");
                슬립.P_배열sleep();
                //~배열, Thread.sleep 사용

                Player 전투P = new Player(yourName, "기본 나무배트", 0, "매질(+공격력 0)", 500, 500, 50, 1, 0,0);
                Zombie.Zombie_jjajang 전투Z = new Zombie.Zombie_jjajang("김치찌개맛 좀비", 150, 150, 55, 2, 650, "김치찌개", 0);
                전투Z.ZFight_hi();
                int 전투 = 입력.nextInt(); // 1.공격  2.스킬

                // 1. 기본 나무배트
                if (전투 == 1) {

                        //스레드 불러오기

                        //플레이어
                        Runnable 스레드메인전투9 = new 스레드_플_러너블_이촌_배트();
                        Thread thread9 = new Thread(스레드메인전투9);
                        thread9.start();


                        //좀비
                        Runnable 스레드메인전투10 = new 스레드_좀비_러너블_이촌_배트();
                        Thread thread10 = new Thread(스레드메인전투10);
                        thread10.start();

                        //join으로 스레드 제어 : 해당 쓰레드가 종료되기까지 기다렸다가 다음으로 넘어감.
                        try {
                            thread10.join();
                        }catch (Exception e) {}
                        //while빠져나오고 바로 물리쳤다고 끝내기
                        break;

                }

                // 2. 창
                else if (전투 == 2) {

                    //스레드 불러오기

                    //플레이어
                    Runnable 스레드메인전투11 = new 스레드_플_러너블_사당_배트();
                    Thread thread11 = new Thread(스레드메인전투11);
                    thread11.start();


                    //좀비
                    Runnable 스레드메인전투12 = new 스레드_좀비_러너블_사당_배트();
                    Thread thread12 = new Thread(스레드메인전투12);
                    thread12.start();

                    //join으로 스레드 제어 : 해당 쓰레드가 종료되기까지 기다렸다가 다음으로 넘어감.
                    try {
                        thread12.join();
                    }catch (Exception e) {}
                    //while빠져나오고 바로 물리쳤다고 끝내기
                    break;

                }

                else {
                    System.out.println("위의 선택지 안에서 고르세요");
                }


                //전투함수!!!
                // 좀비 남은체력이 0이면 물리쳤다면서 끝내기

                //배열, Thread.sleep 사용
                Player 이촌 = new Player(300,
                        "사당-->동작--> [[ 이촌 ]] -->용산\n",
                        "현재 이촌역입니다. 다음 무엇을 하시겠습니까?\n",
                        "1.행진  2.상태  3.인벤\n","","","","","","","","");
                전투시작.P_배열sleep();
                //~배열, Thread.sleep 사용

                break;
            } else if (역도착 == 2) {
                Player 상태 = new Player(yourName, "창", 30, "창던지기(+공격력 30)", 500, 500, 50, 3, 0, 0);
                상태.P_info();
            } else if (역도착 == 3) {

                // 레벨이 1이상이어야 포션 먹을 수 있음
                Player 레벨인벤 = new Player();
                if (레벨인벤.레벨 > 2) {
                    인벤 인벤토리 = new 인벤("기본나무 배트 ㅣ", " 창 ㅣ", "1.오렌지(+50) ", "2.짜장면(+80)", "김치찌개(+160)", 9999);
                    인벤토리.인벤();

                    // 포션 섭취
                    int 포션 = 입력.nextInt();
                    if (포션 == 1) {
                        Player.남은체력 = Player.남은체력 + 50;
                        if (Player.남은체력 > 500) {
                            Player.남은체력 = 500;
                        }
                        System.out.println(Player.남은체력 + "/500");
                    } else if (포션 == 2) {
                        Player.남은체력 = Player.남은체력 + 80;
                        if (Player.남은체력 > 500) {
                            Player.남은체력 = 500;
                        }
                        System.out.println(Player.남은체력 + "/500");
                    } else {
                        System.out.println("위의 선택지 안에서 고르세요");
                    }
                } else {
                    인벤 인벤토리 = new 인벤("기본나무 배트 ㅣ", " 창 ㅣ", "", "", "", 9999);
                    인벤토리.인벤();
                }


            } else {
                System.out.println("위의 선택지 안에서 고르세요");
            }
        }

        // 입력 값의 타입이 맞지 않을 때
        catch (InputMismatchException e) {
            입력 = new Scanner(System.in);
            System.out.println("※ 숫자만 입력 가능합니다 ※");
        }
    }
        System.out.println("용산도착!!");
        System.out.println("안전한 곳으로 피신합니다.");
        System.out.println("\nFINISH..");














        //to do : 생명체에 2차상속 만들기. 지금껏 만든 좀비 연결시키기, 전투만들기, 인벤만들기
            //to do : 메소드를 따로 만드는게 최선일까? 음 우선 전투 체력깎이게 연결시키기.
//왜 동작이 반복되어 나오는거지?? 어떻게 없앰...

        } // 메인메소드 끝



} // 클래스 끝





/*
import java.util.Scanner;

public class Game_main {

    public static void main(String[] args) {

        Scanner 스캐너 = new Scanner(System.in); //스캐너 시작


        System.out.println("<전날 먹은 좀비> \n GAME START ! \n");

        // 1.시작  2.설명(0.나가기)

        System.out.println("탈출인가");
        역이동.MoveStation();
        void 도돌이표() {
            System.out.println("1.시작  2.설명");

            Scanner 스캐너 = new Scanner(System.in); //스캐너 시작
            int 시작설명 = 스캐너.nextInt(); // 0.나가기

            if (시작설명 == 1) {
                MayIHelp();

            } else if (시작설명 == 2) {

                Start_loop 스캐너값 = new Start_loop("오프닝");
                // 1.시작  2.설명
                스캐너값.again();
            } else {
                System.out.println("위의 선택지 안에서 고르세요");
            }
        }



        // 게임설명
        while (true) {
            System.out.println("게임 설명");
            System.out.println("0.나가기");
            Scanner 스캐너값 = new Scanner(System.in); //스캐너 시작
            int 설명나가기 = 스캐너값.nextInt(); // 0.나가기

            if (설명나가기 == 0) {
                break;                                  //나가서 아래로 감☆
            }
            else {
                System.out.println("위의 선택지 안에서 고르세요");
            }

        }



        // 함수 : 무엇을 도와드릴까요?
        System.out.println("-----무엇을 도와드릴까요?-----\n" +
                " 1. 역이동\n" +
                " 2. 정보\n" +
                " 3. 인벤\n" +
                "---------------------------");
        while (true) {

            Scanner 스캐너값 = new Scanner(System.in); //스캐너 시작
            int 도움 = 스캐너값.nextInt(); // 0.나가기

            if (도움 == 1){
                //역이동-전투 여기에 넣으면 되겠다
                이동or나감.이동나감();
            }
            else if (도움 == 2) {
                정보.info();
            }
            else {
                System.out.println("위의 선택지 안에서 고르세요");
                break;
            }

        }



        // 이동 재확인
        System.out.println("이동하시겠습니까?\n" +
                "1. 네\n" +
                "0. 나가기");
        while (true) {

            Scanner 스캐너값 = new Scanner(System.in); //스캐너 시작
            int 이동나감 = 스캐너값.nextInt(); // 0.나가기
            System.out.println("이동");

            if (이동나감 == 1){
                역이동.MoveStation();

                break;
                //역이동>>전투//함수 뺌. 메인으로 나가려서 함수시작하기
            }

            else if (이동나감 == 0){ // 나가기
                게임시작.MayIHelp(); // 여기쓰는거맞음?
                break;                                  //나가서 아래로 감☆
            }
            else {
                System.out.println("위의 선택지 안에서 고르세요");
                break;
            }

        }
        System.out.println("드디어 도돌이표 함수를 빠져나왔다");





        // 전투 시작
        System.out.println("이동합니다.\n.\n.\n.\n.\n" +
                "앞으로 좀비를 해치우면서 역을 이동할겁니다." +
                "당신의 이름을 입력해주세요");

        Scanner 스캐너값 = new Scanner(System.in); //스캐너 시작
        String 당신이름 = 스캐너값.nextLine();

        System.out.println("★★미션★★ " +
                "\n생존자 "+당신이름+"님은 용산역으로 피신해야 합니다." +
                "좀비들은 본인이 전 날 먹은 음식을 기억하고 그 음식을 좀비화 합니다.\n" +
                "좀비를 무찌르면 그 음식을 보상으로 받으니 그걸 먹으며 안전지대 용산으로 가세요.");
        스캐너값.nextInt();
        System.out.println("자, 준비되셨으면 아무 숫자나 입력하세요");
        System.out.println(".\n.\n.\n.\n이동합니다.\n.\n.\n.\n.\n");
        System.out.println("이동중 좀비를 만납니다..!!\n.\n.\n.\n<<<<<전투시작>>>>\n\n\n\n");

// 객체 생성 + 생성자 : 플레이어------------------------------------------------------------------------------------------------
        Player P1 = new Player(당신이름, "창으로 찌르기",500, 500, 50, 1, 0);


        // 객체 생성 + 생성자 : 좀비 : 하위-오렌지
        Zombie.Zombie_orange Z_orange = new Zombie.Zombie_orange("[오렌지 산성뱉기]", "시큼한 오렌지 냄새가 난다.","[오렌지맛 좀비]",100, 100,35,1
                ,500,1);
        //--------------------------------------------------------------------------------------------------------------------------





        // 메소드 수행 1
        String blank00 = 스캐너값.nextLine(); // 엔터

        Z_orange.ZFight_hi(); // ★몬스터의 등장

        System.out.println("1.전투 시작   2.되돌아가기 ");  // 1.공격(1.일반공격 2.스킬) 2.인벤 0.되돌아가기

        int 전투선택 = 스캐너값.nextInt();


        switch (전투선택) {
            case 1:

                // 메소드 수행 2
                P1.PlayF_a(); // ★플레이어 공격1
                String blank2 = 스캐너값.nextLine();



                //객체 생성 : 공격당한 좀비 체력 만들기------------------------------------------------
                Fight F1 = new Fight(Z_orange.남은체력, P1.공격력); // 좀비-남은체력만들기
                Fight F2 = new Fight(P1.남은체력, Z_orange.공격력); // 좀비-남은체력만들기
                int F_result_Z = F1.M_result(Z_orange.남은체력, P1.공격력); //F_result_Z안에 50담기.
                int F_result_P = F2.M_result(P1.남은체력, Z_orange.공격력); //F_result_P안에 470담기.


                Z_orange.남은체력 = F_result_Z; // 50숫자 넣을거야 //됐다 드디어!
                P1.남은체력 = F_result_P; // 50숫자 넣을거야 //됐다 드디어!
                Z_orange.피해 = P1.공격력;
                P1.피해 = Z_orange.공격력; // 30숫자 넣을거야 //ok
                //---------------------------------------------------------------------------------


                // 메소드 수행 3
                Z_orange.ZFight_getBeat(); //★좀비 상태 //ok
                String blank3 = 스캐너값.nextLine();


                // 메소드 수행 4
                Z_orange.ZFight_a();  //★좀비 공격 //ok
                String blank4 = 스캐너값.nextLine();


                // 메소드 수행 5
                P1.PlayF_getBeat(); //★플 상태 //ok
                String blank5 = 스캐너값.nextLine();


                // 메소드 수행 6
                P1.PlayF_a(); //★플 공격 //ok
                String blank6 = 스캐너값.nextLine();



                Z_orange.남은체력 = F_result_Z - P1.공격력; // 0으로 만드려면?

                // 메소드 수행 7
                Z_orange.ZFight_getBeat(); ; //★좀비 상태 //남은체력
                String blank7 = 스캐너값.nextLine();


                // 메소드 수행 8
                if (Z_orange.남은체력 == 0) { //★좀비 체력이 0이면 물리침 메소드 수행
                    Z_orange.ZFight_getBeat_End();
                }
                String blank8 = 스캐너값.nextLine();


            case 2:
                System.out.println("1.이동  2.휴식  3.상점  4.인벤토리");
                int back = 스캐너값.nextInt();
                //이동하는 기능넣고싶어



            default:
                System.out.println("선택지 중에 고르십시오.");
        }


        //전투끝나면 여기 다시 이용해야겠다. 생성자 이용할 때 호출되려나.
        //도돌이표()>게임시작.MayIHelp()>이동or나감.이동나감(),정보.info()>게임시작.MayIHelp()

    } //main


}
*/