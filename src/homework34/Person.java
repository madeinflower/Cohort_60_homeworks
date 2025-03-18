package homework34;

public class Person {
    private String email;
    private String password;

    public Person(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isEmailValid(email)) {
            this.email = email.toLowerCase();
        } else {
            this.email = null;
        }
    }

    /*
    test@gmail.com
    1. Должна присутствовать @ и только одна
    2. После собаки должна біть точка
    3. После последней точки есть 2 или более символов
    4. Алфавит, цифры, спецсимволы _ + - @
    5. До собаки должен быть хотя бы один символ
    6. Первый символ - должна быть буква
     */

    private boolean isEmailValid(String email) {
        // Запрещаем заглавные буквы
        if (!email.equals(email.toLowerCase())) return false;

        int indexAt = email.indexOf('@');
        int lastAt = email.lastIndexOf('@');
        if (indexAt == -1 || indexAt != lastAt) return false;

        int dotIndexAfterAt = email.indexOf('.', indexAt + 1);
        if (dotIndexAfterAt == -1) return false;
        if (email.length() - dotIndexAfterAt <= 2) return false;
        if (dotIndexAfterAt == indexAt + 1) return false;

        for (char ch : email.toCharArray()) {
            boolean isPass = (ch >= 'a' && ch <= 'z')
                    || Character.isDigit(ch)
                    || ch == '-'
                    || ch == '_'
                    || ch == '.'
                    || ch == '@';

            if (!isPass) return false;
        }

        if (indexAt == 0) return false;
        if (!Character.isLetter(email.charAt(0))) return false;

        return true;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (isPasswordValid(password)) {
            this.password = password;
        } else {
            this.password = null; // Обнуляем невалидный пароль
        }
    }

    //Длина пароля >= 8
    //Должна быть мин 1 цифра
    //Должна быть мин 1 маленькая буква -> Character.isLowerCase()
    //Должна быть мин 1 большая буква
    //Должна быть мин 1 специальный символ: "!%$@&*()[],.-"

    private boolean isPasswordValid(String password) {
        if (password == null || password.length() < 8) { // Добавили проверку на null
            return false;
        }

        boolean hasDigit = false;
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasSpecial = false;
        String specialChars = "!%$@&*()[],.-";

        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (Character.isLowerCase(ch)) {
                hasLower = true;
            } else if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } else if (specialChars.indexOf(ch) != -1) {
                hasSpecial = true;
            }

            if (hasDigit && hasLower && hasUpper && hasSpecial) {
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
