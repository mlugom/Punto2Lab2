/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;
import UI.Vista1;
import UI.Singleton;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
/**
 *
 * @author Equipo de Trabajo
 */
public class ControladorV1 {
    private Vista1 vista;
    private Promotor promotor;
    private ControladorV7 controlador;

    public ControladorV1(Promotor promotor, ControladorV7 controlador) {
        this.promotor = promotor;
        this.controlador = controlador;
        this.vista = new Vista1();
        this.vista.getBaceptar().setOnAction(new EventoAceptar());
    }
    
    public void mostrarVista(){
        Singleton singleton = Singleton.getSingleton();
        this.vista.mostrar(singleton.getStage());
    }
    
    class EventoAceptar implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            promotor.setNombre(vista.getFnombre().getText());
            vista.getFnombre().clear();
            ControladorV2 controladorv2 = new ControladorV2(promotor, controlador);
            controladorv2.mostrarVista();
        }
        
    }
    
}
