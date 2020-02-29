/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


/**
 *
 * @author invitado
 */
public class Venta {
    private int anio;
    private float cantidadDeVentas;
    private float crecimiento;
    private float porcentajeVariacion;
    

    public Venta(int anio, float cantidadDeVentas) {
        this.anio = anio;
        this.cantidadDeVentas = cantidadDeVentas;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public float getCantidadDeVentas() {
        return cantidadDeVentas;
    }

    public void setCantidadDeVentas(int cantidadDeVentas) {
        this.cantidadDeVentas = cantidadDeVentas;
    }

    public float getPorcentajeVariacion() {
        return porcentajeVariacion;
    }

    public void setPorcentajeVariacion(float porcentajeVariacion) {
        this.porcentajeVariacion = porcentajeVariacion;
    }

    public float getCrecimiento() {
        return crecimiento;
    }

    public void setCrecimiento(float crecimiento) {
        this.crecimiento = crecimiento;
    }
    
    
    
}
