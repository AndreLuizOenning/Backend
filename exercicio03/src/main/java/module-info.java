module com.example.exercicio03 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exercicio03 to javafx.fxml;
    exports com.example.exercicio03;
}