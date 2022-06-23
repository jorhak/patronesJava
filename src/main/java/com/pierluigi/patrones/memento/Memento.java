/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pierluigi.patrones.memento;

/**
 *
 * @author pier
 */
public class Memento {
    private Texto text;

    public Memento() {
    }

    public Memento(Texto text) {
        this.text = text;
    }
    
    public Texto getTexto(){
        return this.text;
    }
    
    public void setTexto(Texto text){
        this.text = text;
    }
}
