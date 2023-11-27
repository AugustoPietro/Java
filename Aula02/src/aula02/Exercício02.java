package aula02;

import java.util.Scanner;
import java.text.DecimalFormat;

//Programa que converte uma quantia monetária Reais para Dólares.

public class Exercício02 {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        System.out.print("Digite a quantia em Reais: R$ ");
        double real = leia.nextDouble();
        
        double dollar = real / 4.8;
        System.out.println(" R$ " + real + " -> US$ " + df.format(dollar));
        
    }
    
}
