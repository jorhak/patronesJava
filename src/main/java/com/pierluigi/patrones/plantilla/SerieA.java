/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pierluigi.patrones.plantilla;

/**
 *
 * @author pier
 */
public class SerieA extends Serie{

    @Override
    int operacion(int serie) {
        return serie != 0 ? serie+1 : 1;
    }
    
}
