package aula10;

public class Cadastro {
    
    public String nome, endereco;
    public int idade;
    public long rg, cpf, telefone;
    
    public void CadastroUsuario() {
        
        System.out.println("Seu nome é " + this.nome);
        System.out.println("Seu endereço é " + this.endereco);
        System.out.println("Você tem " + this.idade + "anos.");
        System.out.println("Seu RG é " + this.rg);
        System.out.println("Seu CPF é " + this.cpf);
        
    }
    
}
