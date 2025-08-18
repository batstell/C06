public class Arma {
    String nome;
    int poder;
    int resistencia;
    String descricao;

    public Arma(String nome, int poder, int resistencia, String descricao) {
        this.nome = nome;
        this.poder = poder;
        this.resistencia = resistencia;
        this.descricao = descricao;
    }

    void mostraInfoArma() {
        System.out.println("Nome: " + nome);
        System.out.println("Poder: " + poder);
        System.out.println("Resistencia: " + resistencia);
        System.out.println("Descricao: " + descricao);
    }
}