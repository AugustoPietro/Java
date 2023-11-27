package exercicio01;

import exemplo02.Calculadora;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        Calculadora a = new Calculadora();
        
        System.out.println("-- CALCULADORA --");
        System.out.println("(+) Adição");
        System.out.println("(-) Subtração");
        System.out.println("(x) Multiplicação");
        System.out.println("(:) Divisão");
        System.out.print("Escolha uma das opções: ");
        a.opc = leia.nextLine();
        
        System.out.print("Digite o primeiro número: ");
        a.n1 = leia.nextFloat();
        System.out.print("Digite o segundo número: ");
        a.n2 = leia.nextFloat();
                       
        a.RealizarCalculo();
    }
    
}
