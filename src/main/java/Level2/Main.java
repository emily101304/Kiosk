package Level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //list 선언 및 초기화
        List<MenuItem> menuItemList = new ArrayList<>();
        //햄버거 객체 생성 및 List에 add
        MenuItem ShackBurger = new MenuItem("ShackBurger","W 6.9","토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem SmokeShack = new MenuItem("SmokeShack","W 8.9","베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem Cheeseburger = new MenuItem("Cheeseburger","W 6.9","포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem Hamburger = new MenuItem("Hamburger","W 5.4","비프패티를 기반으로 야채가 들어간 기본버거");
        menuItemList.add(ShackBurger);
        menuItemList.add(SmokeShack);
        menuItemList.add(Cheeseburger);
        menuItemList.add(Hamburger);


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
