package exemplo02;

public class Calculadora {
    
    public int opcao;
    public String opc;
    public float n1, n2, resultado = 0;
    
    public void RealizarCalculo() {
        
        switch (this.opcao) {
            case 1:
                this.resultado = this.n1 + this.n2;
                break;
            case 2:
                this.resultado = this.n1 - this.n2;
                break;
            case 3:
                this.resultado = this.n1 * this.n2;
                break;
            case 4:
                this.resultado = this.n1 / this.n2;
                break;
            default:
                System.out.println("Opção inválida.");
        }
        System.out.println("Resultado " + this.resultado);
    }
    
}
