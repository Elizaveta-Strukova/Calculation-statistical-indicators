package com.example.calc.model;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * Класс Matrix имеет поля – Matr, Yes, No. Каждое поле имеет геттеры и сеттеры для доступа к содержимому соответствующего свойства.
 */
public class Matrix {
   // private SimpleIntegerProperty id;
    private SimpleStringProperty Matr;
    private SimpleDoubleProperty Yes;
    private SimpleDoubleProperty No;

//    public Matrix(int id, String matr, Double yes, Double no) {
//        this.id = new SimpleIntegerProperty(id);
//        this.Matr = new SimpleStringProperty(matr);
//        this.Yes = new SimpleDoubleProperty(yes);
//        this.No = new SimpleDoubleProperty(no);
//    }

    /**
     * Метод Matrix() - содержит свойства с значениями, которые используются для проведения расчетов внутри программы.
     */
    public Matrix() {
       // this.id = new SimpleIntegerProperty(1);
        this.Matr = new SimpleStringProperty("matr");
        this.Yes = new SimpleDoubleProperty(2.1);
        this.No = new SimpleDoubleProperty(2.1);
    }

 //   public int getId() {return id.get();}

   // public SimpleIntegerProperty idProperty() {return id;}

  //  public void setId(int id) {this.id.set(id);}

    public String getMatr() {
        return Matr.get();
    }

    public SimpleStringProperty matrProperty() {
        return Matr;
    }

    public void setMatr(String matr) {
        this.Matr.set(matr);
    }

    public double getYes() {
        return Yes.get();
    }

    public SimpleDoubleProperty yesProperty() {
        return Yes;
    }

    public void setYes(double yes) {
        this.Yes.set(yes);
    }

    public double getNo() {
        return No.get();
    }

    public SimpleDoubleProperty noProperty() {
        return No;
    }

    public void setNo(double no) {
        this.No.set(no);
    }

    @Override
    public String toString() {
        return "Matrix{" +
               // "id=" + id +
                ", Matr=" + Matr +
                ", Yes=" + Yes +
                ", No=" + No +
                '}';
    }
}
