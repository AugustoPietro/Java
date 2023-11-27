package aula02;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercício03 {
    
// O  programa calcula o valor final de um automóvel zero km.
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        System.out.println("Digite a marca do automóvel:");
        String marca = leia.nextLine();
        
        System.out.println("Digite o modelo do veículo:");
        String modelo = leia.nextLine();
        
        System.out.println("Digite o valor de fábrica:");
        double precoFabrica = leia.nextDouble();
        
        double imposto = precoFabrica * 0.45;
        double comissao = precoFabrica * 0.28;
        double total = precoFabrica + imposto + comissao;
        
        System.out.println(" ");
        System.out.println("O valor final do " + marca + " " + modelo + " é de R$ " + df.format(total));
        System.out.println("PREÇO DE FÁBRICA: R$ " + df.format(precoFabrica));
        System.out.println("COMISSÃO DO REVENDEDOR: R$ " + df.format(comissao));
        System.out.println("TOTAL EM IMPOSTOS: R$ " + df.format(imposto));
        
    }
    
}
