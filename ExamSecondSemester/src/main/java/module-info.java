module com.example.examsecondsemester {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.examsecondsemester to javafx.fxml;
    exports com.example.examsecondsemester;
}