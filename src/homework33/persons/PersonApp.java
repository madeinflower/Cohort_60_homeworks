package homework33.persons;

public class PersonApp {
    public static void main(String[] args) {
        Person validEmailPerson = new Person("test@gmail.com", "password");
        Person person1 = new Person("test@@gmail.com", "password");
        Person person2 = new Person("test@gmailcom", "password");
        Person person3 = new Person("test@gmail.", "password");
        Person person4 = new Person("кириллица@gmail.com", "password");
        Person person5 = new Person("@gmail.com", "password");
        Person person6 = new Person("1@gmail.com", "password");

        Person validPasswordPerson = new Person("test@gmail.com", "Password1!");
        Person person7 = new Person("test@gmail.com", "Passwor");
        Person person8 = new Person("test@gmail.com", "Password!");
        Person person9 = new Person("test@gmail.com", "PASSWORD1!");
        Person person10 = new Person("test@gmail.com", "password1!");
        Person person11 = new Person("test@gmail.com", "Password1");

        System.out.println(validEmailPerson);
        System.out.println(" ");
        System.out.println(person1);
        System.out.println(" ");
        System.out.println(person2);
        System.out.println(" ");
        System.out.println(person3);
        System.out.println(" ");
        System.out.println(person4);
        System.out.println(" ");
        System.out.println(person5);
        System.out.println(" ");
        System.out.println(person6);
        System.out.println(" ");
        System.out.println(validPasswordPerson);
        System.out.println(" ");
        System.out.println(person7);
        System.out.println(" ");
        System.out.println(person8);
        System.out.println(" ");
        System.out.println(person9);
        System.out.println(" ");
        System.out.println(person10);
        System.out.println(" ");
        System.out.println(person11);

    }
}
