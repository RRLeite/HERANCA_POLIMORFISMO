/*
Faça um programa para representar a árvore genealógica de uma família. Para tal, 
crie uma classe Pessoa que permita indicar, além de nome e idade, o pai e a mãe. Tenha em mente que pai e mãe também são do tipo Pessoa.
 */
package Pessoa;

/**
 *
 * @author Roberto Leite
 */
public class Pessoa {
    
    protected String nome;
    protected int idade;
    protected Pessoa mae;
    protected Pessoa pai;

    public Pessoa(String nome, int idade, Pessoa mae, Pessoa pai) {
        this.nome = nome;
        this.idade = idade;
        this.mae = mae;
        this.pai = pai;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Pessoa getMae() {
        return mae;
    }

    public Pessoa getPai() {
        return pai;
    }
    
    

    
    
}
