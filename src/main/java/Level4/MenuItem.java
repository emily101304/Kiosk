package Level4;


public class MenuItem {

    //필드 영역 : 이름, 가격, 설명
    String name;
    String price;
    String description;


    //생성자 영역
    public MenuItem(String _name, String _price, String _description) {
        this.name = _name;
        this.price = _price;
        this.description = _description;
    }

    public String getName() {
        return name;
    }
    public String getPrice () {
        return price;
    }
    public String getDescription() {
        return description;
    }
}

