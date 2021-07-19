/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quadrado;

import FigurasGeometricas.Figura;

/**
 *
 * @author Roberto Leite
 */
public class Quadrado extends Figura {
    
    public Quadrado(String nome, float altura, float base) {
        super(nome, altura, base);
    }
    
    
    @Override
    public float getAltura() {
        return altura;
    }

    @Override
    public float getBase() {
        return base;
    }

    @Override
   public float calculaArea(){
       
       area =  this.getBase() * this.getAltura(); 
       return this.area;
   }
    
    
 
    
}
