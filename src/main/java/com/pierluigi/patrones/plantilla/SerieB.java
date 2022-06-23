/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pierluigi.patrones.plantilla;

/**
 *
 * @author pier
 */
public class SerieB extends Serie{

    @Override
    int operacion(int serie) {
        return serie != 0 ? multi(serie) : 1;
    }
    
    private int multi(int cantidad){
        int valor = 1;
        while (cantidad > 0){
            valor = valor*10;
            cantidad--;
        }
        return valor;
    }
    
}
