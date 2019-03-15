/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Equipo de Trabajo
 */
public class Vista5 {
    private Scene escena;
    private BorderPane layout;
    private VBox vbox;
    private Label ingreseNombre;
    private TextField fnombre;
    private Button baceptar;
    
    public Vista5(){
        this.vbox = new VBox();
        this.ingreseNombre = new Label("Ingrese la cantidad inicial");
        this.fnombre = new TextField();
        this.baceptar = new Button("Aceptar");
        this.vbox.getChildren().add(this.ingreseNombre);
        this.vbox.getChildren().add(this.fnombre);
        this.vbox.getChildren().add(this.baceptar);
        this.layout = new BorderPane(vbox);
        this.escena = new Scene(layout, 300, 300);
    }
    
    public void mostrar(Stage stage){
        stage.setTitle("Cant. inicial");
        stage.setScene(this.escena);
        stage.show();
    }
    
    public TextField getFnombre(){
        return this.fnombre;
    }
    
    public Button getBaceptar(){
        return this.baceptar;
    }
}
