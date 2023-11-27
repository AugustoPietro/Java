package aula09;

public class Exemplo02 {
    
    public static void main(String[] args) {
        
        int num = 0;
        
        while (num <=60) {
            if (num % 2 == 0) {
                System.out.println(num + " é par.");
            } else {
                System.out.println(num + " é ímpar.");
            }
            num = num + 1;
        }
    }
    
}
