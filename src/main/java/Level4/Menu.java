package Level4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    //팔드
    private final List<MenuItem> menuItems;
    private final String name;

    public Menu(String name,List<MenuItem> menuItems) {
        this.name = name;
        this.menuItems = menuItems;
    }

    public String getName() {
        return name;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
}