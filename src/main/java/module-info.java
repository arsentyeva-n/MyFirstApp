module simpleclass.myfirstapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens simpleclass.myfirstapp to javafx.fxml;
    exports simpleclass.myfirstapp;
}