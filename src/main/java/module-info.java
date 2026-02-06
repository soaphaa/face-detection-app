module org.example.facedetectionapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens org.example.facedetectionapp to javafx.fxml;
    exports org.example.facedetectionapp;
}