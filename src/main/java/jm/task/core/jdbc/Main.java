package jm.task.core.jdbc;


import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        Util.getConnection();

        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Name1", "LastName1", (byte) 10);
        userService.saveUser("Name2", "LastName2", (byte) 20);
        userService.saveUser("Name3", "LastName3", (byte) 30);
        userService.saveUser("Name4", "LastName4", (byte) 40);

        userService.removeUserById(1);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();


    }
}


//        Создание таблицы User(ов)
//        Добавление 4 User(ов) в таблицу с данными на свой выбор. После каждого добавления должен быть вывод в консоль ( User с именем – name добавлен в базу данных )
//        Получение всех User из базы и вывод в консоль ( должен быть переопределен toString в классе User)
//        Очистка таблицы User(ов)
//        Удаление таблицы