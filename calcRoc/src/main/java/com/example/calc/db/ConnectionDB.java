package com.example.calc.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Класс ConnectionDB устанавливает соединение с базой данных.
 */
public class ConnectionDB {
    private Connection connection;

    /**
     * Метод getConnection () из класса DriverManager позволяет получить соединение с базой данных, которая обеспечивает доступ к базе данных через установленный драйвер. Результат выполняющейся операции сохраняется в переменной connection для дальнейшего использования.
     * @return
     */
    public Connection getConnection() {
        try {
            Class.forName("org.h2.Driver");
            return connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
