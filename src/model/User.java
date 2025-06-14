package model;

import java.io.Serializable;

//  Класс для хранения данных пользователя системы (логин и пароль)

public class User implements Serializable {
    private String login;       // Логин
    private String password;    // Пароль

    //get
    public String login() {
        return login;
    }
    public String password() {
        return password;
    }

    //set
    public void setLogin(String login) {
        this.login = login;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    //constructor
    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }


    public Object getLogin() {
        return login;
    }

    public Object getPassword() {
        return password;
    }
}