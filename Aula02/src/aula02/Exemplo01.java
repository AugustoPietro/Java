package aula02;

import java.util.Scanner;

// Sistema para somar dois números

public class Exemplo01 {
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        int n1, n2, soma;
        
        System.out.println("Informe o primeiro número:");
        n1 = leia.nextInt();
        
        System.out.println("Informe o segundo número:");
        n2 = leia.nextInt();
        
        soma = n1 + n2;
        
        System.out.println( n1 + " + " + n2 + " = " + soma );
    }
    
}
