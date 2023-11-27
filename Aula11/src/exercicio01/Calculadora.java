package exercicio01;

public class Calculadora {
    
    public int opcao;
    public float n1, n2, resultado = 0;
    public String opc;
    
    public void RealizarCalculo() {
        
        switch (this.opc) {
            case ("+"):
                this.resultado = this.n1 + this.n2;
                break;
            case ("-"):
                this.resultado = this.n1 - this.n2;
                break;
            case ("*"):
                this.resultado = this.n1 * this.n2;
                break;
            case ("x"):
                this.resultado = this.n1 * this.n2;
                break;
            case ("X"):
                this.resultado = this.n1 * this.n2;
                break;
            case (":"):
                this.resultado = this.n1 / this.n2;
                break;
            case ("/"):
                this.resultado = this.n1 / this.n2;
                break;
            default:
                System.out.println("Opção inválida.");
        }
        System.out.println("Resultado " + this.resultado);
    }
    
}
