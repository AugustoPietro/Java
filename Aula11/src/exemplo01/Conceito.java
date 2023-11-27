package exemplo01;

public class Conceito {
    
    public double n1, n2, n3, media;
    
    public double CalcularMedia() {
        
        return this.media = (this.n1 + this.n2 + this.n3) / 3;
        
    }
    
    public void VerificarConceito() {
        
        if (CalcularMedia() >= 7 && CalcularMedia() <= 10) {
            System.out.println("Conceito A.");
        } else {
            if (CalcularMedia() >=5 && CalcularMedia() < 7) {
                System.out.println("Conceito B.");
            } else {
                if (CalcularMedia() < 5 && CalcularMedia() >= 0) {
                    System.out.println("Conceito C.");
                } else {
                    System.out.println("Erro na média.");
                }
            }
        }
    }
    
}
