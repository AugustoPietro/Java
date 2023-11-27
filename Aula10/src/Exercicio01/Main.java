package Exercicio01;

import Exemplo03.Soma;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        Notas aluno = new Notas();                     
    
        System.out.println("Informe o nome do(a) aluno(a):");
        aluno.nome = leia.nextLine();
        
        System.out.println("Informe a primeira nota (1/5):");
        aluno.nota1 = leia.nextFloat();
        
        System.out.println("Informe a segunda nota (2/5):");
        aluno.nota2 = leia.nextFloat();
        
        System.out.println("Informe a terceira nota (3/5):");
        aluno.nota3 = leia.nextFloat();
        
        System.out.println("Informe a quarta nota (4/5):");
        aluno.nota4 = leia.nextFloat();
        
        System.out.println("Informe a quinta nota (5/5):");
        aluno.nota5 = leia.nextFloat();
        
        aluno.calcularMedia();
        
        System.out.println("A média do aluno " + aluno.nome + " foi " + aluno.media + " .");
        
        }
        
}
