module org.jaroso.javafxml {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.jaroso.javafxml to javafx.fxml;
    exports org.jaroso.javafxml;
}
