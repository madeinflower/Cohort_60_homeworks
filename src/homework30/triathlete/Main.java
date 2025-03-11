package homework30.triathlete;

//Создайте интерфейсы Swimmer и Runner с методами swim() и run() соответственно.
//Реализуйте класс Triathlete, который будет реализовывать оба интерфейса.
//Убедитесь, что класс Triathlete корректно выполняет действия, связанные с бегом и плаванием.

public class Main {
    public static void main(String[] args) {
        Triathlete athlete = new Triathlete();

        athlete.swim();
        athlete.run();
    }
}
