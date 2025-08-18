public class Zumbi {
    double vida;
    String nome;

    double mostraVida(){
        return vida;
    }

    boolean transfereVida(Zumbi zumbiAlvo, double quantia){

        if(this.vida > quantia){
            vida -= quantia;
            zumbiAlvo.vida += quantia;
            return true;
        }
        else{
            System.out.println("Vida insuficiente pra transferencia");
            return false;
        }
    }
}