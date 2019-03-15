/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Equipo de Trabajo
 */
public class Aportante extends Persona{
    private float cantPagada;
    private Promotor promotor;
    
    public Aportante(String nombre) {
        super(nombre);
        this.cantPagada = 0;
        this.promotor = null;
    }

    public float getCantPagada() {
        return cantPagada;
    }

    public Promotor getPromotor() {
        return promotor;
    }

    public void setCantPagada(float cantPagada) {
        this.cantPagada = cantPagada;
    }

    public void setPromotor(Promotor promotor) {
        this.promotor = promotor;
    }
    
    public void aceptarCantidad(float cantidad){
        this.setCantPagada(cantidad);
    }
}
