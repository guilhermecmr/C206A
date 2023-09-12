import java.util.Scanner;

public class Cliente {

    String nome;
    long cpf;

    Computador [] computadores = new Computador[50];

    float calculaTotalCompra(){
        float valorFinal = 0;
        for (Computador c : computadores) {
            if (c != null) {
                valorFinal += c.preco;
            }
        }
        return valorFinal;
    }

}