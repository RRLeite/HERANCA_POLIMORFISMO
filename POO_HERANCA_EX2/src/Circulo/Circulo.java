/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Circulo;

import FigurasGeometricas.Figura;


public class Circulo extends Figura {
    
    protected float raio;
    protected float diametro;
    protected float pi = (float) 3.14;

    public Circulo(float raio, float diametro) {
        this.raio = raio;
        this.diametro = diametro;
    }

    public float getRaio() {
        return raio;
    }

    public float getDiametro() {
        return diametro;
    }
    
    public float calculaAreaRaio(float raio){
       area = (float) (3.14 * (raio*raio));
       return this.area;
   }
    
    public float calculaAreaDiametro(float diametro){
        
        area = (pi * (diametro*diametro))/4;
        return area;
        
    }
    
    
    
    
    
}
