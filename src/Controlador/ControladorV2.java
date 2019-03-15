/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Aportante;
import Modelo.Promotor;
import UI.Singleton;
import UI.Vista2;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author Equipo de Trabajo
 */
public class ControladorV2 {
    private Vista2 vista;
    private ArrayList<Aportante> aportantes;
    private Promotor promotor;
    private ControladorV2 controlador = this;
    private ControladorV7 controladorv7;
    
    public ControladorV2(Promotor promotor, ControladorV7 controladorv7){
        this.promotor = promotor;
        this.controladorv7 = controladorv7;
        this.vista = new Vista2();
        this.aportantes = new ArrayList<>();
        this.vista.getBsiguiente().setOnAction(new EventoSiguiente());
        this.vista.getBterminar().setOnAction(new EventoTerminar());
    }
    
    public void mostrarVista(){
        Singleton singleton = Singleton.getSingleton();
        this.vista.mostrar(singleton.getStage());
    }
    
    class EventoSiguiente implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            aportantes.add(new Aportante(vista.getFnombre().getText()));
            vista.getFnombre().clear();
        }
        
    }
    
    class EventoTerminar implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            ControladorV3 controladorv3 = new ControladorV3(promotor, controlador, controladorv7);
            controladorv3.mostrarVista();
        }
        
    }

    public ArrayList<Aportante> getAportantes() {
        return aportantes;
    }
    
    
}
