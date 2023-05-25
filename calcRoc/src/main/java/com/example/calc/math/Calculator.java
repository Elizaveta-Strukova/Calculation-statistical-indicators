package com.example.calc.math;

import javafx.beans.property.SimpleDoubleProperty;

/**
 * Класс Calculator отвечает за расчёт необходимых данных. Он содержит в себе 4 переменные, значения которых берутся из базы данных и 7 переменных для получения 7 различных результатов вычисления. Также имеет геттеры и сеттеры для доступа к содержимому.
 */
public class Calculator implements MathCalc {
    private SimpleDoubleProperty a; // yes yes
    private SimpleDoubleProperty b; // yes no
    private SimpleDoubleProperty c; // no yes
    private SimpleDoubleProperty d; // no no

    private SimpleDoubleProperty chuvs;
    private SimpleDoubleProperty spec;
    private SimpleDoubleProperty plus;
    private SimpleDoubleProperty minus;
    private SimpleDoubleProperty rasp;
    private SimpleDoubleProperty pcplus;
    private SimpleDoubleProperty pcminus;

//    public Calculator(double chuvs, double spec,
//                      double plus, double minus, double rasp,
//                      double pcplus, double pcminus) {
//        this.chuvs = new SimpleDoubleProperty(chuvs);
//        this.spec = new SimpleDoubleProperty(spec);
//        this.plus = new SimpleDoubleProperty(plus);
//        this.minus = new SimpleDoubleProperty(minus);
//        this.rasp = new SimpleDoubleProperty(rasp);
//        this.pcplus = new SimpleDoubleProperty(pcplus);
//        this.pcminus = new SimpleDoubleProperty(pcminus);
//    }

    /**
     *Метод Calculator() - содержит свойства с числовыми значениями, которые используются для проведения расчетов внутри программы.
     */
    public Calculator() {
        this.a = new SimpleDoubleProperty(1.2);
        this.b = new SimpleDoubleProperty(1.2);
        this.c = new SimpleDoubleProperty(1.2);
        this.d = new SimpleDoubleProperty(1.2);
        this.chuvs = new SimpleDoubleProperty(1.2);
        this.spec = new SimpleDoubleProperty(1.2);
        this.plus = new SimpleDoubleProperty(1.2);
        this.minus = new SimpleDoubleProperty(1.2);
        this.rasp = new SimpleDoubleProperty(1.2);
        this.pcplus = new SimpleDoubleProperty(1.2);
        this.pcminus = new SimpleDoubleProperty(1.2);
    }

    /**
     * Метод calcChuvs() – производит вычисление значения и возвращает результат вычислений chuvs.
     * @return
     */
    public SimpleDoubleProperty calcChuvs() {
        double temp = a.get() / (a.get() + b.get()) * 100;
        chuvs = new SimpleDoubleProperty(temp);
        return chuvs;
    }

    /**
     * Метод calcSpec() – производит вычисление значения и возвращает результат вычислений в переменную spec.
     * @return
     */
    public SimpleDoubleProperty calcSpec() {
        double temp =  c.get() / ( d.get() + c.get()) * 100;
        spec = new SimpleDoubleProperty(temp);
        return spec;
    }

    /**
     * Метод calcPlusBol() – производит вычисление значения и возвращает результат вычислений в переменную plus.
     * @return
     */
    public SimpleDoubleProperty calcPlusBol() {
        double temp = (chuvs.get() / 100) / (1- (chuvs.get() / 100));
        plus = new SimpleDoubleProperty(temp);
        return plus;
    }

    /**
     * Метод calcMinusBol() – производит вычисление значения и возвращает результат вычислений в переменную minus.
     * @return
     */
    public SimpleDoubleProperty calcMinusBol() {
        double temp =  (1- (chuvs.get() / 100)) /(chuvs.get() / 100);
        minus = new SimpleDoubleProperty(temp);
        return minus;
    }

    /**
     * Метод calcRasp()– производит вычисление значения и возвращает результат вычислений в переменную rasp.
     * @return
     */
    public SimpleDoubleProperty calcRasp() {
        double temp = (a.get() + b.get()) / (a.get() + b.get() + d.get() + c.get()) * 100;
        rasp = new SimpleDoubleProperty(temp);
        return rasp;
    }

    /**
     * Метод calcPCPlus() – производит вычисление значения и возвращает результат вычислений в переменную pcplus.
     * @return
     */
    public SimpleDoubleProperty calcPCPlus() {
        double temp =  chuvs.get() / (chuvs.get() + d.get()) * 100;
        pcplus = new SimpleDoubleProperty(temp);
        return pcplus;
    }

    /**
     * Метод calcPCMinus() – производит вычисление значения и возвращает результат вычислений в переменную pcminus.
     * @return
     */
    public SimpleDoubleProperty calcPCMinus() {
        double temp =  c.get() / (b.get() + c.get()) * 100;
        pcminus = new SimpleDoubleProperty(temp);
        return pcminus;
    }

    public double getA() {
        return a.get();
    }

    public SimpleDoubleProperty aProperty() {
        return a;
    }

    public void setA(double a) {
        this.a.set(a);
    }

    public double getB() {
        return b.get();
    }

    public SimpleDoubleProperty bProperty() {
        return b;
    }

    public void setB(double b) {
        this.b.set(b);
    }

    public double getC() {
        return c.get();
    }

    public SimpleDoubleProperty cProperty() {
        return c;
    }

    public void setC(double c) {
        this.c.set(c);
    }

    public double getD() {
        return d.get();
    }

    public SimpleDoubleProperty dProperty() {
        return d;
    }

    public void setD(double d) {
        this.d.set(d);
    }

    public double getChuvs() {
        return chuvs.get();
    }

    public SimpleDoubleProperty chuvsProperty() {
        return chuvs;
    }

    public void setChuvs(double chuvs) {
        this.chuvs.set(chuvs);
    }

    public double getSpec() {
        return spec.get();
    }

    public SimpleDoubleProperty specProperty() {
        return spec;
    }

    public void setSpec(double spec) {
        this.spec.set(spec);
    }

    public double getPlus() {
        return plus.get();
    }

    public SimpleDoubleProperty plusProperty() {
        return plus;
    }

    public void setPlus(double plus) {
        this.plus.set(plus);
    }

    public double getMinus() {
        return minus.get();
    }

    public SimpleDoubleProperty minusProperty() {
        return minus;
    }

    public void setMinus(double minus) {
        this.minus.set(minus);
    }

    public double getRasp() {
        return rasp.get();
    }

    public SimpleDoubleProperty raspProperty() {
        return rasp;
    }

    public void setRasp(double rasp) {
        this.rasp.set(rasp);
    }

    public double getPcplus() {
        return pcplus.get();
    }

    public SimpleDoubleProperty pcplusProperty() {
        return pcplus;
    }

    public void setPcplus(double pcplus) {
        this.pcplus.set(pcplus);
    }

    public double getPcminus() {
        return pcminus.get();
    }

    public SimpleDoubleProperty pcminusProperty() {
        return pcminus;
    }

    public void setPcminus(double pcminus) {
        this.pcminus.set(pcminus);
    }
}
