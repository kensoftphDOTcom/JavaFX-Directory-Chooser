module com.kensoftph.directorychooser {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kensoftph.directorychooser to javafx.fxml;
    exports com.kensoftph.directorychooser;
}