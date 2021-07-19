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
 */
public class Contato {
    
    protected String nome;
    protected String razaSocial;
    protected String endereco;
    protected int cnpj;
    protected int cpf;
    protected String dataAniversario;

   
    public Contato(){
        
    }
    
    public Contato(String nome, int cpf, String endereco, String dataAniversario) {
        this.nome = nome;
        this.endereco = endereco;
        this.dataAniversario = dataAniversario;
    }
    
    public Contato(String razaosocial, int cnpj, String endereco){
        
        this.cnpj=cnpj;
        this.razaSocial=razaosocial;
        this.endereco=endereco;
        
    }
    
    
   
    
    
}
