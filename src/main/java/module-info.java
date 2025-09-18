module com.project.calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.project.calculator to javafx.fxml;
    exports com.project.calculator;
}