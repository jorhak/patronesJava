/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pierluigi.patrones.estrategia;

/**
 *
 * @author pier
 */
public class Resta implements IAritmetica{

    public Resta() {
    }

    @Override
    public double realizarOperacion(double a, double b) {
        return a - b;
    }
    
}
