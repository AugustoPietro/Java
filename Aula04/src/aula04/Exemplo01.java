package aula04;

import java.util.Scanner;

public class Exemplo01 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner( System.in );
        
        System.out.println( "Digite seu nome:" );
        String nome = leia.nextLine();
        
        System.out.println( "Digite sua idade:" );
        int idade = leia.nextInt();
        
        if ( idade >= 18 ) {
                System.out.println( nome + " está apto(a) a aplicar para a CNH." );
            } else {
                System.out.println( nome + " não está apto(a) a aplicar para a CNH." );
            
            }
    }
    
}
