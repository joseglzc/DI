/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package es.ideas.cambiostylesheet_jagc;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
/**
 * FXML Controller class
 *
 * @author Jose_AGC
 */
public class StyleSheetController implements Initializable {


    @FXML
    private AnchorPane fondo;
    @FXML
    private Text titulo;
    @FXML
    private Button estilo1;
    @FXML
    private Button estilo2;
    @FXML
    private Button estilo3;
    @FXML
    private Button reset;
    @FXML
    private Button salir;
    /**
     * Initializes the controller class.
     */

    @FXML
    void estilo1(ActionEvent event) {
        fondo.getStylesheets().clear();
        fondo.getStylesheets().add("es/ideas/cambiostylesheet_jagc/view/css/estilos1.css");
    }

    @FXML
    void estilo2(ActionEvent event) {
        fondo.getStylesheets().clear();
        fondo.getStylesheets().add("es/ideas/cambiostylesheet_jagc/view/css/estilos2.css");
    }

    @FXML
    void estilo3(ActionEvent event) {
        fondo.getStylesheets().clear();
        fondo.getStylesheets().add("es/ideas/cambiostylesheet_jagc/view/css/estilos3.css");
    }

    @FXML
    void exit(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void reset(ActionEvent event) {

        fondo.getStylesheets().clear();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
