package Level3;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;


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

        Kiosk callMenu = new Kiosk(menuItemList);
        callMenu.start();
    }
}
