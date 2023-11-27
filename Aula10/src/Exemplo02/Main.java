package Exemplo02;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        aula10.Cadastro pessoa = new aula10.Cadastro();
        
        System.out.println("Informe seu nome:");
        pessoa.nome = leia.nextLine();
        
        System.out.println("Informe seu sobrenome:");
        pessoa.sobrenome = leia.nextLine();
        
        System.out.println("Informe seu endereço:");
        pessoa.endereco = leia.nextLine();
        
        System.out.println("Informe seu bairro:");
        pessoa.bairro = leia.nextLine();
        
        System.out.println("Informe sua cidade:");
        pessoa.cidade = leia.nextLine();
        
        System.out.println("Informe seu estado:");
        pessoa.uf = leia.nextLine();
        
        System.out.println("Informe sua idade:");
        pessoa.idade = leia.nextInt();
        
        System.out.println("Informe seu telefone (apenas números sem DDD):");
        pessoa.telefone = leia.nextLong();
        
        System.out.println("Informe seu RG:");
        pessoa.rg = leia.nextLong();
        
        System.out.println("Informe seu CPF:");
        pessoa.cpf = leia.nextLong();
        
        pessoa.CadastroUsuario();
    }
    
}
