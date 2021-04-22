import 생명체.생명체;
import 생명체.생존자.생존자;
import 생명체.좀비.좀비;
import 스레드.좀비스레드2;
import 아이템.부품.부품;
import 아이템.부품.부품제조티켓;
import 아이템.살점;
import 아이템.아이템;
import 연습.Test;

import java.util.ArrayList;
import java.util.Scanner;

public class 게임플레이5 {


    public static void main(String[] args) throws InterruptedException {

        Scanner 입력값 = new Scanner(System.in);



        System.out.println( "\n\n\n\n" +


                "     ██╗   ██╗██╗   ██╗███╗   ███╗███╗   ███╗██╗   ██╗    ███████╗ ██████╗ ███╗   ███╗██████╗ ██╗███████╗\n" +
                "     ╚██╗ ██╔╝██║   ██║████╗ ████║████╗ ████║╚██╗ ██╔╝    ╚══███╔╝██╔═══██╗████╗ ████║██╔══██╗██║██╔════╝\n" +
                "      ╚████╔╝ ██║   ██║██╔████╔██║██╔████╔██║ ╚████╔╝       ███╔╝ ██║   ██║██╔████╔██║██████╔╝██║█████╗  \n" +
                "       ╚██╔╝  ██║   ██║██║╚██╔╝██║██║╚██╔╝██║  ╚██╔╝       ███╔╝  ██║   ██║██║╚██╔╝██║██╔══██╗██║██╔══╝  \n" +
                "        ██║   ╚██████╔╝██║ ╚═╝ ██║██║ ╚═╝ ██║   ██║       ███████╗╚██████╔╝██║ ╚═╝ ██║██████╔╝██║███████╗\n" +
                "        ╚═╝    ╚═════╝ ╚═╝     ╚═╝╚═╝     ╚═╝   ╚═╝       ╚══════╝ ╚═════╝ ╚═╝     ╚═╝╚═════╝ ╚═╝╚══════╝\n\n\n"

        );


        System.out.println(
                "                                                  Press enter\n\n");

        String YesNo = 입력값.nextLine();      //입력값받음
        System.out.println(
                "                                                   GAME STRAT\n\n\n");







        //---------------------------------------------------------------------------------------
        System.out.println(
                "20xx년도 한국, 좀비바이러스가 창궐했습니다.\n\n" +
                        "좀비를 피해 탈출하십시오. \n\n" +
                        "통신기계를 만들면 UN군이 와줄지도 모르겠네요..\n\n" +
                        "그럼 행운을 빕니다.\n\n\n\n");


        System.out.print("\n당신의 이름을 말씀해주세요 : ");


        String 당신이름 = 입력값.nextLine();      //스캐너

        System.out.println("\n\n\n\n\n");


        System.out.println("20xx년도 한국, 좀비바이러스가 창궐했습니다.");
        System.out.println("원인은 방사능으로 알려져있습니다.");
        System.out.println("[ "+당신이름+" ] 님은 현재 생존자들의 임시 아지트에 숨어있습니다.");
        System.out.println("사태 직후에 피신했으니 이곳에 온지 열흘이 지났죠.");
        System.out.println("인간의 문명이 아예 망가지진 않아서 다행이지만, 이곳에도 언제 좀비떼가 들이닥칠지 모릅니다.");
        System.out.println("어느 날 아지트 내에서 UN군이 한국 어느 항구에 상륙한다는 소문을 듣게 됩니다.");
        System.out.println("UN군이 언제, 어디서 구하러 오는지 알 수 없으니 직접 연락할 방법을 찾아봅시다.");
        System.out.println("참고로 방사능에 오염된 좀비라서 그 좀비의 살점을 먹으면 잠깐 인간도 강해집니다.\n\n\n");

        System.out.println(" --------------    좀비사태 11일차    -------------- \n\n\n\n\n");




        //----------------------------- import된 세팅값 ---------------------------------------------------

        부품 부품1 = new 부품("통신장치부품1 : 배터리",20000,1,"1.",3);
        부품 부품2 = new 부품("통신장치부품2 : 라디오", 50000, 0,"2.", 2);
        부품 부품3 = new 부품("통신장치부품3 : 마이크", 80000, 0,"3.", 1);
        부품 부품값 = new 부품();
        부품제조티켓 티켓 = new 부품제조티켓("부품제조티켓", 0, 1);
        생존자 생존자값 = new 생존자(
                당신이름,"",1,300,
                500,1500,
                0,140000,0,0);
        좀비 오렌지좀비값 = new 좀비(
                "오렌지좀비", 당신이름,"오렌지맛 산성 뱉기","카악 퉤~~!!!",44,130,
                1280,1800, 생존자값.공격력,8000, 600);


        좀비 짜장면좀비값 = new 좀비(
                "짜장면좀비", 당신이름,"면발로 때리기","후루루룩~~!!",3,180,
                1000,1000,
                생존자값.공격력,8000, 700);
        좀비 먹물파스타좀비값 = new 좀비(
                "먹물파스타좀비", 당신이름,"눈에 먹물 뿌리기","먹물 받아랏. 찍~~!!",1,240,
                1300,1300,
                생존자값.공격력,8000, 800);
        좀비 좀비값 = new 좀비();
        생명체 생명체값 = new 생명체();
        아이템 아이템들 = new 아이템();
        살점 살점값 = new 살점();
        살점 오렌지살점 = new 살점("오렌지좀비의 살점", 4, 2,"1.");
        살점 짜장면살점 = new 살점("짜장면좀비의 살점", 1, 1,"2.");
        살점 먹물살점 = new 살점("먹물파스타좀비의 살점", 0, 1,"3.");






        //------------------------------안전지대---------------------------------------------------

        //상태확인
        생존자값.스탯창(당신이름);
        System.out.println();

    System.out.println("1.좀비사냥\n2.상태확인\n3.지하 전당포\n4.내 배낭\n5.부품조합설계도\n6.스토리 및 도움말\n");


        // 지옥의 반복문 안에서 계속 도는 형태로 만들거야. 탈출 안 시키겠네.
        // 반복시킬 때 내 상태 리셋되는건 아니겠지?
        while (true) {

            int 당신의선택 = 입력값.nextInt();   //값받음


            // 1.사냥 선택
            if (당신의선택 == 1) {


                System.out.println("사냥을 떠납니다. 난이도를 선택해주세요(0.이전)\n");
                System.out.println("1.반경 15미터 편의점\n" +
                                   "2.반경 200미터 초등학교\n" +
                                   "3.반경 750미터 철물점\n");


                // 123이외입력시 입력 다시 할 수 있게 반복
                while (true) {

                    int 당신의선택_사냥123 = 입력값.nextInt();

                    if (당신의선택_사냥123 == 1) {
                        System.out.println("15미터 앞 편의점으로 갑니다...");
                        System.out.println("(뒤적뒤적)");
                        System.out.println("어디 쓸만한게 있나.........\n");

                        System.out.println("                ╔════════════════════════════╗\n\n"+
                                "                       (̮̮̃•̮̮̃̃•̃)..\n" +
                                "                       /█l \n" +
                                "                       / L\n");

                        System.out.println("                   "+ 오렌지좀비값.이름+"가 나타났다!");
                        System.out.println("                   ");좀비값.좀비스펙(오렌지좀비값.레벨);

                        System.out.println("                ╚════════════════════════════╝\n");

                        System.out.println("                               1.싸운다  0.도망");

                        while (true) {

                            int 싸움_도망 = 입력값.nextInt();

                            if (싸움_도망 == 1) {



                                생존자값.전투fight();

                                System.out.println("1.공격  2.아이템 공격 (좀비출현)");



                                //반복문 들어가기 전에 입장하자마자 좀비값 초기화 ---------------------------------------------------
                                오렌지좀비값 = new 좀비(
                                        "오렌지좀비", 당신이름,"오렌지맛 산성 뱉기",
                                        "카악 퉤~~!!!",1,130,
                                        1500,1500, 생존자값.공격력,
                                        8000, 600);
                                //--------------------------------------------------------------------------------------------


                                System.out.println("오좀체력"+오렌지좀비값.남은체력);


                                //-------------------------- 스레드 -------------------------------
                                Runnable r = new 좀비스레드2(생존자값, 오렌지좀비값);  //빵꾸 2개 뚫었더니 main에서 선언한 객체값 가져옴!!! 야호
                                Thread t = new Thread(r);
                                System.out.println("3좀비 스레드 시작");

                                t.start();

                                //----------------------------------------------------------------


                                System.out.println("9 스레드 지나옴. 생존자의11 남은체력 : " + 생존자값.남은체력);




                                // 생존자 죽고나서 1스캐너 값 받으면 공격하고 탈출해서 if를 한 번 더씀
                                if (오렌지좀비값.남은체력 > 0 && 생존자값.남은체력 > 0) {

                                    while (오렌지좀비값.남은체력 > 0 && 생존자값.남은체력 > 0) {






                                            // ------------------------------- 1.일반공격 -----------------------------------




                                        int 사냥 = 입력값.nextInt();



                                        if (사냥 == 1) {


                                            //생존자 죽고나서 한 번 더 공격하는 문제 :
                                            if (오렌지좀비값.남은체력 <= 0 || 생존자값.남은체력 <= 0) {

                                                System.out.println("1111좀비 또는 생존자 체력 0 됨");
                                                continue;
                                            }

                                            생존자값.공격력 = 300;


                                            System.out.println("좀비의 남은체력1 : " + 오렌지좀비값.남은체력);


                                            생존자값.공격(오렌지좀비값);  // >>>공격
                                            생존자값.공격_결과(오렌지좀비값);  //               우어억


                                            System.out.println("1.공격  2.아이템 공격(한 턴 끝남)");

                                            System.out.println("ㅈㅍ");



                                            // ------------------------------- 2.아이템 공격 ---------------------------------
                                        } else if (사냥 == 2) {}// ~아이템공격


                                    }  //~while


                                        /*                                    }//~if*/
                                        System.out.println("전투 while빠져나옴");


                                        if (생존자값.남은체력 > 0) {


                                            생존자값.보상한번에(오렌지좀비값);

                                            오렌지살점.보상_살점(오렌지좀비값);

                                            좀비값.사망_보상(오렌지좀비값.드랍골드, 오렌지좀비값.경험치);

                                            생존자값.승리win();

                                        }

                                        //생존자 사망
                                        else if (생존자값.남은체력 <= 0) {

                                            System.out.println("계속 하시려면 1번, 게임을 완전히 종료하시려면 00번을 누르세요.");



                                            int 게임종료 = 입력값.nextInt();



                                            if (게임종료 == 1) {

                                                System.out.println("10만원을 지불하여 체력을 회복할 수 있습니다.");
                                                System.out.println("회복을 원하시면 '회복'이라 입력하세요.");
                                                System.out.println("회복을 원치 않는다면 아무키나 입력하세요.");

                                                String str = "회복";



                                                Scanner 입력 = new Scanner(System.in);
                                                String 사망후생존자체력 = 입력.nextLine();
                                                System.out.println("\n\n\n");




                                                if (사망후생존자체력.equals(str)) {

                                                    생존자값.남은체력 = 생존자값.기존체력;  //풀피만들기
                                                    생존자값.소지골드 -= 100000;

                                                    System.out.println("돈이 10만원 차감됩니다. ");
                                                    System.out.println("소지금 : "+생존자값.소지골드+"원");
                                                    System.out.println("생존자의 남은체력 : " + 생존자값.남은체력 + "/"+생존자값.기존체력);
                                                    System.out.println("안전지대로 돌아갑니다..\n\n\n");



                                                } else {
                                                    생존자값.남은체력 += 199;  //풀피만들기
                                                    System.out.println("생존자의 남은체력 : " + 생존자값.남은체력 + "/"+생존자값.기존체력);
                                                    System.out.println("체력이 부족한 상태로 돌아갑니다.. \n\n\n");
                                                }

                                            } else if (게임종료 == 00) {
                                                System.out.println("게임을 완전히 종료합니다.");
                                                System.exit(0);
                                            }

                                        }
                                        //생존자가 죽어도 공격하는 문제: 스캐너에서 빠져나오게 함.

                                    }
                        } else if (싸움_도망 == 0) {
                            System.out.println("좀비에게 들키지 않고 살금살금 도망갑니다.\n");  //확률로 해도 재밌겠다.

                        }
                            System.out.println("전투탈출...\n\n\n");
                            break;


                    }break;



                        //break;

                        //전투메소드
                        //전투메소드 끝

                    } else if (당신의선택_사냥123 == 2) {
                        System.out.println("50미터 앞 철물점으로 갑니다...");
                        System.out.println("(뒤적뒤적)");
                        System.out.println("어디 쓸만한게 있나.....");
                        System.out.println("저 쪽에서 좀비가 나타났다! 해치우고 무사히 돌아가자.\n");
                        break;


                    } else if (당신의선택_사냥123 == 3) {
                        System.out.println("200미터 앞 학교로 갑니다...");
                        System.out.println("(뒤적뒤적)");
                        System.out.println("부품을 발견했다! 안전지대로 돌아ㄱrㅈ..");
                        System.out.println("저 쪽에서 좀비가 나타났다! 해치우고 무사히 돌아가자.\n");
                        break;

                    //123이외 입력시
                    }  else if (당신의선택_사냥123 == 0) { break; }  //0.이전

                    else {
                        System.out.println("다시 선택하세요.");
                    }

                    int 사냥종료 = 입력값.nextInt();

                    if (사냥종료 == 0) {
                    }
                    break;  //12345나오게 탈출
                }
            }

            // 2. 상태확인
            else if (당신의선택 == 2) {

                생존자값.스탯창(당신이름);

            // 3. 지하 전당포
            } else if (당신의선택 == 3) {


                while (true) {

                    System.out.println("[ " + 당신이름 + " ] 님이 지하 전당포에 입장합니다(0.이전)\n");
                    System.out.println("1.구매  2.판매  3.조합하기\n");
                    int 당신의선택_상점123 = 입력값.nextInt();


                    // 1.구매 선택
                    if (당신의선택_상점123 == 1) {

                        while (true) {


                            System.out.println("\n" +
                                               "======== 지하 전당포 ========\n");
                            System.out.print("1.");부품1.전당포_구매(부품값);
                            System.out.print("2.");부품2.전당포_구매(부품값);
                            System.out.print("3.");부품3.전당포_구매(부품값);
                            System.out.println("===========================\n");


                            System.out.println("                     ============ 내 배낭 ============\n");

                                                                        부품1.배낭_소유부품_별(부품값);
                                                                        부품2.배낭_소유부품_별(부품값);
                                                                        부품3.배낭_소유부품_별(부품값);

                                                                        부품1.소지골드(생존자값.소지골드);

                            System.out.println("                     ================================\n");
                            System.out.println("구매할 아이템 번호를 입력하세요 (0.이전)\n\n\n");








                            int 당신의선택_상점_구매 = 입력값.nextInt();

                            // 사용자 입력
                            // 아이템 구매 선택
                            // 1:배터리
                            if (당신의선택_상점_구매 == 1) {


                                생존자값.구매_선택(부품1);



                            // 2:통신기구
                            } else if (당신의선택_상점_구매 == 2) {


                                생존자값.구매_선택(부품2);


                            // 3:마이크
                            } else if (당신의선택_상점_구매 == 3) {


                                생존자값.구매_선택(부품3);


                            } else if (당신의선택_상점_구매 == 0) {
                                System.out.println("*");
                                break;
                            }


                        }  //~while 빠져나오면 부품가격갯수 보여줌
                    }


                    // 2.판매
                    else if (당신의선택_상점123 == 2) {

                        while (true) {


                            //내 내 배낭 진열 쭉하고 판매메소드 이용하여 지하 전당포에 판매해서 골드 얻기
                            // 갯수가 1이상일 때만 출력

                            System.out.println("\n" +
                                               "======== 지하 전당포 ========\n");

                            System.out.println("제길.. 이 더러운 좀비들..");
                            System.out.println("아 어서오게나");
                            System.out.println("팔거면 쓸모있는 걸 팔길 바라네\n");

                            System.out.println("===========================\n\n");



                            System.out.println("                     ============ 내 배낭 ============\n");

                                                                      부품1.배낭_소유부품_숫자(부품값);
                                                                      부품2.배낭_소유부품_숫자(부품값);
                                                                      부품3.배낭_소유부품_숫자(부품값);

                                                                      부품1.소지골드(생존자값.소지골드);
                            System.out.println("                     ================================\n");

                            System.out.println("판매할 아이템 번호를 입력하세요 (0.이전)\n\n\n");


                            int 판매 = 입력값.nextInt();  //값입력


                            // 판매 선택 (1이상의 아이템)
                            if (판매 == 1) {


                                생존자값.판매_선택(부품1);


                            } else if (판매 == 2) {


                                생존자값.판매_선택(부품2);


                            } else if (판매 == 3) {



                                생존자값.판매_선택(부품3);



                            }  else if (판매 == 0) {
                                System.out.println("$$");

                                break;

                            }



                        }  //~while








                    // 3. 조합요청
                    } else if (당신의선택_상점123 == 3) {

                        System.out.println("통신장치를 조합해드립니다.\n");
                        System.out.println("1.Yes  2.No");

                        int 조합 = 입력값.nextInt();  //입력값 : 문자 y or Y

                        if (조합 == 1) {

                            System.out.println("조합중입니다...\n");

                            // 해피엔딩
                            if (부품1.갯수 >= 부품1.설계갯수 && 부품2.갯수 >= 부품2.설계갯수 && 부품3.갯수 >= 부품3.설계갯수) {

                                System.out.println("뚝딱뚝딱");
                                System.out.println("뚝딱뚝딱");
                                System.out.println("뚝딱뚝딱");
                                System.out.println("**********   작동하는 무전기가 제작되었습니다.  **********");
                                System.out.println("**********   작동하는 무전기가 제작되었습니다.  **********");
                                System.out.println("**********   작동하는 무전기가 제작되었습니다.  **********");
                                System.out.println("**********   UN군 Jamie사령과 연락이 닿습니다. **********\n\n\n");
                                System.out.println( "   ▬▬▬.◙.▬▬▬ \n" +
                                                    "   ═▂▄▄▓▄▄▂ \n" +
                                                    "   ◢◤ █▀▀████▄▄▄▄◢◤ \n" +
                                                    "   █▄ █ █▄ ███▀▀▀▀▀▀▀╬ \n" +
                                                    "   ◥█████◤ \n" +
                                                    "   ══╩══╩═ \n" +
                                                    "   ╬═╬ \n" +
                                                    "   ╬═╬ \n" +
                                                    "   ╬═╬ \n" +
                                                    "   ╬═╬ \n" +
                                                    "   ╬═╬☻/\n" +
                                                    "   ╬═╬/▌\n" +
                                                    "   ╬═╬//\n\n\n");

                                System.out.println("**********                                 **********");
                                System.out.println("**********            피신 성공             **********");
                                System.out.println("**********             E N D               **********");
                                System.out.println("**********                                 **********\n\n\n");


                                System.out.println("계속 하시려면 1번, 게임을 종료하시려면 0번을 누르세요.");
                                int 게임종료 = 입력값.nextInt();

                                if (게임종료 == 1) {
                                    // 반복문 계속
                                } else if (게임종료 == 0){
                                    System.out.println("게임을 종료합니다.");
                                    System.exit(0);


                                }


                                break;

                            } else {

                                System.out.println("부품 갯수가 부족합니다.\n");
                                System.out.println("╔═══════════════════════════════╗\n");

                                System.out.println("     < 통신장치 조합 설계도 >\n");
                                                        부품1.설계도(부품값);
                                                        부품2.설계도(부품값);
                                                        부품3.설계도(부품값);

                                System.out.println("\n╚═══════════════════════════════╝\n\n\n");
                                // 부품조합설계도 : 부품모아

                            }
                        }





                    // 0. 이전
                    } else if (당신의선택_상점123 == 0) {
                       //탈출
                        break;
                        // 123 이외 입력시 반복문 탈출못함(break못씀)
                    } else {
                        System.out.println("다시 선택하세요.");
                    }


                }//~while  빠져나오면 1.구입  2.판매  3.조합하기 나옴


            // 4. 내 배낭
            } else if (당신의선택 == 4) {

                System.out.println("============ 내 배낭 ===========\n");

                                    // 갯수가 1이상일 때만 출력
                                    부품1.배낭오픈_소유부품_별(부품값);
                                    부품2.배낭오픈_소유부품_별(부품값);
                                    부품3.배낭오픈_소유부품_별(부품값);
                                    오렌지살점.배낭오픈_소유부품_별(살점값);
                                    짜장면살점.배낭오픈_소유부품_별(살점값);
                                    먹물살점.배낭오픈_소유부품_별(살점값);

                                    부품1.소지골드_바짝(생존자값.소지골드);

                System.out.println("================================\n");


                // 5. 부품조합설계도
            } else if (당신의선택 == 5) {

                System.out.println("╔═══════════════════════════════╗\n");

                System.out.println("     < 통신장치 조합 설계도 >\n");
                                        부품1.설계도(부품값);
                                        부품2.설계도(부품값);
                                        부품3.설계도(부품값);
                System.out.println();
                System.out.println("  Tip : 설계도의 부품을 모아오면");
                System.out.println("        전당포에서 조합 가능합니다.");
                System.out.println("\n" +
                                   "╚═══════════════════════════════╝");
                // 부품조합설계도 : 부품모아

                System.out.println("                         (0.이전)");

                int 부품조합설계도이전 = 입력값.nextInt();

                if (부품조합설계도이전 == 0) {

                } else {
                    System.out.println("다시 선택하세요.");
                }

            } else if (당신의선택 == 6) {

                System.out.println("╔════════════════════════════════════════════════════════════════════════════╗");
                System.out.println("\n");
                System.out.println("  <스토리>");
                System.out.println("  20xx년도 한국, 좀비바이러스가 창궐했습니다.");
                System.out.println("  원인은 방사능으로 알려져있습니다.");
                System.out.println("  [ "+당신이름+" ] 님은 생존자들의 임시 아지트에 열흘 간 숨어지내고 있었습니다.");
                System.out.println("  인간의 문명이 아예 망가지진 않아서 다행이지만, 이곳에도 언제 좀비떼가 들이닥칠지 모릅니다.");
                System.out.println("  어느 날 아지트 내에서 UN군이 한국 어느 항구에 상륙한다는 소문을 듣게 됩니다.");
                System.out.println("  UN군이 언제, 어디서 구하러 오는지 알 수 없으니 직접 연락할 방법을 찾아봅시다.");
                System.out.println("  참고로 방사능에 오염된 좀비라서 그 좀비의 살점을 먹으면 잠깐 인간도 강해집니다.\n\n");


                System.out.println("  <Tip>");
                System.out.println("  * 설계도의 부품을 모아오면 전당포에서 조합 가능합니다.");
                System.out.println("  * 살점아이템을 사용하면 그 살점의 좀비로 변신합니다.\n\n");
                System.out.println("╚════════════════════════════════════════════════════════════════════════════╝");
                System.out.println("                                                                      (0.이전)");


              /*  System.out.println("Tip");*/


                while (true) {

                    int 이전 = 입력값.nextInt();   //값받음
                    if (이전 == 0) {

                    } else {
                        System.out.println("다시 입력하세요.");
                    } break;
                }

            }

            else {
                System.out.println("다시 선택하세요.");
                System.out.println("1.좀비사냥\n2.상태확인\n3.지하 전당포\n4.내 배낭");
            } // 선택n 끝나면 12345선택지 나옴


            System.out.println("1.좀비사냥\n2.상태확인\n3.지하 전당포\n4.내 배낭\n5.부품조합설계도\n6.스토리 및 도움말\n");


        }  //~while "1.사냥  2.상태확인  3.지하 전당포  4.내 배낭  5.부품조합설계도










        //필드
        //생성자
        //메소드

    }

}
