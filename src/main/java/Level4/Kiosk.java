package Level4;

import java.util.List;
import java.util.Scanner;

public class Kiosk {

    //필드
    private final List<Menu> menus;

    //생성자
    public Kiosk(List<Menu> menus) {
        this.menus = menus;
    }

        //start 함수 구현
        public void start () {
            //Scanner 선언 및 초기화
            Scanner sc = new Scanner(System.in);

            System.out.println("주문을 시작합니다!");
            System.out.println("주문을 원하시면 1번을 눌러주세요!");

            String start = sc.nextLine();
            int startNumber = Integer.parseInt(start);
            System.out.println("----------------------------------------------------------------");
            System.out.println("메뉴를 골라주세요!");


            //메뉴 출력 부분
            while (true) {
                //List와 Menu클래스 활용하여 상위 카테고리 메뉴 출력
                for (int i=0; i < menus.size(); i++) {
                    Menu menu = menus.get(i);
                    System.out.println(i + 1 + ". " + menu.getName());
                }
                System.out.println("0. 종료         |  종료");
                System.out.println("----------------------------------------------------");
                System.out.println("메뉴를 선택하세요!");

                String choose = sc.nextLine();
                int menuChoice = Integer.parseInt(choose);
                if (menuChoice < 0 || menuChoice > menus.size()) {
                    throw new IllegalArgumentException("잘못된 숫자를 입력하셨습니다!!");
                } else if (menuChoice == 0) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }

                List<MenuItem> menuItems = menus.get(menuChoice - 1).getMenuItems();
                System.out.println("");
                System.out.println("[  SHAKESHACK MENU  ]");


                for (int i = 0; i < menuItems.size(); i++) {
                    MenuItem menuItem = menuItems.get(i);
                    System.out.println((i + 1) + ". " + menuItem.getName() + " | " + menuItem.getPrice() + " | " + menuItem.getDescription());

                }
                System.out.println("0. 뒤로가기");
                System.out.println("----------------------------------------------------");
                System.out.println("주문하실 메뉴의 번호를 입력해주세요!");

                //선택한 메뉴 출력 부분
                String choice = sc.nextLine();
                int chooseNum = Integer.parseInt(choice);

                if (chooseNum == 0) {
                    continue;
                }
                if (chooseNum <= 0 || chooseNum > menuItems.size()) {
                    throw new IllegalArgumentException("잘못된 번호를 입력하셨습니다!!");
                }
                MenuItem selectedItem = menuItems.get(chooseNum - 1);
                System.out.println(selectedItem.getName() + "을(를) 선택하셨습니다!");
            }
        }
    }
