package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Шапи", "Юсуфов", (byte) 21);
        userService.saveUser("Халид", "Салимов", (byte) 19);
        userService.saveUser("Махмуд", "Валиев", (byte) 24);

        userService.removeUserById(1);

        List<User> usersList = userService.getAllUsers();
        usersList.forEach(System.out::println);

        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
