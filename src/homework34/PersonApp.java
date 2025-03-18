package homework34;

import homework33.persons.Person;

public class PersonApp {
    public static void main(String[] args) {
        homework33.persons.Person validEmailPerson = new homework33.persons.Person("test@gmail.com", "password");
        homework33.persons.Person person1 = new homework33.persons.Person("test@@gmail.com", "password");
        homework33.persons.Person person2 = new homework33.persons.Person("test@gmailcom", "password");
        homework33.persons.Person person3 = new homework33.persons.Person("test@gmail.", "password");
        homework33.persons.Person person4 = new homework33.persons.Person("кириллица@gmail.com", "password");
        homework33.persons.Person person5 = new homework33.persons.Person("@gmail.com", "password");
        homework33.persons.Person person6 = new homework33.persons.Person("1@gmail.com", "password");

        homework33.persons.Person validPasswordPerson = new homework33.persons.Person("test@gmail.com", "Password1!");
        homework33.persons.Person person7 = new homework33.persons.Person("test@gmail.com", "Passwor");
        homework33.persons.Person person8 = new homework33.persons.Person("test@gmail.com", "Password!");
        homework33.persons.Person person9 = new homework33.persons.Person("test@gmail.com", "PASSWORD1!");
        homework33.persons.Person person10 = new homework33.persons.Person("test@gmail.com", "password1!");
        homework33.persons.Person person11 = new Person("test@gmail.com", "Password1");

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
