/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Promotor;
import UI.Singleton;
import UI.Vista7;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author Equipo de Trabajo
 */
public class ControladorV7 {
    private Vista7 vista;
    private ControladorV7 controlador = this;
    
    public ControladorV7(){
        this.vista = new Vista7();
        this.vista.getBok().setOnAction(new EventoOK());
    }
    
    public void mostrarVista(){
        Singleton singleton = Singleton.getSingleton();
        this.vista.mostrar(singleton.getStage());
    }
    
    class EventoOK implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            Promotor promotor = new Promotor(null, null, 0);
            ControladorV1 controladorv1 = new ControladorV1(promotor, controlador);
            controladorv1.mostrarVista();
        }
        
    }
}
