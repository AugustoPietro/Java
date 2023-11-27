package aula07;

/*
O programa irá:
- Solicitar o nome de uma marca de biscoito;
- Ignorar diferença entre maiúsculas e minúsculas;
- Imprimir uma resposta baseado na lista armazenada.
*/

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner( System.in );
                
        System.out.println("Qual seu biscoito favorito?");
        String biscoito = leia.nextLine();
        
        if ( biscoito.equalsIgnoreCase("atenados") || biscoito.equalsIgnoreCase("cartoon") ) {
            System.out.println("Você gosta de um baratex!");
        } else {
            if ( biscoito.equalsIgnoreCase("oreo") || biscoito.equalsIgnoreCase("bono") ) {
                System.out.println("Você escolheu um biscoito carex!");
            } else {
                System.out.println("Você escolheu um biscoito que não está na minha lista.");
            }
        }
    }
    
}
