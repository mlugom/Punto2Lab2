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
public class Promotor extends Persona{
    private float cantPedida;
    private String nomProyecto;
    private Aportante aportante;
    private float cantReserva;
    
    public Promotor(String nombre, String nomProyecto, float cantReserva) {
        super(nombre);
        this.cantPedida = 0;
        this.nomProyecto = nomProyecto;
        this.aportante = null;
        this.cantReserva = cantReserva;
    }

    public float getCantPedida() {
        return cantPedida;
    }

    public void setCantPedida(float cantPedida) {
        this.cantPedida = cantPedida;
    }

    public String getNomProyecto() {
        return nomProyecto;
    }

    public Aportante getAportante() {
        return aportante;
    }

    public float getCantReserva() {
        return cantReserva;
    }

    public void setNomProyecto(String nomProyecto) {
        this.nomProyecto = nomProyecto;
    }

    public void setAportante(Aportante aportante) {
        this.aportante = aportante;
    }

    public void setCantReserva(float cantReserva) {
        this.cantReserva = cantReserva;
    }
    
    
    public void asignarCantPedida(float cantPedida){
        this.cantPedida = cantPedida;
    }
    
    public void bajarCantPedida(){
        this.cantPedida-=100;
    }
    
    
}
