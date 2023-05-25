package com.example.calc;

import com.example.calc.dao.MatrixDao;
import com.example.calc.dao.MatrixDaoImpl;
//import com.example.calc.dao.ResultDao;
import com.example.calc.dao.ResultDaoImpl;
import com.example.calc.math.Calculator;
import com.example.calc.math.MathCalc;
import com.example.calc.model.Matrix;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;


import java.io.*;
import java.net.URL;

import java.util.ResourceBundle;

/**
 * Класс HelloController является контроллером для интерфейса пользователя, который будет отображаться в приложении. Он содержит различные элементы управления, такие как TableView, TextField, которые служат для взаимодействия с пользователем.
 */

public class HelloController implements Initializable {

    @FXML
    public TableView table2;
    public TextField file;
    public Label message1;
    public Label message2;
    @FXML
    private TextField chuvs;
    @FXML
    private TextField spec;
    @FXML
    private TextField plus;
    @FXML
    private TextField minus;
    @FXML
    private TextField rasp;
    @FXML
    private TextField pcplus;
    @FXML
    private TextField pcminus;

    private ObservableList<Matrix> matrixObservableList;
    private MatrixDao matrixDao = new MatrixDaoImpl();
   // private ResultDao resultDao = new ResultDaoImpl();
    private MathCalc mathCalc = new Calculator();
    private SimpleDoubleProperty chuvs1, spec1, plusBol, minusBol, rasp1, pcpPlus, pcoMinus;

    /**
     * В этом классе реализован интерфейс Initializable, который содержит метод initialize(), вызывающий при создании объекта класса метод createTable2(), который создает таблицу и заполняет ее данными из БД.
     * @param url
     * @param resourceBundle
     */

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
         //new TaskDAOImpl(); //создание бд 1 раз

       createTable2();
       // calc();
    }


    /**
     *Метод createTable2() отвечает за создание таблицы и ее заполнение данными.
     */
    private void createTable2() {


        TableColumn Col1 = new TableColumn("Matr");
        Col1.setMinWidth(15);
        Col1.setCellValueFactory(new PropertyValueFactory<Matrix, String>("Matr"));

        TableColumn Col2 = new TableColumn("Yes");
        Col2.setMinWidth(30);
        Col2.setCellValueFactory(new PropertyValueFactory<Matrix, Double>("Yes"));

        TableColumn Col3 = new TableColumn("No");
        Col3.setMinWidth(100);
        Col3.setCellValueFactory(new PropertyValueFactory<Matrix, Double>("No"));

        table2.getColumns().clear();
        table2.getColumns().addAll( Col1, Col2, Col3);

        matrixObservableList = FXCollections.observableList(matrixDao.getListMatrix());
        table2.setItems(matrixObservableList);
    }

    /**
     * Метод onButtonClick() вызывается при нажатии на кнопку на форме и производит расчет математических показателей, используя объект класса Calculator. Результаты расчетов отображаются в соответствующих текстовых полях на форме.
     * @param actionEvent
     */
    public void onButtonClick(ActionEvent actionEvent) {


            double countYesYes =  matrixDao.getYesYes().getYes();
            double countYesNo = matrixDao.getYesNo().getYes();
            double countNoYes = matrixDao.getNoYes().getNo();
            double countNoNo = matrixDao.getNoNo().getNo();

            Calculator calculator = new Calculator();
            calculator.setA(countYesYes);
            calculator.setB(countYesNo);
            calculator.setC(countNoYes);
            calculator.setD(countNoNo);

            chuvs1 = calculator.calcChuvs();
            spec1 =  calculator.calcSpec();
            plusBol = calculator.calcPlusBol();
            minusBol = calculator.calcMinusBol();
            rasp1 = calculator.calcRasp();
            pcpPlus = calculator.calcPCPlus();
            pcoMinus = calculator.calcPCMinus();

            chuvs.setText(String.valueOf(chuvs1.get()));
            spec.setText(String.valueOf(spec1.get()));
            plus.setText(String.valueOf(plusBol.get()));
            minus.setText(String.valueOf(minusBol.get()));
            rasp.setText(String.valueOf(rasp1.get()));
            pcplus.setText(String.valueOf(pcpPlus.get()));
            pcminus.setText(String.valueOf(pcoMinus.get()));


    }

    /**
     * Метод onButton() вызывается при нажатии на кнопку на форме. Пользователь вводит в текстовое поле название текстового файла, в который необходимо записать результат вычислений. Если файл с таким именем уже существует, файл будет перезаписан новыми данными. В случае, если файла с введенным пользователем названия не существует, будет создан новый текстовый файл с введенным названием.
     * @param actionEvent
     */
    public void onButton(ActionEvent actionEvent) {


        String filename = file.getText() + ".txt";

        // Проверяем наличие файла
        File file = new File(filename);
        boolean isFileExists = file.isFile();
        if (isFileExists) {
            System.out.println("Файл " + filename + " уже существует.");
            message1.setText("Файл " + filename + " уже существует.");
            try {

                PrintWriter writer = new PrintWriter(filename, "UTF-8");
                writer.println("Чувствительность: " + chuvs.getText() + " %");
                writer.println("Специфичность: " + spec.getText()+ " %");
                writer.println("Положительная вероятность болезни: " + plus.getText()+ " %");
                writer.println("Отрицательная вероятность болезни: " + minus.getText()+ " %");
                writer.println("Распространенность заболевания: " + rasp.getText()+ " %");
                writer.println("Прогностическая ценность положительного результата: " + pcplus.getText()+ " %");
                writer.println("Прогностическая ценность отрицательного результата: " + pcminus.getText()+ " %");
                writer.close();
                writer.close();
                System.out.println("Данные записаны в файл!");
                message2.setText("Данные записаны в файл!");
            } catch (IOException e) {
                System.out.println("Ошибка добавления данных: " + e.getMessage());
            }



        } else {
            try {
                // Создаем новый файл
                file.createNewFile();
                System.out.println("Файл " + filename + " создан.");
                message1.setText("Файл " + filename + " создан.");
                try {

                    PrintWriter writer = new PrintWriter(filename , "UTF-8");
                    writer.println("Чувствительность: " + chuvs.getText() + " %");
                    writer.println("Специфичность: " + spec.getText()+ " %");
                    writer.println("Положительная вероятность болезни: " + plus.getText()+ " %");
                    writer.println("Отрицательная вероятность болезни: " + minus.getText()+ " %");
                    writer.println("Распространенность заболевания: " + rasp.getText()+ " %");
                    writer.println("Прогностическая ценность положительного результата: " + pcplus.getText()+ " %");
                    writer.println("Прогностическая ценность отрицательного результата: " + pcminus.getText()+ " %");
                    writer.close();
                    writer.close();
                    System.out.println("Данные записаны в файл!");
                    message2.setText("Данные записаны в файл!");
                } catch (IOException e) {
                    System.out.println("Ошибка добавления данных: " + e.getMessage());
                }
            } catch (IOException e) {
                System.out.println("Ошибка при создании файла " + filename + ": " + e.getMessage());
            }
        }






    }
}