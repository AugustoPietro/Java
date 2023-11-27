package exemplo02;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        Calculadora a = new Calculadora();
        
        System.out.print("Digite o primeiro número: ");
        a.n1 = leia.nextFloat();
        System.out.print("Digite o segundo número: ");
        a.n2 = leia.nextFloat();
        
        System.out.println("-- CALCULADORA --");
        System.out.println("1 (+) Adição");
        System.out.println("2 (-) Subtração");
        System.out.println("3 (x) Multiplicação");
        System.out.println("4 (:) Divisão");
        System.out.print("Escolha uma das opções: ");
        a.opcao = leia.nextInt();
        
        a.RealizarCalculo();
    }
    
}
