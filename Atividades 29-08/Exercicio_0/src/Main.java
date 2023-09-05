public class Main {

    public static void main(String[] args) {

        Cantina cantinadoInatel = new Cantina();

        Salgado esfirra = new Salgado();
        esfirra.nome = "Esfirra";

        Salgado kibe = new Salgado();
        kibe.nome = "Kibe";

        Salgado joelho = new Salgado();
        joelho.nome = "Joelho";

        cantinadoInatel.addSalgado(esfirra);
        cantinadoInatel.addSalgado(kibe);
        cantinadoInatel.addSalgado(joelho);

        cantinadoInatel.mostraInfo();
    }

}