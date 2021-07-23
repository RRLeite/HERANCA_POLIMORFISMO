/*
 [1 ponto]Crie uma enumeração DiaDaSemana com sete valores entre DOMINGO e SABADO. 
Adicione um método ehDiaUtil() à classe DiaDaSemana que retorna true se o valor em que for chamado estiver entre SEGUNDA e SEXTA e false,
caso contrário.
 */
package Semana;

/**
 *
 * @author Roberto Leite
 */
public class DiasDaSemana {
    
    protected DiaSemana dia;
    
    public enum DiaSemana{
        
        DOMINGO,
        SEGUNDA,
        TERCA,
        QUARTA,
        QUINTA,
        SEXTA,
        SABADO;
        
        
    }

    public  DiaSemana getDia() {
        return dia;
    }

    public void setDia(DiaSemana dia) {
        this.dia = dia;
    }

   public boolean ehDiaUtil(){
        
        if(getDia() == DiaSemana.SABADO || getDia() == DiaSemana.DOMINGO) {
           return true; 
            
        }
        else{
            return false;    
               
                }
        
    }

  
   
}



