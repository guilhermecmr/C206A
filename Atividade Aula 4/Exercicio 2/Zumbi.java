public class Zumbi {

    double vida;
    String nome;

    double mostraVida(){
        return vida;
    }

    void trasnfereVida(Zumbi zumbiAlvo , double quantia){

        vida -= quantia;
        zumbiAlvo.vida += quantia;

    }

}
