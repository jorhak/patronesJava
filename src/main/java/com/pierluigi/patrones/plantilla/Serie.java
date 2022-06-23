/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pierluigi.patrones.plantilla;

/**
 *
 * @author pier
 */
public abstract class Serie {
    private int valorEntrada;
    
    public String metodoPlantilla(){
        int contador = 1;
        int serie = 0;
        String resultado = "";
        while (contador <= valorEntrada){
            resultado += operacion(serie)+",";
            contador++;
            serie++;
        }
        return resultado;
    }
    
    public void setValor(int valor){
        this.valorEntrada = valor;
    }
    
    abstract int operacion(int serie);
}
