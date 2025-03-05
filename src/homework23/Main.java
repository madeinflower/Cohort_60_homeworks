package homework23;

class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Tetiana", 38, 50000);
        emp.info();

        MagicArray magicArray = new MagicArray(5);
        magicArray.add(10);
        magicArray.add(20);
        magicArray.add(30);

        int[] arr = magicArray.toArray();
        System.out.println("MagicArray elements: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
