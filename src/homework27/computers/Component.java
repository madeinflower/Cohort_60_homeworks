package homework27.computers;

//Создайте базовый класс Component с полями brand (бренд) и model (модель).
//Создайте производные классы: Processor, Memory, Storage от класса Component.
//Создайте класс Computer который будет содержать компоненты: процессор, память и накопитель.
//Реализуйте отношения между Computer и компонентами. Компоненты Processor и Memory не могу существовать без компьютера.

public class Component {
    protected String brand;
    protected String model;

    public Component(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return brand + " " + model;
    }

}
