import model.*;
import service.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final String EMP_FILE = "emloyees.dat";
    private static final String DEP_FILE = "department.dat";
    private static final String USER_FILE = "users.dat";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // загрузка пользователей
        List<User> users;
        try {
            users = FileService.loadFromFile(USER_FILE);
        } catch (Exception e) {
            users = new ArrayList<>();
            users.add(new User("admin", "admin")); // по умолчанию
        }
        AuthService authService = new AuthService(users);

        // авторизация
        boolean loggedIn = false;
        while (!loggedIn) {
            System.out.println("Логин: ");
            String login = sc.nextLine();
            System.out.println("Пароль: ");
            String password = sc.nextLine();
            if (authService.login(login, password)) {
                loggedIn = true;
            } else {
                System.out.println("Неверный логин или пароль.");
            }
        }

        // загрузка данных
        EmployeeService employeeService = new EmployeeService();
        DepartmentService departmentService = new DepartmentService();
        try {
            employeeService.setAll(FileService.loadFromFile(EMP_FILE));
            departmentService.setAll(FileService.loadFromFile(DEP_FILE));
        } catch (Exception ignored) {}

        ReportService reportService = new ReportService();

        // Меню
        while (true) {
            System.out.println("\n1. Принять сотрудника\n2. Уволить\n3. Изменить\n4. Поиск\n5. Отчеты\n6. Сохранить\n7. Выход");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    // Ввод данных сотрудника и добавление
                    // ...
                    break;
                case 2:
                    // Удаление сотрудника
                    // ...
                    break;
                case 3:
                    // Изменение данных сотрудника
                    // ...
                    break;
                case 4:
                    // Поиск по ФИО/должности/отделу/начальнику
                    // ...
                    break;
                case 5:
                    // Отчеты: структура, средняя з/п, ТОП-10 и т.д.
                    // ...
                    break;
                case 6:
                    // Сохранение данных
                    // ...
                    break;
                case 7:
                    return;
            }
        }
    }

}
