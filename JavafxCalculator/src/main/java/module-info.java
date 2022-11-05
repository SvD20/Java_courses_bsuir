module edu.bsuir.calculator {
    requires javafx.controls;
    requires javafx.fxml;

    opens edu.bsuir.calculator to javafx.fxml;
    exports edu.bsuir.calculator;
}
