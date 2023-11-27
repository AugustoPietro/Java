package aula10;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        Cadastro a = new Cadastro();
        
        System.out.println("Informe seu nome:");
        a.nome = leia.nextLine();
        
        System.out.println("Informe seu endereço:");
        a.endereco = leia.nextLine();
        
        System.out.println("Informe sua idade:");
        a.idade = leia.nextInt();
        
        System.out.println("Informe seu RG:");
        a.rg = leia.nextLong();
        
        System.out.println("Informe seu CPF:");
        a.cpf = leia.nextLong();
        
        a.CadastroUsuario();
    }
    
}
