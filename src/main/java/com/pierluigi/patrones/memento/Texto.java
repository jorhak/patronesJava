/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pierluigi.patrones.memento;

/**
 *
 * @author pier
 */
public class Texto {
    private String texto;

    public Texto() {
    }

    public Texto(String texto) {
        this.texto = texto;
    }
    
    public void setTexto(String texto){
        this.texto = texto;
    }
    
    public String getTexto(){
        return this.texto;
    }
    
    public Memento createMemento(){
        Texto text = new Texto();
        text.setTexto(this.texto);
        Memento memento = new Memento(text);
        return memento;
    }
    
    public void setTextoFromMemento(Memento memento){
        if(memento.getTexto()!=null){
            this.texto = memento.getTexto().getTexto();
            return;
        }
        this.texto="";
    }
    
    
}
