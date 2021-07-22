/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pessoas;

import Agenda.Contato;

/**
 *
 * @author Roberto Leite
 */
public class PessoaJuridica extends Contato {
    
    protected int cnpj;
    protected float faturamento;

    

    public PessoaJuridica(  String nome, int cnpj,  String endereco, float faturamento) {
        super(nome, endereco);
        this.cnpj = cnpj;
        this.faturamento = faturamento;
    }
    
    
    
    @Override
     public String getNome() {
        return this.nome;
    }

    @Override
    public String getEndereco() {
        return this.endereco;
    }

    public int getCnpj() {
        return cnpj;
    }

    public float getFaturamento() {
        return faturamento;
    }
    

    @Override
    public void atualizaNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizaEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
    public void aumentaFaturamento(){
        
        faturamento+=faturamento;
        
    }
    
}
