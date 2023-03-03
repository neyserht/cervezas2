module neyser.cervezas2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens neyser.cervezas2 to javafx.fxml;
    exports neyser.cervezas2;
}