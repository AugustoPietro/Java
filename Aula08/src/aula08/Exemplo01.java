package aula08;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exemplo01 {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner( System.in );
        DecimalFormat df = new DecimalFormat( "0.0" );
        
        System.out.println( "Digite o primeiro número:" );
        float n1 = leia.nextFloat();
        
        System.out.println( "Digite o segundo número:" );
        float n2 = leia.nextFloat();
        
        System.out.println(" -- CALCULADORA -- ");
        System.out.println("1 (+) ADIÇÃO");
        System.out.println("2 (-) SUBTRAÇÃO");
        System.out.println("3 (x) MULTIPLICAÇÃO");
        System.out.println("4 (:) DIVISÃO");
        int opcao = leia.nextInt();
        float resultado = 0;
        
        switch ( opcao ) {        
            case 1:
                resultado = n1 + n2;
                System.out.println( n1 + " + " + n2 + " = " + df.format( resultado ));
                break;
            case 2:
                resultado = n1 - n2;
                System.out.println( n1 + " - " + n2 + " = " + df.format( resultado ));
                break;
            case 3:
                resultado = n1 * n2;
                System.out.println( n1 + " x " + n2 + " = " + df.format( resultado ));
                break;
            case 4:
                resultado = n1 / n2;
                System.out.println( n1 + " : " + n2 + " = " + df.format( resultado ));
                break;
            default:
                System.out.println( "Erro: operação não encontrada" );
        }
    }
    
}
