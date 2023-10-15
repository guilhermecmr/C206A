public class Usuario {
    // Atributos do usuario
    private String nome;
    private String email;

    // Array de redes sociais
    public RedeSocial [] redesSociais = new RedeSocial[5];

    // Construtor
    public Usuario(String nome, String email, RedeSocial [] redesSociais) {
        this.nome = nome;
        this.email = email;
        this.redesSociais = redesSociais;
    }
}
