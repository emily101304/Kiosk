package Level4;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Menu burgers = new Menu("Burgers",new ArrayList<>(
                List.of(new MenuItem("ShackBurger","W 6.9","토마토, 양상추, 쉑소스가 토핑된 치즈버거"),
                        new MenuItem("SmokeShack","W 8.9","베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"),
                        new MenuItem("Cheeseburger","W 6.9","포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"),
                        new MenuItem("Hamburger","W 5.4","비프패티를 기반으로 야채가 들어간 기본버거"))
        ));
        Menu drinks = new Menu("Drinks",new ArrayList<>(
                List.of(
                        new MenuItem("Coke", "W 1.5", "콜라"),
                        new MenuItem("Sprite", "W 1.5", "스프라이트"),
                        new MenuItem("Fanta", "W 1.5", "환타"),
                        new MenuItem("Lemonade", "W 2.0", "레몬에이드")
                )
        ));
        Menu deserts = new Menu("Deserts",new ArrayList<>(
                List.of(
                        new MenuItem("ShackSundae", "W 3.5", "초코, 바닐라 아이스크림에 월넛, 쉑소스가 들어간 선데이"),
                        new MenuItem("ShackShake", "W 4.0", "초코, 바닐라, 카라멜 세 가지 맛 중 선택 가능한 밀크쉐이크")
                )
        ));

        Kiosk callMenu = new Kiosk(List.of(burgers,drinks,deserts));
        callMenu.start();
    }
}
