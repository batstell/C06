public class Main {
    public static void main(String[] args) {
        Zumbi zumbi = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        zumbi.nome = "Rogerio";
        zumbi2.nome = "Marzelo";

        zumbi.vida = 100;
        zumbi2.vida = 50;

        //zumbi = zumbi2;

        //System.out.println("Vida do zumbi "+zumbi.nome+": "+zumbi.mostraVida());
        //System.out.println("Vida do zumbi "+zumbi2.nome+": "+zumbi2.mostraVida());

        zumbi.transfereVida(zumbi2, 50);

        System.out.println(zumbi.mostraVida());
        System.out.println(zumbi2.mostraVida());
    }
}