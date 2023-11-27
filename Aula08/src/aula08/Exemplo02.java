package aula08;

import java.util.Scanner;

public class Exemplo02 {
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        float n1 = leia.nextFloat();
        
        /*
        O comando abaixo vai corrigir o bug do Java
        na troca de leitura das variáveis Float para String.
        */
        leia.skip("\\R");
        
        System.out.println("Digite a operação desejada:");
        String operacao = leia.nextLine();
                       
        System.out.println("Digite o primeiro número:");
        float n2 = leia.nextFloat();
        
        float resultado = 0;
        
        switch ( operacao ) {
            case "+":
                resultado = n1 + n2;
                System.out.println(n1 + " + " + n2 + " = " + resultado);
                break;
            case "-":
                resultado = n1 - n2;
                System.out.println(n1 + " - " + n2 + " = " + resultado);
                break;
            case "x":
                resultado = n1 * n2;
                System.out.println(n1 + " x " + n2 + " = " + resultado);
                break;
            case ":":
                resultado = n1 / n2;
                System.out.println(n1 + " : " + n2 + " = " + resultado);
                break;
            default:
                System.out.println("Escolha entre + | - | x | : ");                
        }
    }
    
}
