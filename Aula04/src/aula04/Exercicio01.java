package aula04;

import java.util.Scanner;

public class Exercicio01 {
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner( System.in );
        
        System.out.println( "Olá, qual é o seu nome?" );
        String nome = leia.nextLine();
        
        System.out.println( "Qual é a cor predominante do maior time do Sul do Brasil? Dica: 4 letras." );
        String resposta = leia.nextLine();
                
        if ( resposta.equalsIgnoreCase( "azul" ) ) {
            System.out.println( "Parabéns, " + nome + "! Você acertou!" );
                    } else {
            System.out.println( "Não, " + nome + ". Infelizmente não é isso." );
            
        }
        
    }
    
}
