/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Promotor;
import UI.Singleton;
import UI.Vista4;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author Equipo de Trabajo
 */
public class ControladorV4 {
    private Vista4 vista;
    private Promotor promotor;
    private ControladorV2 controlador;
    private ControladorV7 controladorv7;
    
    public ControladorV4(Promotor promotor, ControladorV2 controlador, ControladorV7 controladorv7){
        this.promotor = promotor;
        this.controlador = controlador;
        this.controladorv7 = controladorv7;
        this.vista = new Vista4();
        this.vista.getBaceptar().setOnAction(new EventoAceptar());
    }
    
    public void mostrarVista(){
        Singleton singleton = Singleton.getSingleton();
        this.vista.mostrar(singleton.getStage());
    }
    
    class EventoAceptar implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            promotor.setCantReserva(Float.parseFloat(vista.getFnombre().getText()));
            vista.getFnombre().clear();
            ControladorV5 controladorv5 = new ControladorV5(promotor, controlador, controladorv7);
            controladorv5.mostrarVista();
        }
        
    }
}
