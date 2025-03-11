package homework27.autopark;

public class Autobus {

    private static int counter = 1;

    private final int id;

    private BusDriver driver;
    private Autopilot autopilot;

    private final int capacity;
    private int countPassengers;

    private final Passenger[] passengers;

    public Autobus(BusDriver driver, int capacity) {
        this.id = counter++;
        this.driver = driver;
        driver.setAutobus(this);
        this.capacity = capacity;
        this.autopilot = new Autopilot("AP-v0001");
        this.passengers = new Passenger[capacity];
    }

    @Override // task 3
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Autobus {")
                .append("id=").append(id)
                .append(", driver=").append(driver)
                .append(", autopilot=").append(autopilot)
                .append(", capacity=").append(capacity)
                .append('}');
        return sb.toString();
    }

    public void showListPassengers() {

        if (countPassengers == 0) {
            System.out.println("[]");
            return;
        }

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < countPassengers; i++) {
            sb.append(passengers[i].toString());
            sb.append((i < countPassengers - 1) ? ", " : "]");
        }

        System.out.println(sb.toString());
    }

    public boolean takePassenger(Passenger passenger) {
        if (passenger == null) return false;

        if (countPassengers < capacity) {
            if (isPassengerInBus(passenger) >= 0) {
                System.out.printf("Пассажир с id %d уже в автобусе c id %d\n",
                        passenger.getId(), this.id);
                return false;
            }

            passengers[countPassengers] = passenger;
            countPassengers++;
            System.out.printf("Пассажир с id %d завершил посадку в автобус c id %d\n",
                    passenger.getId(), this.id);
            return true;
        }

        System.out.printf("В автобусе с id %d свободных мест нет!\n", this.id);
        return false;

    }

    private int isPassengerInBus(Passenger passenger) {
        for (int i = 0; i < countPassengers; i++) {
            if (passengers[i].getId() == passenger.getId()) {
                // id совпали - значит это один и тот же объект
                return i;
            }
        }
        return -1;
    }

    // task 4
    public boolean dropPassenger(Passenger passenger) {

        if (passenger == null || countPassengers == 0) return false;

        int index = isPassengerInBus(passenger);

        if (index == -1) {
            System.out.printf("Пассажир с id %d в автобусе (%d) не найден!\n", passenger.getId(), this.id);
            return false;
        }

        for (int i = index; i < countPassengers - 1; i++) {
            passengers[i] = passengers[i + 1];
        }

        passengers[countPassengers - 1] = null;
        countPassengers--;

        System.out.printf("Пассажир (%d) вышел из автобуса (%d)\n", passenger.getId(), this.id);
        return true;
    }


    public void setDriver(BusDriver driver) {
        this.driver.setAutobus(null);
        this.driver = driver;
        this.driver.setAutobus(this);

    }

    public int getId() {
        return id;
    }

    public BusDriver getDriver() {
        return driver;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public Autopilot getAutopilot() {
        return autopilot;
    }

}
