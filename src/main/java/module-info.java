module com.example.musify {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.kordamp.bootstrapfx.core;
    requires java.net.http;
    requires com.google.gson;
    opens com.example.musify.util to com.google.gson;
    opens com.example.musify to javafx.fxml;
    exports com.example.musify;
}