public class Zumbi {

    double vida;
    String nome;

    double mostraVida() {
        return vida;
    }

    boolean trasnfereVida(Zumbi zumbiAlvo, double quantia) {

        if (vida > quantia) {
            vida -= quantia;
            zumbiAlvo.vida += quantia;
            return true;
        }else{
            return false;
        }

    }

}
