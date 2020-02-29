/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author invitado
 */
public class PronosticoVentas {
    private float aniosACalcular;
    private float promedioVariacion;
    private float crecimientoVentas;
    private ArrayList<Venta> ventas;
    private float pronosticoVentas;


    public PronosticoVentas(float aniosACalcular,float promedioVariacion) {
        this.aniosACalcular = aniosACalcular;
        this.promedioVariacion = promedioVariacion;
       
        
        ventas = new ArrayList<>();
        
        ventas.add(new Venta(1, 220f));
        ventas.add(new Venta(2, 245f));
        ventas.add(new Venta(3, 250f));
        ventas.add(new Venta(4, 258f));
        ventas.add(new Venta(5, 273.5f));
        
    }

    public float getAniosACalcular() {
        return aniosACalcular;
    }

    public void setAniosACalcular(float aniosACalcular) {
        this.aniosACalcular = aniosACalcular;
    }

    public float getCrecimientoVentas() {
        return crecimientoVentas;
    }

    public void setCrecimientoVentas(float crecimientoVentas) {
        this.crecimientoVentas = crecimientoVentas;
    }

    public float getPromedioVariacion() {
        return promedioVariacion;
    }

    public void setPromedioVariacion(float promedioVariacion) {
        this.promedioVariacion = promedioVariacion;
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }
    
    
    public void calcularCrecimientoVetas(){
        float crecimiento=0.0f;
        for(int i = 0; i < ventas.size(); i++){
            crecimiento=ventas.get(i+1).getCantidadDeVentas() - ventas.get(i).getCantidadDeVentas();
            ventas.get(i).setCrecimiento(crecimiento);
        }
    }
    
    public void calcularPorcentajeVariaciones(){
        float promedio = 0.0f;
        
        for(int i = 0; i < ventas.size(); i++){
            promedio = ventas.get(i).getCrecimiento() / ventas.get(i).getAnio() - 1;
            ventas.get(i).setPorcentajeVariacion(promedio);
        }
    }
    public void calcularPromedioVariaciones(){
        float promedio=0.0f;
        
        for(int i=0;i<ventas.size();i++){
            promedio += ventas.get(i).getPorcentajeVariacion();
        }
        
        promedio = promedio / (ventas.size() - 1.0f);
        setPromedioVariacion(promedio);
    }

    public float getPronosticoVentas() {
        return pronosticoVentas;
    }

    public void setPronosticoVentas(float pronosticoVentas) {
        this.pronosticoVentas = pronosticoVentas;
    }
    
    public void pronosticoVentas(){
        float pronostico=0.0f;
        
        for(int i=0;i<ventas.size();i++){
            pronostico=ventas.get(i).getCantidadDeVentas() +  (ventas.get(i).getCantidadDeVentas() * getPromedioVariacion());
            setPronosticoVentas(pronostico);
        }
        
    }
    
}
