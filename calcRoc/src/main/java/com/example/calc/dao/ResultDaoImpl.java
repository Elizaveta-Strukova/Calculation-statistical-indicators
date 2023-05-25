package com.example.calc.dao;

import com.example.calc.db.ConnectionDB;
import com.example.calc.model.Result;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс ResultDaoImpl осуществляет работу с таблицей Result. В блоке инициализации класса создается экземпляр класса ConnectionDB и устанавливается соединение с базой данных при помощи метода getConnection().
 */
public class ResultDaoImpl {
    private final ConnectionDB connectionDB;
    private final Connection connection;

    private List<Result> resultsList;

    {
        connectionDB = new ConnectionDB();
        connection = connectionDB.getConnection();
    }

    /**
     * List<Result> getResultList() – возвращает данные из таблицы Result.
     * @return
     */
    public List<Result> getResultList() {
        resultsList = new ArrayList<>();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement("SELECT * FROM Result");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Result result = new Result();

                result.setId(rs.getInt("id"));
                result.setPatient(rs.getString("patient"));
                result.setTest(rs.getString("test"));
                result.setStandard(rs.getString("standard"));

                result.toString();
                resultsList.add(result);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return resultsList;
    }
}
