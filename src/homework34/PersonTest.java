package homework34;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PersonTest {

    @ParameterizedTest
    @ValueSource(strings = {
            "test@@gmail.com",   // Две собаки
            "test.gmail.com",    // Нет собаки
            "test@.com",         // Нет символов перед собакой
            "@gmail.com",        // Нет локальной части перед @
            "test@gmail",        // Нет точки после @
            "test@com",          // Нет домена второго уровня
            "test@gmail.c",      // Менее двух символов после последней точки
            "test@#gmail.com",   // Недопустимый символ
            "test @gmail.com",   // Пробел внутри
            "Test@Gmail.com",    // Заглавные буквы (не всегда ошибка, но может быть запрещено)
            "t@com",             // Однобуквенное имя, нет домена второго уровня
            "1test@gmail.com"    // Имя начинается с цифры
    })
    void testInvalidEmails(String email) {
        Person person = new Person(email, "ValidPass1!");
        assertNull(person.getEmail(), "Невалидный email не должен устанавливаться: " + email);
    }

    @Test
    void testValidEmail() {
        Person person = new Person("valid.email@gmail.com", "ValidPass1!");
        assertEquals("valid.email@gmail.com", person.getEmail(), "Валидный email должен устанавливаться корректно");
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "short1!",          // Менее 8 символов
            "nouppercase1!",    // Нет заглавной буквы
            "NOLOWERCASE1!",    // Нет строчной буквы
            "NoDigits!!",       // Нет цифры
            "NoSpecial1",       // Нет спецсимвола
            "   ",              // Только пробелы
            "password",         // Только буквы
            "12345678",         // Только цифры
            "Password123"       // Нет спецсимвола
    })

    void testInvalidPasswords(String password) {
        Person person = new Person("valid.email@gmail.com", password);
        assertNull(person.getPassword(), "Невалидный пароль не должен устанавливаться: " + password);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "Valid1!@",         // Минимально валидный
            "Str0ngPass$",      // Валидный пароль
            "Myp@ssword1",      // Валидный пароль
            "XyZ_9876!",        // Разные символы
            "Secure123$%"       // Допустимые символы
    })
    void testValidPasswords(String password) {
        Person person = new Person("valid.email@gmail.com", password);
        assertEquals(password, person.getPassword(), "Валидный пароль должен устанавливаться корректно: " + password);
    }

    @Test
    void testNullPassword() {
        Person person = new Person("valid.email@gmail.com", null);
        assertNull(person.getPassword(), "Пароль null не должен устанавливаться");
    }

}
