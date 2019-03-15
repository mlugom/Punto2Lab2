/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Prestamo;
import Modelo.Promotor;
import UI.Singleton;
import UI.Vista6;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

/**
 *
 * @author Equipo de Trabajo
 */
public class ControladorV6 {
    private Vista6 vista;
    private Promotor promotor;
    private ControladorV2 controlador;
    private ArrayList<Prestamo> prestamos;
    private ControladorV7 controladorv7;
    
    public ControladorV6(Promotor promotor, ControladorV2 controlador, ControladorV7 controladorv7){
        this.promotor = promotor;
        this.controlador = controlador;
        this.controladorv7 = controladorv7;
        this.prestamos = new ArrayList<>();
        this.vista = new Vista6(this.promotor);
        this.vista.getBbajar().setOnAction(new EventoBajar());
        for(int i = 0; i < this.controlador.getAportantes().size(); i++){
            vista.agregarBoton();
        }
        vista.botonesCompletos();
        for(int i = 0; i < this.vista.getBaportantes().size(); i++){
            vista.getBaportantes().get(i).setOnAction(new EventoAceptar(i));
        }
    }
    
    public void mostrarVista(){
        Singleton singleton = Singleton.getSingleton();
        vista.mostrar(singleton.getStage());
    }
    
    class EventoBajar implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            promotor.bajarCantPedida();
            Alert alerta = new Alert(AlertType.INFORMATION);
            alerta.setHeaderText(null);
            alerta.setContentText("La cantidad ahota es " + Float.toString(promotor.getCantPedida()));
            alerta.showAndWait();
        }
        
    }
    
    class EventoAceptar implements EventHandler<ActionEvent>{
        public int i;
        public EventoAceptar(int i){
            this.i = i;
        }

        @Override
        public void handle(ActionEvent event) {
            promotor.setAportante(controlador.getAportantes().get(i));
            prestamos.add(new Prestamo(promotor));
            prestamos.get(prestamos.size()-1).definirNomProyecto();
            prestamos.get(prestamos.size()-1).definirCantidad();
            try {
                prestamos.get(prestamos.size()-1).realizarPrestamo(prestamos.size());
            } catch (IOException ex) {
                Logger.getLogger(ControladorV6.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            controladorv7.mostrarVista();
        }
    }
}
