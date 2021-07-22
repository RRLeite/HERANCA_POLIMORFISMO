/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda;

import Pessoas.PessoaFisica;
import Pessoas.PessoaJuridica;

/**
 *
 * @author Roberto Leite
 */
public class Agenda {
    
    protected int posicaoAgenda;
    
    public void procuraPf(PessoaFisica pessoafisica){
        
        System.out.println(pessoafisica.getNome());
        System.out.println(pessoafisica.getEndereco());
        System.out.println(pessoafisica.getCpf());
        System.out.println(pessoafisica.getDataaniversario());
       
    }
    
    public void procuraPj(PessoaJuridica pessoajuridica){
        
        System.out.println(pessoajuridica.getNome());
        System.out.println(pessoajuridica.getEndereco());
        System.out.println(pessoajuridica.getCnpj());
        System.out.println(pessoajuridica.getFaturamento());
        
        
    }
    
}
