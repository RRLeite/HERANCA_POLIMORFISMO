/*
Faça um programa de agenda que permita guardar dois tipos de contato: 
pessoa física e pessoa jurídica. Para pessoa física, guarde o nome, o CPF, o endereço e a data de aniversário. 
Para pessoa jurídica, guarde a razão social, o CNPJ, o endereço e o faturamento. Permita tanto listar todos os contatos da agenda quanto buscar um contato específico pelo seu CPF,
se for pessoa física, ou pelo CNPJ, se for pessoa jurídica. Use herança e polimorfismo.
 */
package Pessoas;

import Agenda.Contato;

/**
 *
 * @author Roberto Leite
 */
public class PessoaFisica extends Contato {
    
    int cpf;
    String dataaniversario;

    public PessoaFisica(String nome, int cpf, String dataaniversario, String endereco) {
        super(nome, endereco);
        this.cpf = cpf;
        this.dataaniversario = dataaniversario;
    }
    
    
    @Override
     public String getNome() {
        return this.nome;
    }

    @Override
    public String getEndereco() {
        return this.endereco;
    }

    @Override
    public void atualizaNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizaEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void mostraIdade(PessoaFisica pf){
        
        System.out.println("A data de aniversario e: "+ this.dataaniversario);
        
    }
    
    
    
}
