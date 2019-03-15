/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Equipo de Trabajo
 */
public class Prestamo {
    private float cantidad;
    private String nomProyecto;
    private Promotor promotor;

    public Prestamo(Promotor promotor) {
        this.promotor = promotor;
        this.cantidad = promotor.getCantPedida();
        this.nomProyecto = promotor.getNomProyecto();
    }

    public float getCantidad() {
        return cantidad;
    }

    public String getNomProyecto() {
        return nomProyecto;
    }

    public Promotor getPromotor() {
        return promotor;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public void setNomProyecto(String nomProyecto) {
        this.nomProyecto = nomProyecto;
    }

    public void setPromotor(Promotor promotor) {
        this.promotor = promotor;
    }
    
    public void definirCantidad(){
        this.cantidad = this.promotor.getCantPedida();
    }
    
    public void definirNomProyecto(){
        this.nomProyecto = this.promotor.getNomProyecto();
    }
    
    public void realizarPrestamo(int i) throws IOException{
        FileWriter f = new FileWriter("src/archivos/Prestamo" + Integer.toString(i));
        f.write("Nombre del proyecto: " + this.nomProyecto + '\n');
        f.write("Promotor: " + this.promotor.getNombre() + '\n');
        f.write("Aportante: " + this.promotor.getAportante().getNombre() + '\n');
        f.write("Valor: " + Float.toString(this.cantidad));
        f.close();
    }
}
