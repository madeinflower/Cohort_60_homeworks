package homework24;

// Написать класс Собака (Dog).
//Каждая Собака обязательно должна иметь имя и высоту прыжка
//Должна уметь прыгать и должна уметь тренироваться.
//За каждую тренировку высота прыжка увеличивается максимум на 10 сантиметров
//Максимальная высота прыжка, которую может натренировать собака, не может быть больше, чем двукратная высота первоначального прыжка.
//Также должен быть метод взять jumpBarrier. В параметрах метод принимает высоту барьера. Если собака в состоянии преодолеть этот барьер - прыгает. Если не в состоянии, нужно проверить помогут ли тренировки (будет ли данная собака в принципе в состоянии взять барьер).
//Если да -> идем тренироваться -> берет барьер

public class Dog {
    private String name;
    private double jumpHeight;
    private final double maxJumpHeight;

    public Dog(String name, double jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.maxJumpHeight = jumpHeight * 2;
    }

    public void training() {
        if (jumpHeight + 10 <= maxJumpHeight) {
            jumpHeight += 10;
        } else {
            jumpHeight = maxJumpHeight;
        }
        System.out.println(name + " is training. Now can jump " + jumpHeight + " cm.");
    }

    public boolean jumpBarrier(double barrierHeight) {
        if (jumpHeight >= barrierHeight) {
            System.out.println(name + " jumped over the barrier of " + barrierHeight + " cm.");
            return true;
        } else if (maxJumpHeight >= barrierHeight) {
            System.out.println(name + " can't jump over the " + barrierHeight + " cm barrier yet. Starting training...");
            while (jumpHeight < barrierHeight) {
                training();
            }
            System.out.println(name + " can now jump over the barrier!");
            return true;
        } else {
            System.out.println(name + " will never be able to jump over the " + barrierHeight + " cm barrier, even with training.");
            return false;
        }
    }

    public static void main(String[] args) {
        Dog rex = new Dog("Rex", 30);
        rex.jumpBarrier(50);
        rex.jumpBarrier(80);
        rex.jumpBarrier(100);
    }
}
