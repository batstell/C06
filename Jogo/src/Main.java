public class Main {
    public static void main(String[] args) {
    Arma arma = new Arma("USP", 30, 75, "Silênciosa e mortal");
    Personagem personagem = new Personagem("Iso", 100, arma);

    personagem.usarArma();
    personagem.tomarDano();
    System.out.println("Vida total: "+personagem.pontos);
    arma.mostraInfoArma();
    }
}