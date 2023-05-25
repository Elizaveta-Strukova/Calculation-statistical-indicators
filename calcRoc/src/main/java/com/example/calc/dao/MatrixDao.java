package com.example.calc.dao;

import com.example.calc.model.Matrix;

import java.util.List;

/**
 * Интерфейс MatrixDao. Этот интерфейс будет использоваться всеми классами, которые работают с расчётом статистических показателей.
 */
public interface MatrixDao {
    /**
     * List<Matrix> getListMatrix() – возвращает данные из таблицы Matrix.
     * @return
     */
    List<Matrix> getListMatrix();

    /**
     * Метод Matrix getYesYes() выполняет SQL-запрос к базе данных и возвращает объект Matrix, содержащий значение поля YesYes, возвращенное запросом.
     * @return
     */
    Matrix getYesYes();

    /**
     * Метод Matrix getYesNo() выполняет SQL-запрос к базе данных и возвращает объект Matrix, содержащий значение поля YesNo, возвращенное запросом.
     * @return
     */
    Matrix getYesNo();

    /**
     * Метод Matrix getNoYes() выполняет SQL-запрос к базе данных и возвращает объект Matrix, содержащий значение поля NoYes, возвращенное запросом.
     * @return
     */
    Matrix getNoYes();

    /**
     * Метод Matrix getNoNo() выполняет SQL-запрос к базе данных и возвращает объект Matrix, содержащий значение поля NoNo, возвращенное запросом.
     * @return
     */
    Matrix getNoNo();
}
