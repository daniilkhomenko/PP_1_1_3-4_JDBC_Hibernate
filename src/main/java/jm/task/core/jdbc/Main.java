package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;


public class Main {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Anna", "TheGreat", (byte) 20);
        userService.saveUser("Boris", "Johnson", (byte) 25);
        userService.saveUser("Jason", "Statham", (byte) 31);
        userService.saveUser("Sasha", "Volkov", (byte) 38);
        userService.saveUser("Vladimir", "Pozner", (byte) 38);

        userService.removeUserById(1);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();

        Util.closeConnection();
    }
}
