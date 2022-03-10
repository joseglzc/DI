package es.ideas.cambiostylesheet_jagc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.Parent;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        Scene escena;
        FXMLLoader cargador;

        cargador = App.cargarFXML("styleSheet");
        escena = new Scene(cargador.load());

        stage.setScene(escena);
        stage.setTitle("Cambio de estilos");
        //stage.setResizable(false);
        stage.show();
    }

    public static FXMLLoader cargarFXML(String nombreFicheroFXML){
        return (new FXMLLoader(App.class.getResource("view/"+nombreFicheroFXML+".fxml")));
    }

    public static void main(String[] args) {
        launch();
    }
}