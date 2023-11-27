package aula09;

import java.util.Scanner;

public class Exemplo03 {
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
                
        String opcao = "S";
        
        while (opcao.equalsIgnoreCase("S")) {
                    
            System.out.println("Digite a primeira nota:");
            float nota1 = leia.nextFloat();
            
            System.out.println("Digite a segunda nota:");
            float nota2 = leia.nextFloat();
            
            System.out.println("Digite a terceira nota:");
            float nota3 = leia.nextFloat();
            
            System.out.println("Digite a quarta nota:");
            float nota4 = leia.nextFloat();
            
            System.out.println("Digite a quinta nota:");
            float nota5 = leia.nextFloat();
            
            leia.skip("\\R");

            float media = ( nota1 + nota2 + nota3 + nota4 + nota5 ) / 5;  
            System.out.println("A média do aluno foi " + media);

            if (( media >= 7 ) && ( media <= 10 )) {
                System.out.println("Aluno aprovado!");
            } else {
                if ( media >= 5 && media < 7 ) {
                    System.out.println("Aluno em recuperação.");
                } else {
                    if ( media >= 0 && media < 5 ) {
                        System.out.println("Aluno reprovado.");
                    } else {
                        System.out.println("Erro no cálculo.");
                    }
                }
            }
            
            System.out.println("Deseja continuar? (S/N)");
            opcao = leia.nextLine();
            System.out.println("-----------");
        }        
    }    
}
