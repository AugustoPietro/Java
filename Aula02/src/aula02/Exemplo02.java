package aula02;

import java.util.Scanner;

public class Exemplo02 {
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
                
        int n1, n2;
        float pot;
        // O Java pede para que a variável de potenciação seja do tipo "double".
        
        System.out.println("Digite a base:");
        n1 = leia.nextInt();
        
        System.out.println("Digite o expoente:");
        n2 = leia.nextInt();
        
        pot = (float) Math.pow(n1,n2);
        // Foi preciso inserir "(float)" para fazer a função funcionar.
        
        System.out.println(n1 + " com expoente " + n2 + " = " + pot);
        
    }
    
}
