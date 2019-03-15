/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Promotor;
import UI.Singleton;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author Equipo de Trabajo
 */
public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Singleton singleton = Singleton.getSingleton();
        singleton.setStage(primaryStage);
        Promotor promotor = new Promotor(null,null,0);
        ControladorV7 controladorv7 = new ControladorV7();
        ControladorV1 controlador = new ControladorV1(promotor, controladorv7);
        controlador.mostrarVista();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
