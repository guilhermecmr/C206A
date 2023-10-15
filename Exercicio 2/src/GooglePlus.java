import interfaces.Compartilhamento;
import interfaces.VideoConferencia;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento {
    // Construtor
    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    // Implementacao dos metodos herdados e das interfaces
    @Override
    public void postarFoto() {
        System.out.println("Foto postada no Google Plus!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Video postado no Google Plus!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Comentario postado no Google Plus!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Stream realizada no Google Plus!");
    }

    @Override
    public void compartilhar() {
        System.out.println("Postagem compartilhada no Google Plus!");
    }

    @Override
    public void curtirPublicacao(){
        System.out.println("Curtiu a publicação no Google Plus!");
    }
}
