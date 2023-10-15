public abstract class RedeSocial {
    // Atributos da classe
    protected String senha;
    protected int numAmigos;

    // Metodos abstratos da classe
    public abstract void postarFoto();
    public abstract void postarVideo();
    public abstract void postarComentario();

    // Metodo publico da classe
    public void curtirPublicacao(){
        System.out.println("Curtiu a publicação!");
    }

    // Construtor
    public RedeSocial(String senha, int numAmigos) {
        this.senha = senha;
        this.numAmigos = numAmigos;
    }
}
