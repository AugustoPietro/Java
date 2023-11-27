package Exemplo03;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        Soma a = new Soma();
        
        System.out.println("Digite o primeiro número:");
        a.n1 = leia.nextInt();
        
        System.out.println("Digite o segundo número:");
        a.n2 = leia.nextInt();
        
        a.Somar();
        a.Mostrar();
        
    }
    
}
