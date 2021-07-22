/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda;

import Pessoas.PessoaFisica;
import Pessoas.PessoaJuridica;
import java.util.ArrayList;


/**
 *
 * @author Roberto Leite
 */
public class Agenda  {
    
    protected static ArrayList<Contato> posicaoAgenda;
    
    //Construtor com nome modificado
    public Agenda(){
        
    }
    
    public static void addContato(Contato novoContato){
         posicaoAgenda.add(novoContato);
        
    }
    
    public static void findPj(Contato novoContato){
       if(novoContato instanceof PessoaJuridica){
            posicaoAgenda.add(novoContato);
            
        }
        else{
            posicaoAgenda.add(novoContato);
            
        } 
    }
    
    public static void printaPf(PessoaFisica PessoaFisica){
        
        System.out.println(PessoaFisica.getNome());
        System.out.println(PessoaFisica.getEndereco());
        System.out.println(PessoaFisica.getCpf());
        System.out.println(PessoaFisica.getDataaniversario());
        
        
    }
    
    public static void printaPj(PessoaJuridica pessoajuridica){
        
        System.out.println(pessoajuridica.getNome());
        System.out.println(pessoajuridica.getEndereco());
        System.out.println(pessoajuridica.getCnpj());
        System.out.println(pessoajuridica.getFaturamento());
        
        
    }
    
    public static void procuraContato(Contato procuraAgenda){
         int aux = posicaoAgenda.lastIndexOf(procuraAgenda);
         if(procuraAgenda instanceof PessoaFisica){
            Agenda.printaPf((PessoaFisica) procuraAgenda);
            System.out.println("A posicao do contato e"+aux);
         }
         else{
             Agenda.printaPj((PessoaJuridica) procuraAgenda);
             System.out.println("A posicao do contato e"+aux);
         }
         
         
    }
    
    
    
    
    
}
        
    
    
   /* public static void findPf(Contato novoContato){
        
        if(novoContato instanceof PessoaFisica){
            posicaoAgenda.add(novoContato);
            
        }
        else{
            posicaoAgenda.add(novoContato);
            
        }
      
        
    }
        
        
        
        
    
    
   /* public static void printaPf(PessoaFisica pessoafisica){
        
        System.out.println(pessoafisica.getNome());
        System.out.println(pessoafisica.getEndereco());
        System.out.println(pessoafisica.getCpf());
        System.out.println(pessoafisica.getDataaniversario());
       
    }
    
    public static void printaPj(PessoaJuridica pessoajuridica){
        
        System.out.println(pessoajuridica.getNome());
        System.out.println(pessoajuridica.getEndereco());
        System.out.println(pessoajuridica.getCnpj());
        System.out.println(pessoajuridica.getFaturamento());
        
        
    }*/
    

