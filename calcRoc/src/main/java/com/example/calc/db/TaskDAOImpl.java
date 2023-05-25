package com.example.calc.db;

import java.sql.*;

/**
 * Класс TaskDAOImpl отвечает за доступ к базе данных, создание таблиц в ней и заполнение их значениями с помощью SQL-запросов. В конструкторе класса происходит инициализация соединения с базой данных "test" с помощью объекта Connection.
 */
public class TaskDAOImpl  {
    private Connection conn;

    /**
     * TaskDAOImpl() после подключение к базе данных создает таблицы Result и Matrix и выполняет обновление базы данных с помощью указанного SQL-запроса.
     */
    public TaskDAOImpl() {

        try {
            //Class.forName("org.h2.Driver");
            conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
            Statement stmt = conn.createStatement();

//            stmt.executeUpdate("CREATE TABLE Result (\n" +
//                    "                    id int NOT NULL IDENTITY PRIMARY KEY,\n" +
//                    "\t\t\t\t\tpatient VARCHAR(255),\n" +
//                    "                    test VARCHAR(255),\n" +
//                    "                    standard VARCHAR(255))") ;
//
//                    stmt.executeUpdate("INSERT into  Result(patient,test,standard)  \n" +
//                            "    values\n" +
//                            "        ('Харин Михаил Александрович','да','да'),\n" +
//                            "\t\t('Рогова Людмила Алексеевна','нет','да'),\n" +
//                            "\t\t('Соловьева Мария Андреевна','да','да'),\n" +
//                            "\t\t('Лобов Дмитрий Анатольевич','нет','нет'),\n" +
//                            "\t\t('Ситцева Оксана Валерьевна','да','да'),\n" +
//                            "\t\t('Ушаков Андрей Михайлович','нет','да'),\n" +
//                            "\t\t('Цыганков Дмитрий Андреевич','нет','нет'),\n" +
//                            "\t\t('Крюков Тимофей Максимов','да','нет'),\n" +
//                            "\t\t('Баранов Дмитрий Олегович','да','да'),\n" +
//                            "\t\t('Виноградова Анастасия Юрьевна','нет','да'),\n" +
//                            "\t\t('Быков Алексей Алексеевич','да','да')");

//            stmt.executeUpdate("CREATE TABLE Matrix (\n" +
//                    "     Matr   VARCHAR(255), \n" +
//                    "    Yes  Double,    \n" +
//                    "    No   Double  \n" +
//                    ");");
//            stmt.executeUpdate("INSERT INTO Matrix (Matr) \n" +
//                    "values \n" +
//                    "('Yes'),\n" +
//                    "('No')");
//            stmt.executeUpdate("update Matrix \n" +
//                    "set Yes = (SELECT COUNT(*) \n" +
//                    "FROM Result\n" +
//                    "WHERE test = 'да' and standard = 'да')\n" +
//                    "where Matr = 'Yes'");
//            stmt.executeUpdate("update Matrix \n" +
//                    "set No = (SELECT COUNT(*)\n" +
//                    "FROM Result\n" +
//                    "WHERE test = 'да' and standard = 'нет')\n" +
//                    "where Matr = 'Yes'\n");
//            stmt.executeUpdate("update Matrix \n" +
//                    "set Yes = (SELECT COUNT(*)\n" +
//                    "FROM Result\n" +
//                    "WHERE test = 'нет' and standard = 'да')\n" +
//                    "where Matr = 'No'\n");
//            stmt.executeUpdate("update Matrix \n" +
//                    "set No = (SELECT COUNT(*)\n" +
//                    "FROM Result\n" +
//                    "WHERE test = 'нет' and standard = 'нет')\n" +
//                    "where Matr = 'No'");




        } catch (SQLException e) {
            e.printStackTrace();
        }
    }




}