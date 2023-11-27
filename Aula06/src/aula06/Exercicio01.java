package aula06;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio01 {

       public static void main(String[] args) {
            Scanner leia = new Scanner (System.in);
            DecimalFormat df = new DecimalFormat ("0.00");
            
            System.out.println("-- Bem vindo à loja de picolés! --");
            System.out.println("Escolha um sabor:");
            System.out.println("1) Picolé de Uva R$ 1,00");
            System.out.println("2) Picolé de Laranja R$ 1,25");
            System.out.println("3) Picolé de Milho R$ 1,50");
            
            
            int sabor = leia.nextInt();
            int quantidade = 0;
                        
            if ( sabor < 1 ) {
                System.out.println("Opção inválida.");
                        } else {
                if ( sabor > 3 ) {
                    System.out.println("Opção inválida.");
                            } else {
                    System.out.println("Digite a quantidade desejada:");
                    quantidade = leia.nextInt();
                }
            }
            
            if ( sabor == 1 ) {
                System.out.println("Os " + quantidade + " picolés de Uva custarão um total de R$ " + df.format(quantidade * 1));
            } else {
                if ( sabor == 2 ) {
                    System.out.println("Os " + quantidade + " picolés de Laranja custarão um total de R$ " + df.format(quantidade * 1.25));
                } else {
                    if ( sabor == 3 ) {
                        System.out.println("Os " + quantidade + " picolés de Milho custarão um total de R$ " + df.format(quantidade * 1.5));
                    } else {
                        System.out.println("Escolha um número de 1 a 3");
                    }
                }
            }
    }
    
}
