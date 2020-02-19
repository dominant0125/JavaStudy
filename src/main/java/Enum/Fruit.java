package Enum;

public enum Fruit {
    // 상수 뒤 () -> 생성자 호출
    APPLE("RED", 60),
    PEACH("PINK", 70),
    BANANA("YELLOW", 100);

    String color;
    int kcal;

    Fruit(String color, int kcal){

        this.color = color;
        this.kcal = kcal;

        System.out.println(String.format("Constructor called\nName : %s\nColor : %s\nKcal : %d", this, this.color, this.kcal));
    }
}
