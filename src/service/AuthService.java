package service;

import model.User;
import java.util.List;

//  Класс для аундификации пользователя (вход по логину и паролю).

public class AuthService {
    private List<User> users;

    public AuthService(List<User> users) {
        this.users = users;
    }

    public boolean login(String login, String password) {
        return users.stream().anyMatch(u -> u.getLogin().equals(login) && u.getPassword().equals(password));
    }

}
