package exemplo01;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        Conceito a = new Conceito();
        
        System.out.println("Informe a primeira nota: ");
        a.n1 = leia.nextDouble();
        
        System.out.println("Informe a segunda nota: ");
        a.n2 = leia.nextDouble();
        
        System.out.println("Informe a terceira nota: ");
        a.n3 = leia.nextDouble();       
        
        System.out.println("--------------------------");
        System.out.println("A média final do aluno foi " + a.CalcularMedia());
        a.VerificarConceito();
    
    }
    
}
