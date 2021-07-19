/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arvore;

import Pessoa.Pessoa;

/**
 *
 * @author Roberto Leite
 */
public class Mae extends Pessoa {
    
    protected int qtdFilhos;
    protected Pessoa filho;

    public Mae(String nome, int idade, Pessoa mae, Pessoa pai) {
        super(nome, idade, mae, pai);
        
    }

    public Mae(Pessoa filhos, String nome, int idade, Pessoa mae, Pessoa pai) {
        super(nome, idade, mae, pai);
        this.filho = filho;
    }
    
    public void terFilhos(Pessoa pessaoa){
        
        qtdFilhos += qtdFilhos;
        
    }
    
    
}
