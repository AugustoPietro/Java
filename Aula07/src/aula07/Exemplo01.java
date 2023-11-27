package aula07;

/*
O programa irá:
- Ler o nome de um(a) corretor(a) de imóveis;
- Ler o valor do imóvel negociado;
- Calcular a comissão do(a) corretor(a);
- Calcular o valor final do imóvel;
- Exibir os resultados.

*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exemplo01 {
   
    public static void main(String[] args) {       
            
        Scanner leia = new Scanner( System.in );
        DecimalFormat df = new DecimalFormat( "0.00" );
        
        System.out.print( "Por favor digite o nome do corretor: " );
        String corretor = leia.nextLine();
        
        System.out.println( "Digite o valor do imóvel: R$ " );
        double valorImovel = leia.nextDouble();
                        
        if ( valorImovel >= 0 && valorImovel < 70000 ) {
            double comissao = valorImovel * 0.1;
            double valorFinal = valorImovel + comissao;
            System.out.println( "O valor final do imóvel é R$ " + df.format( valorFinal ) );
            System.out.println( "O valor da comissão de " + corretor + " é de R$ " + df.format( comissao ) );
        } else {
            if ( valorImovel >= 70000 && valorImovel < 100000 ) {
                double comissao = valorImovel * 0.15;
                double valorFinal = valorImovel + comissao;
                System.out.println( "O valor final do imóvel é R$ " + df.format( valorFinal ) );
                System.out.println( "O valor da comissão de " + corretor + " é de R$ " + df.format( comissao ) );
            } else {
                if ( valorImovel >= 100000 ) {
                    double comissao = valorImovel * 0.2;
                    double valorFinal = valorImovel + comissao;
                    System.out.println( "O valor final do imóvel é R$ " + df.format( valorFinal ) );
                    System.out.println( "O valor da comissão de " + corretor + " é de R$ " + df.format( comissao ) );
                } else {
                    System.out.println( "Erro no valor informado." );
                    }
            }
        }
    }
    
}