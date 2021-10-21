module com.mycompany.libraryproject {
    requires javafx.controls;
    requires javafx.fxml;
   
    requires java.persistence; 
    requires java.sql; 
    requires org.hibernate.orm.core; 
    requires java.base;

    opens com.mycompany.libraryproject.db;
    opens com.mycompany.libraryproject to javafx.fxml;
    exports com.mycompany.libraryproject;
}
