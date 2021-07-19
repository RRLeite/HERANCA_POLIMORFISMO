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
public class Filho extends Pessoa {
    
    protected Pessoa pai;
    protected Pessoa mae;

    public Filho(String nome, int idade, Pessoa mae, Pessoa pai) {
        super(nome, idade, mae, pai);
    }
    
}
