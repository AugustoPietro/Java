package aula06;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Qual carro você acha mais bonito?");
        System.out.println("1) VW Fusca");
        System.out.println("2) GM Opala");
        System.out.println("3) Ferrari 360");
        System.out.println("4) Porsche 911");
        
        int carro = leia.nextInt();
        
        if ( carro == 1 || carro == 2 ) {
            System.out.println("Você é amante de carros antigos.");
        } else {
            if ( carro == 3 ||  carro == 4 ) {
                System.out.println("Você gosta de supercarros!");
            } else {
                System.out.println("Carro não encontrado.");
            }
        }
        
    }
    
}
