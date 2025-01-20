package Level1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //스캐너 선언 및 초기화
        Scanner sc = new Scanner(System.in);

        //주문 시작 멘트
        System.out.println("주문을 시작합니다!");
        System.out.println("주문을 원하시면 1번을 눌러주세요!");
        String start = sc.nextLine();
        int startNumber = Integer.parseInt(start);
        System.out.println("----------------------------------------------------------------");
        System.out.println("메뉴를 골라주세요!");

        while (true) {
            //메뉴판 출력 부분
            System.out.println("");
            System.out.println("[  SHAKESHACK MENU  ]");
            System.out.println("1.   ShackBurger    |   W 6.9   |   토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            System.out.println("2.   SmokeShack     |   W 8.9   |   베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            System.out.println("3.   Cheeseburger   |   W 6.9   |   포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            System.out.println("4.   Hamburger      |   W 5.4   |   비프패티를 기반으로 야채가 들어간 기본버거");
            System.out.println("0. 종료              |   종료");

            //입력값 스캐너로 받기
            String choice = sc.nextLine();
            int chooseNum = Integer.parseInt(choice);
            //반복문 종료 조건문
            if (chooseNum == 1) {
                System.out.println("ShackBurger를 선택하셨습니다.");
            } else if (chooseNum == 2) {
                System.out.println("SmokeShack를 선택하셨습니다.");
            } else if (chooseNum == 3) {
                System.out.println("Cheeseburger를 선택하셨습니다.");
            } else if (chooseNum == 4) {
                System.out.println("Hamburger를 선택하셨습니다.");
            } else if (chooseNum == 0) {
                System.out.println("");
                System.out.println("주문하기를 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 번호를 입력하셨습니다! 다시 입력해 주세요!");
            }
        }
    }
}
