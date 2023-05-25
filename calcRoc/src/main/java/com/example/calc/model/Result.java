package com.example.calc.model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * Класс Result содержит 4 поля – id, patient, test, и standard, а также имеет геттеры и сеттеры для доступа к содержимому соответствующего свойства.
 */
public class Result {
    private SimpleIntegerProperty id;
    private SimpleStringProperty patient;
    private SimpleStringProperty test;
    private SimpleStringProperty standard;

//    public Result(int id, String patient,
//                  String test, String standard) {
//        this.id = new SimpleIntegerProperty(id);
//        this.patient = new SimpleStringProperty(patient);
//        this.test = new SimpleStringProperty( test);
//        this.standard = new SimpleStringProperty(standard);
//    }

    /**
     * Метод Result() - содержит свойства с значениями, которые используются для проведения расчетов внутри программы.
     */
    public Result() {
        this.id = new SimpleIntegerProperty(1);
        this.patient = new SimpleStringProperty("patient");
        this.test = new SimpleStringProperty( "test");
        this.standard = new SimpleStringProperty("standard");
    }

    public int getId() {
        return id.get();
    }

    public SimpleIntegerProperty idProperty() {
        return id;
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public String getPatient() {
        return patient.get();
    }

    public SimpleStringProperty patientProperty() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient.set(patient);
    }

    public String getTest() {
        return test.get();
    }

    public SimpleStringProperty testProperty() {
        return test;
    }

    public void setTest(String test) {
        this.test.set(test);
    }

    public String getStandard() {
        return standard.get();
    }

    public SimpleStringProperty standardProperty() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard.set(standard);
    }

    @Override
    public String toString() {
        return "Result{" +
                "id=" + id +
                ", patient=" + patient +
                ", test=" + test +
                ", standard=" + standard +
                '}';
    }
}
