module com.example.calcroc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.calc.model to javafx.base;
    exports com.example.calc.model;

    opens com.example.calc to javafx.fxml;
    exports com.example.calc;
    exports com.example.calc.math;
    opens com.example.calc.math to javafx.base;
}