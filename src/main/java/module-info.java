module com.ila2312.pomodoro {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ila2312.pomodoro to javafx.fxml;
    exports com.ila2312.pomodoro;
}