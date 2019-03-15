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
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Equipo de Trabajo
 */
public class Vista2 {
    private Scene escena;
    private VBox layout;
    private Label ingrese;
    private Label ingrese2;
    private TextField fnombre;
    private HBox hbox;
    private Button bsiguiente;
    private Button bterminar;
    
    public Vista2(){
        this.layout = new VBox();
        this.ingrese = new Label("Ingrese el nombre de cada aportante y presione siguiente.");
        this.ingrese2 = new Label("Al finalizar presione terminar.");
        this.fnombre = new TextField();
        this.hbox = new HBox();
        this.bsiguiente = new Button("Siguiente");
        this.bterminar = new Button("Terminar");
        this.hbox.getChildren().add(bsiguiente);
        this.hbox.getChildren().add(bterminar);
        this.layout.getChildren().add(ingrese);
        this.layout.getChildren().add(ingrese2);
        this.layout.getChildren().add(fnombre);
        this.layout.getChildren().add(hbox);
        this.escena = new Scene(layout, 300, 300);
    }
    
    public void mostrar(Stage stage){
        stage.setScene(this.escena);
        stage.setTitle("Aportantes");
        stage.show();
    }

    public TextField getFnombre() {
        return fnombre;
    }

    public Button getBsiguiente() {
        return bsiguiente;
    }

    public Button getBterminar() {
        return bterminar;
    }
    
    
}
