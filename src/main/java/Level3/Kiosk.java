package Level3;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    //필드
    List<MenuItem> menuItemList;

    //생성자
    public Kiosk(List<MenuItem> menuItems) {
        menuItemList = menuItems;
    }

    //메서드
    public void start () {
        //Scanner 선언 및 초기화
        Scanner sc = new Scanner(System.in);

        System.out.println("주문을 시작합니다!");
        System.out.println("주문을 원하시면 1번을 눌러주세요!");

        String start = sc.nextLine();
        int startNumber = Integer.parseInt(start);
        System.out.println("----------------------------------------------------------------");
        System.out.println("메뉴를 골라주세요!");

        //메뉴 출력 부분 --> list값 불러오지 못하는 에러!!!
        while (true) {
            System.out.println("");
            System.out.println("[  SHAKESHACK MENU  ]");


            int menuNumber = 1;
            for (MenuItem menu : menuItemList) {
                System.out.println(menuNumber++ + ". " + menu.name + "   | " + menu.price + " | " + menu.description);
            }
            System.out.println("0. 종료         |  종료");
            System.out.println("----------------------------------------------------");
            System.out.println("주문하실 메뉴의 번호를 입력해주세요!");

            //선택한 메뉴 출력 부분
            String choice = sc.nextLine();
            int chooseNum = Integer.parseInt(choice);

            if (chooseNum == 0) {
                System.out.println("");
                System.out.println("주문하기를 종료합니다.");
                break;
            } else if (0 < chooseNum && chooseNum <= menuItemList.size()) {
                MenuItem selectedItem = menuItemList.get(chooseNum - 1);
                System.out.println(selectedItem.name + "이 선택 되었습니다.");
            } else {
                System.out.println("잘못된 번호를 입력하셨습니다! 다시 입력해 주세요!");
            }
        }
    }
}
