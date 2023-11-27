package aula03;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio01 {
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner( System.in );
        DecimalFormat df = new DecimalFormat( "0.00" );
        
        System.out.print( "Informe o valor da prestação: R$ " );
        double parcela = leia.nextDouble();
        
        System.out.print( "Informe o valor mensal de juros: % " );
        double jurosMes = leia.nextDouble() / 100;
        
        System.out.print( "Informe o número de dias de atraso: " );
        int atraso = leia.nextInt();
        
        double parcelaComJuros = ( atraso / 30 ) * ( jurosMes * parcela ) + parcela;
                
        System.out.println( "O valor da parcela vencida é de R$ " + df.format( parcelaComJuros ) );
        System.out.println( "O total de juros é de R$ " + df.format( ( atraso / 30 ) * ( jurosMes * parcela ) ) );
        
    }
    
}
