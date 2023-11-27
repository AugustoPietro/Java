package aula04;

import java.util.Scanner;
        
public class Exercicio03 {
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner ( System.in );
        
        System.out.println( "Digite um número inteiro:" );
        int num = leia.nextInt();
        
        if ( num % 2 == 0 ) {
            System.out.println( num + " é um número PAR." );
        } else {
            System.out.println( num + " é um número ÍMPAR." );
        }
        
    }
    
}
