module com.mycompany.libraryproject {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.libraryproject to javafx.fxml;
    exports com.mycompany.libraryproject;
}
