/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Circulo.Circulo;

/**
 *
 * @author Roberto Leite
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float areadiametro;
        float arearaio;
        Circulo c1 = new  Circulo(2,2);
        
        arearaio = c1.calculaAreaRaio(c1.getRaio());
        areadiametro = c1.calculaAreaDiametro(c1.getDiametro());
        System.out.println(areadiametro + "----" + arearaio );
    }
    
}
