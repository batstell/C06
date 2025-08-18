public class Personagem {
    String nome;
    int pontos;
    Arma arma;

    public Personagem(String nome, int pontos, Arma arma) {
        this.nome = nome;
        this.pontos = pontos;
        this.arma = arma;
    }

    void usarArma(){
        arma.resistencia-=2;
        System.out.println("Voce perdeu 2 pontos de resistencia");
    }
    void tomarDano(){
        pontos-=5;
        System.out.println("Voce perdeu 5 pontos de vida");
    }
}
