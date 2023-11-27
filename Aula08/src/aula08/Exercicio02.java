package aula08;

/*
O programa irá:
- Pedir e armazenar o nome do aluno;

*/
import java.util.Scanner;

public class Exercicio02 {
        
    public static void main(String[] args) {
        
        Scanner leia = new Scanner( System.in );
        
        System.out.println("Digite o nome do aluno:");
        String aluno = leia.nextLine();
        
        System.out.println("Digite o conceito final do aluno:");
        String conceito = leia.nextLine().toUpperCase();        
        
        switch ( conceito ) {
            case "A":
                System.out.println( "O aluno " + aluno + " está aprovado com conceito A, o maior conceito.");
                break;
            case "B":
                System.out.println( "O aluno " + aluno + " está aprovado com conceito B, conceito ótimo.");
                break;
            case "C":
                System.out.println( "O aluno " + aluno + " está em recuperação com conceito C.");
                break;
            case "D":
                System.out.println( "O aluno " + aluno + " está reprovado com conceito D.");
                break;
            default:
                System.out.println( "Conceito não identificado." );
                System.out.println( "Digite um conceito entre A, B, C ou D." );
        }
        
    }
    
    
}
