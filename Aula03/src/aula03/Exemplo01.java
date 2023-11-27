package aula03;

import java.util.Scanner;
import java.text.DecimalFormat;

// Programa calcula os juros diários da parcela em atraso e o valor total.

public class Exemplo01 {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        System.out.print("Informe o valor da prestação: R$ ");
        double parcela = leia.nextDouble();
        
        System.out.print("Informe o número de dias de atraso: ");
        int atraso = leia.nextInt();
        
        double jurosDia = 0.02;
        double parcelaComJuros = parcela + ( atraso * ( parcela * jurosDia ));
                
        System.out.println("O valor da parcela vencida é de R$ " + df.format(parcelaComJuros));
        System.out.println("O total de juros é de R$ " + df.format( atraso * ( parcela * jurosDia )));
    }
    
}
