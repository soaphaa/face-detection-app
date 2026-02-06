module org.example.facedetectionapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires opencv;

    opens org.example.facedetectionapp to javafx.fxml;
    exports org.example.facedetectionapp;
}