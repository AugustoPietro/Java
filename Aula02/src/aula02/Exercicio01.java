package aula02;

import java.util.Scanner;

// O programa pede a inserção de 5 notas escolares e calcula a média.

public class Exercicio01 {
    
    public static void main(String[] args) {
             
        Scanner leia = new Scanner(System.in);
        
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

        float media = ( nota1 + nota2 + nota3 + nota4 + nota5 ) / 5;  
        System.out.println("A média do aluno foi " + media);
    }
    
}
