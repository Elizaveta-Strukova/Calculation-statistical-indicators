package com.example.calc.dao;

import com.example.calc.db.ConnectionDB;
import com.example.calc.model.Matrix;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс MatrixDaoImpl осуществляет работу с таблицей Matrix. В блоке инициализации класса создается экземпляр класса ConnectionDB и устанавливается соединение с базой данных при помощи метода getConnection().
 */
public class MatrixDaoImpl implements MatrixDao {
    private final ConnectionDB connectionDB;
    private final Connection connection;

    private List<Matrix> matrixList;

    {
        connectionDB = new ConnectionDB();
        connection = connectionDB.getConnection();
    }

    /**
     * List<Matrix> getListMatrix() – возвращает данные из таблицы Matrix.
     * @return
     */
    @Override
    public List<Matrix> getListMatrix() {
        matrixList = new ArrayList<>();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement("SELECT * FROM Matrix");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Matrix matrix = new Matrix();


                matrix.setMatr(rs.getString("Matr"));
                matrix.setNo(rs.getDouble("No"));
                matrix.setYes(rs.getDouble("Yes"));

                matrix.toString();
                matrixList.add(matrix);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return matrixList;
    }

    /**
     * Метод Matrix getYesYes() выполняет SQL-запрос к базе данных и возвращает объект Matrix, содержащий значение поля YesYes, возвращенное запросом.
     * @return
     */
    @Override
    public Matrix getYesYes() {
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement("select m.yes from public.matrix m where Matr = 'Yes'");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Matrix matrix = new Matrix();

//                matrix.setId(rs.getInt("id"));
//                matrix.setMatr(rs.getString("Matr"));
//                matrix.setNo(rs.getDouble("No"));
                matrix.setYes(rs.getDouble("Yes")); // сюда

                matrix.toString();

                return matrix;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    /**
     * Метод Matrix getYesNo() выполняет SQL-запрос к базе данных и возвращает объект Matrix, содержащий значение поля YesNo, возвращенное запросом.
     * @return
     */
    @Override
    public Matrix getYesNo() {
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement("select m.yes from public.matrix m where Matr = 'No'");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Matrix matrix = new Matrix();

//                matrix.setId(rs.getInt("id"));
//                matrix.setMatr(rs.getString("Matr"));
//                matrix.setNo(rs.getDouble("No"));
                matrix.setYes(rs.getDouble("Yes")); // сюда

                matrix.toString();

                return matrix;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    /**
     *Метод Matrix getNoYes() выполняет SQL-запрос к базе данных и возвращает объект Matrix, содержащий значение поля NoYes, возвращенное запросом.
     * @return
     */
    @Override
    public Matrix getNoYes() {
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement("select m.no from public.matrix m where Matr = 'Yes'");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Matrix matrix = new Matrix();

//                matrix.setId(rs.getInt("id"));
//                matrix.setMatr(rs.getString("Matr"));
                matrix.setNo(rs.getDouble("No")); // dds
//                matrix.setYes(rs.getDouble("Yes"));

                matrix.toString();

                return matrix;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    /**
     * Метод Matrix getNoNo() выполняет SQL-запрос к базе данных и возвращает объект Matrix, содержащий значение поля NoNo, возвращенное запросом.
     * @return
     */
    @Override
    public Matrix getNoNo() {
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement("select m.no from public.matrix m where Matr = 'No'");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Matrix matrix = new Matrix();

//                matrix.setId(rs.getInt("id"));
//                matrix.setMatr(rs.getString("Matr"));
                matrix.setNo(rs.getDouble("No")); // dds
//                matrix.setYes(rs.getDouble("Yes"));

                matrix.toString();

                return matrix;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}

