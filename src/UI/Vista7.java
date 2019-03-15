/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Equipo de Trabajo
 */
public class Vista7 {
    private Scene escena;
    private VBox vbox;
    private Label label;
    private Button bok;
    
    public Vista7(){
        this.vbox = new VBox();
        this.label = new Label("Se realizó el prestamo.");
        this.bok = new Button("OK");
        this.vbox.getChildren().add(label);
        this.vbox.getChildren().add(bok);
        this.escena = new Scene(vbox, 300, 300);
    }
    
    public void mostrar(Stage stage){
        stage.setTitle("Realizado.");
        stage.setScene(escena);
        stage.show();
    }

    public Button getBok() {
        return bok;
    }
    
    
}
