import interfaces.Compartilhamento;
import interfaces.VideoConferencia;

public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento{
    // Construtor
    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    // Implementacao dos metodos herdados e das interfaces
    @Override
    public void postarFoto() {
    System.out.println("Foto postada no Facebook!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Video postado no Facebook!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Comentario postado no Facebook!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Stream realizada no Facebook!");
    }

    @Override
    public void compartilhar() {
        System.out.println("Postagem compartilhada no Facebook!");
    }

    @Override
    public void curtirPublicacao(){
        System.out.println("Curtiu a publicação no Facebook!");
    }
}
