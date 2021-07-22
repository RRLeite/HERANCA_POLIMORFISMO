/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Agenda.Agenda;
import Pessoas.PessoaFisica;

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
        
        PessoaFisica pf1 = new PessoaFisica("Roberto", 15038008, "18/07/1993", "Minha casa");
        
        //Agenda.addContato(pf1);
        Agenda.printaPf(pf1);
        Agenda.procuraContato(pf1);
        
        
        
        
        
        
    }
    
}
