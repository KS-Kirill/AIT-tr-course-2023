package practice;

import java.util.Objects;

/*
1) @ exists and only one (done)
2) dot after @ (done)
3) after last dot minimum 2 symbols (done)
4) alphabetic, digits, _ , - , . , @
 */
public class User {
    private String email;
    private String password;

    public User(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (validateEmail(email)) {
            this.email = email;
        } else {
            System.out.println(email + " isn't valid.");
        }
    }

    private boolean validateEmail(String email) {
        //k_l_b_1963@hotmail.com
        int indexAt = email.indexOf('@'); //ищем индекс @
        if (indexAt == -1 || indexAt != email.lastIndexOf('@')) { //@ нашлась и не стоит в самом конце
            return false;
        }
        if (email.indexOf('.', indexAt) == -1) {
            return false;
        }
        if (email.indexOf('.') >= email.length() - 2) { //более одного символа после точки
            return false;
        }
        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);
            if (!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')
                    || c == '_' || c == '-' || c == '.' || c == '@')) {
                return false;
            }
        }
        return true;
    }

    public String getPassport() {
        return password.toString();
    }

    public void setPassword(String password) {
        if (validatePassword(password)) {
            this.password = password;
        } else {
            System.out.println("Password not valid");
        }
    }

    /*
    1) min 8 symbols
    2) min one symbol of uppercase
    3) min one symbol of lowercase
    4) min one digit
    5) min one special symbol (!%@*&)
     */
    private boolean validatePassword(String password) {
        //TODO
        return false;
    }


    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password=" + password +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return email.equals(user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    public boolean validation(String password) {
        boolean[] resOfValidations = new boolean[password.length()];

        for (int i = 0; i < password.length(); i++) {

        }

        if (password.length() < 8) { //пусть пароль состоит из не более 8 символов
            return false;
        }
        return true;

    }

}
