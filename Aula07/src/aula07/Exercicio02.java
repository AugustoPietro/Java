package aula07;

/*
O programa:
- Lê o nome do cliente;
- Oferece um menu de opções de pagamento;
- Lê a opção;
- Calcula juros ou desconto;
- Exibe o valor final e opção de pagamento do cliente.
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio02 {
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner( System.in );
        DecimalFormat df = new DecimalFormat ( "0.00" );
        
        System.out.print( "Digite o nome do cliente: " );
        String cliente = leia.nextLine();
        
        System.out.print( "Digite o valor do produto: R$ " );
        double valorProduto = leia.nextDouble();
        
        System.out.println( "-- MENU DE PAGAMENTO --" );
        System.out.println( "1) À VISTA EM DINHEIRO - 10% DE DESCONTO" );
        System.out.println( "2) PGTO. PARA 30 DIAS - 5% DE DESCONTO" );
        System.out.println( "3) PGTO. PARA 60 DIAS - PREÇO DE ETIQUETA" );
        System.out.println( "4) PGTO. PARA 90 DIAS - 5% DE JUROS" );
        System.out.println( "5) CARTÃO DE DÉBITO - 8% DE DESCONTO" );
        System.out.println( "6) CARTÃO DE CRÉDITO - 7% DE DESCONTO" );
        int opcaoPgto = leia.nextInt();
        
        if ( opcaoPgto == 1 ) {
            double valorFinal = valorProduto - ( valorProduto * 0.1 );
            System.out.println( "O valor que " + cliente + " deve pagar é R$ " + df.format( valorFinal ) + " à vista em dinheiro." );
        } else {
            if ( opcaoPgto == 2 ) {
                double valorFinal = valorProduto - ( valorProduto * 0.05 );
                System.out.println( "O valor que " + cliente + " deve pagar é R$ " + df.format( valorFinal ) + " em 30 dias." );
            } else {
                if ( opcaoPgto == 3 ) {
                    double valorFinal = valorProduto;
                    System.out.println( "O valor que " + cliente + " deve pagar é R$ " + df.format( valorFinal ) + " em 60 dias." );
                } else {
                    if ( opcaoPgto == 4 ) {
                        double valorFinal = valorProduto + ( valorProduto * 0.05 );
                        System.out.println( "O valor que " + cliente + " deve pagar é R$ " + df.format( valorFinal ) + " em 90 dias." );
                    } else {
                        if ( opcaoPgto == 5 ) {
                            double valorFinal = valorProduto - ( valorProduto * 0.08 );
                            System.out.println( "O valor que " + cliente + " deve pagar é R$ " + df.format( valorFinal ) + " no cartão de débito." );
                        } else {
                            if ( opcaoPgto == 6 ) {
                                double valorFinal = valorProduto - ( valorProduto * 0.07 );
                                System.out.println( "O valor que " + cliente + " deve pagar é R$ " + df.format( valorFinal ) + " no cartão de crédito." );
                            } else {
                                System.out.println( "Opção não encontrada." );
                                System.out.println( "Escolha uma opção entre 1 e 6." );
                            }
                        }
                    }
                }
            }
        }
    }
}
