/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pierluigi.patrones.memento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pier
 */
public class Caretaker {
    private List<Memento> memento = new ArrayList<Memento>();
    private int posicion = 0;

    public Caretaker() {
    }
    
    public void backup(Memento memento){
        this.memento.add(memento);
        this.posicion++;
    }
    
    public Memento atras(){
        this.posicion--;
        Memento m = new Memento();
        if(!memento.isEmpty() && posicion > 0){
            if (posicion < memento.size()){
                m = memento.get(posicion-1);
            }
        }else{
            posicion = 0;
        }
        return m;
    }
    
    public Memento delante(){
        this.posicion++;
        Memento m = new Memento();
        if(!memento.isEmpty() && posicion <= memento.size()){
            if (posicion <= memento.size()){
                m = memento.get(posicion-1);
            }
        }else{
            posicion = memento.size();
            m = memento.get(posicion-1);
        }
        return m;
    }
    
    public int getPosicion(){
        return this.posicion;
    }
    
    public String mementos(){
        String resultado = "";
        for (int i=0; i<=memento.size();i++){
            Texto text = memento.get(i).getTexto();
            resultado = resultado + text.getTexto()+"\n\r";
        }
        return resultado;
    }
}
