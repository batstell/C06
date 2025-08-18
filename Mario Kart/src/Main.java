public class Main {
    public static void main(String[] args) {
    Piloto p1 = new Piloto();
    p1.nome = "Peach";
    p1.vilao = true;

    Piloto p2 = new Piloto();
    p2.nome = "Daisy";

    Kart k1 = new Kart();
    k1.nome = "Kart";
    k1.piloto = p1;
    k1.motor.cilindradas = "50";
    k1.motor.velocidadeMaxima = 130;

    Kart k2 = new Kart();
    k2.nome = "Kart2";
    k2.piloto = p2;
    k2.motor.cilindradas = "100";
    k2.motor.velocidadeMaxima = 80;

    p1.soltaSuperPoder();

    k2.pular();
    k1.fazerDrift();

    k1.motor.mostraInfo();
    k2.motor.mostraInfo();

    }
}