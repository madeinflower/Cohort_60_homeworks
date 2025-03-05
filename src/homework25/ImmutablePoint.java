package homework25;

//• Объявите final поля x и y типа int.
//•	Инициализируйте их через конструктор.
//•	Попытайтесь создать методы-сеттеры для изменения значений x и y.
//•	Объясните, почему значения полей не могут быть изменены после создания объекта.

public class ImmutablePoint {

    private final int x;
    private final int y;

    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Попыталась создать методы-сеттеры для изменения значений x и y (они будут отсутствовать)
    // public void setX(int x) { this.x = x; } // Ошибка компиляции, так как x final
    // public void setY(int y) { this.y = y; } // Ошибка компиляции, так как y final

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static void main(String[] args) {
        ImmutablePoint point = new ImmutablePoint(10, 20);

        // Попыталась изменить значения x и y и выдало ошибку
        // point.setX(30); // Ошибка компиляции
        // point.setY(40); // Ошибка компиляции

        // Выводим текущие значения
        System.out.println("Point coordinates: x = " + point.getX() + ", y = " + point.getY());
    }
}

