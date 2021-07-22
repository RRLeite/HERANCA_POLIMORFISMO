/*
Faça um programa de agenda que permita guardar dois tipos de contato: 
pessoa física e pessoa jurídica. Para pessoa física, guarde o nome, o CPF, o endereço e a data de aniversário. 
Para pessoa jurídica, guarde a razão social, o CNPJ, o endereço e o faturamento. Permita tanto listar todos os contatos da agenda quanto buscar um contato específico pelo seu CPF,
se for pessoa física, ou pelo CNPJ, se for pessoa jurídica. Use herança e polimorfismo.
 */
package Agenda;

/**
 *
 * @author Roberto Leite
 * Nome para classe de PF é O nome do individuo e para PJ e a razao social
 */
public class Contato extends Agenda {
    
    protected String nome;
    protected String endereco;
    
    
    

   
    public Contato(){
        
    }

    public Contato(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void atualizaNome(String nome) {
        this.nome = nome;
    }

    public void atualizaEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
    
    
   
    
    
}
