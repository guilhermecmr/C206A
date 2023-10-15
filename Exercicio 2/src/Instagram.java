import interfaces.VideoConferencia;

public class Instagram extends RedeSocial {
    // Construtor
    public Instagram(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    // Implementacao dos metodos herdados
    @Override
    public void postarFoto() {
        System.out.println("Foto postada no Instagram!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Video postado no Instagram!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Comentario postado no Instagram!");
    }

    @Override
    public void curtirPublicacao(){
        System.out.println("Curtiu a publicação no Instagram!");
    }
}
