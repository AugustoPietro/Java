package aula04;

import java.util.Scanner;
import java.text.DecimalFormat;

/*
O programa calcula o custo total de compra de bolachas Trakinas.
Se o cliente comprar 10 ou mais pacotes, o valor de R$ 3,50 é reduzido para R$ 3,00 por unidade.
*/

public class Exercicio02 {
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner ( System.in );
        DecimalFormat moeda = new DecimalFormat ( "0.00" );
        
        System.out.println( "Bem-vindo à loja TRAKINAS!" );
        System.out.println( "Quantos pacotes de Trakinas você deseja?" );
        int quantidade = leia.nextInt();
        
        if ( quantidade >= 10 ) {
            System.out.println( "Os " + quantidade + " pacotes de Trakinas custarão um total de R$ " + moeda.format( quantidade * 3.00 ) );
        } else {
            System.out.println( "Os " + quantidade + " pacotes de Trakinas custarão um total de R$ " + moeda.format( quantidade * 3.50 ) );
        }
        
    }
    
}
