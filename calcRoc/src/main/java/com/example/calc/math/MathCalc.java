package com.example.calc.math;

import javafx.beans.property.SimpleDoubleProperty;

/**
 * Интерфейс MathCalc используется для определения методов, которые служат для расчета некоторых математических показателей для определенных данных, и возвращают соответствующее значение в виде объекта SimpleDoubleProperty. Каждый метод представляет собой конкретный алгоритм вычисления, соответствующий некоторому математическому показателю, такому как calcChuvs() - расчет чувствительности, calcSpec() - расчет специфичности и другие.
 */
public interface MathCalc {
    /**
     * Метод calcChuvs() – производит вычисление значения и возвращает результат вычислений chuvs.
     * @return
     */
    SimpleDoubleProperty calcChuvs();

    /**
     * Метод calcSpec() – производит вычисление значения и возвращает результат вычислений в переменную spec.
     * @return
     */
    SimpleDoubleProperty calcSpec();

    /**
     * Метод calcPlusBol() – производит вычисление значения и возвращает результат вычислений в переменную plus.
     * @return
     */
    SimpleDoubleProperty calcPlusBol();

    /**
     * Метод calcMinusBol() – производит вычисление значения и возвращает результат вычислений в переменную minus.
     * @return
     */
    SimpleDoubleProperty calcMinusBol();

    /**
     * Метод calcRasp()– производит вычисление значения и возвращает результат вычислений в переменную rasp.
     * @return
     */
    SimpleDoubleProperty calcRasp();

    /**
     * Метод calcPCPlus() – производит вычисление значения и возвращает результат вычислений в переменную pcplus.
     * @return
     */
    SimpleDoubleProperty calcPCPlus();

    /**
     * Метод calcPCMinus() – производит вычисление значения и возвращает результат вычислений в переменную pcminus.
     * @return
     */
    SimpleDoubleProperty calcPCMinus();
}
