package aula04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner ( System.in );
        DecimalFormat simples = new DecimalFormat ( "0.0" );
        
        System.out.println( "Insira o nome do aluno(a):" );
        String nomeAluno = leia.nextLine();
        
        System.out.println( "Digite a primeira nota de " + nomeAluno + " : ");
        double nota1 = leia.nextDouble();
        
        System.out.println( "Digite a segunda nota de " + nomeAluno + " : ");
        double nota2 = leia.nextDouble();
        
        System.out.println( "Digite a terceira nota de " + nomeAluno + " : ");
        double nota3 = leia.nextDouble();
        
        System.out.println( "Digite a quarta nota de " + nomeAluno + " : ");
        double nota4 = leia.nextDouble();
        
        System.out.println( "Digite a quinta nota de " + nomeAluno + " : ");
        double nota5 = leia.nextDouble();
        
        double media = ( nota1 + nota2 + nota3 + nota4 + nota5 ) / 5;
        System.out.println( "A média de " + nomeAluno + " foi " + simples.format( media ) );
        
        if ( media >=7 ) {
            System.out.println ( nomeAluno + " está aprovado(a)!");
        } else {
            System.out.println ( nomeAluno + " está reprovado(a).");
        }
       
    }
    
}
