module org.example.assignment01shapedrawer {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens org.example.assignment01shapedrawer to javafx.fxml;
    exports org.example.assignment01shapedrawer;
}