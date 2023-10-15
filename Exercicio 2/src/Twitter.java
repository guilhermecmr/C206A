import interfaces.Compartilhamento;
import interfaces.VideoConferencia;

public class Twitter extends RedeSocial implements Compartilhamento {
    // Construtor
    public Twitter(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    // Implementacao dos metodos herdados e da interface
    @Override
    public void postarFoto() {
        System.out.println("Foto postada no Twitter!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Video postado no Twitter!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Comentario postado no Twitter!");
    }

    @Override
    public void compartilhar() {
        System.out.println("Postagem compartilhada no Twitter!");
    }

    @Override
    public void curtirPublicacao(){
        System.out.println("Curtiu a publicação no Twitter!");
    }
}
