/*
Faça um programa que calcule a área de uma figura geométrica. 
Aceite quatro tipos de figura geométrica: quadrado, retângulo, triângulo e círculo. Use herança e polimorfismo
 */
package FigurasGeometricas;

/**
 *
 * @author Roberto Leite
 */
public class Figura {
    
    protected String nome;
    protected float altura;
    protected float base;
    protected float area;

   
    public Figura(){
        
    }
    
    public Figura(String nome, float altura, float base) {
        this.nome = nome;
        this.altura = altura;
        this.base = base;
    }

    public String getNome() {
        return nome;
    }

    public float getAltura() {
        return altura;
    }

    public float getBase() {
        return base;
    }
    
   public float calculaArea(){
       
       return this.area;
   }
    
    
    
    
    
}
