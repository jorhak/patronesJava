/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pierluigi.patrones.estrategia;

/**
 *
 * @author pier
 */
public class OperacionAritmetica {
    private IAritmetica estrategia;
    private double a;
    private double b;

    public OperacionAritmetica(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    public void setEstrategia(IAritmetica estrategia){
        this.estrategia = estrategia;
    }
    
    public double procesar(){
        return this.estrategia.realizarOperacion(a, b);
    }
}
