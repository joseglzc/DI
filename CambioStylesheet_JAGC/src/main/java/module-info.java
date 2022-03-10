module es.ideas.cambiostylesheet_jagc {
    requires java.base;
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ideas.cambiostylesheet_jagc to javafx.fxml;
    exports es.ideas.cambiostylesheet_jagc;
}