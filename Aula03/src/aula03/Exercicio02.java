package aula03;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio02 {
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner( System.in );
        DecimalFormat df = new DecimalFormat ( "0.00" );
        
        System.out.println( "Digite o nome do produto" );
        String produto = leia.nextLine();
        
        System.out.print( "Insira o preço de fornecedor: R$ " );
        double precoBase = leia.nextDouble();
        
        System.out.print( "Insira a margem de lucro projetada: % " );
        double comissao = leia.nextDouble() / 100;
        
        System.out.print( "Insira a taxa de impostos incidentes sobre o produto: % " );
        double impostos = leia.nextDouble() / 100;
        
        double precoFinal = ( precoBase * comissao ) + ( precoBase * impostos ) + precoBase;
        
        System.out.println( "O preço final do produto " + produto + " é R$ " + df.format( precoFinal ) );
        System.out.println( "O valor da comissão é de R$ " + df.format( comissao * precoBase ) + " e o total em impostos é R$ " + df.format( impostos * precoBase ) );
        
    }
    
}
