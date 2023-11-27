package Exercicio01;


public class Notas {
    
    public String nome;
    public float nota1, nota2, nota3, nota4, nota5, media;
    
    public float calcularMedia() {
        
        return this.media = (this.nota1 + this.nota2 + this.nota3 + this.nota4 + this.nota5) / 5;
        
    }
    
    public void mostrarMedia() {
        
        System.out.println("----------------------------");    
        System.out.println("Reultado das notas de " + this.nome);    
        System.out.println("----------------------------");    
        System.out.println("A primeira nota foi " + this.nota1);    
        System.out.println("A segunda nota foi " + this.nota2);    
        System.out.println("A terceira nota foi " + this.nota3);
        System.out.println("A quarta nota foi " + this.nota4);
        System.out.println("A quinta nota foi " + this.nota5);
        System.out.println("A média final foi " + this.media);
    
        if (calcularMedia() >= 7) {
            System.out.println("O aluno esta aprovado.");
        } else {
            if (calcularMedia() >= 5) {
                System.out.println("O aluno está em recuperação.");
            } else {
                System.out.println("O aluno foi reprovado.");
            }
        }
    }
}