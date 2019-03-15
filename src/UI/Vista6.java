/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Modelo.Promotor;
import java.util.ArrayList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Equipo de Trabajo
 */
public class Vista6 {
    private Scene escena;
    private HBox hbox;
    private VBox vbox1;
    private VBox vbox2;
    private Button bbajar;
    private Label precio;
    private ArrayList<Button> baportantes;
    private Promotor promotor;
    
    public Vista6(Promotor promotor){
        this.promotor = promotor;
        this.hbox = new HBox();
        this.vbox1 = new VBox();
        this.vbox2 = new VBox();
        this.bbajar = new Button("Bajar");
        this.precio = new Label("Cantidad: " + Float.toString(promotor.getCantPedida()));
        this.baportantes = new ArrayList<>();
        this.vbox1.getChildren().add(precio);
        this.vbox1.getChildren().add(bbajar);
        this.hbox.getChildren().add(vbox1);
        
    }
    
    public void agregarBoton(){
        int i = this.baportantes.size() + 1;
        this.baportantes.add(new Button("Aceptar (" + i + ")"));
    }
    
    public void botonesCompletos(){
        for(int i = 0; i < this.baportantes.size(); i++){
            this.vbox2.getChildren().add(this.baportantes.get(i));
        }
        this.hbox.getChildren().add(vbox2);
        
        this.escena = new Scene(hbox, 300, 300);
    }
    
    public void mostrar(Stage stage){
        stage.setTitle("Subasta");
        stage.setScene(escena);
        stage.show();
    }

    public Button getBbajar() {
        return bbajar;
    }

    public ArrayList<Button> getBaportantes() {
        return baportantes;
    }

    public void setPrecio(Label precio) {
        this.precio = precio;
    }
    
}
