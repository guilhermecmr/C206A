import java.lang.reflect.InaccessibleObjectException;

public class Main {

    public static void main(String[] args) {
        // Cria as redes sociais
        Facebook newFacebook = new Facebook("jorge321", 222);
        Instagram newInstagram = new Instagram("jorge123",234);

        // Cria o array de redes sociais
        RedeSocial [] redesSociais = new RedeSocial[5];

        // Preenche o array de redes sociais
        for(int i = 0; i < redesSociais.length; i++){
            if(redesSociais[i] == null){
                redesSociais[i] = newFacebook;
                break;
            }
        }
        for(int i = 0; i < redesSociais.length; i++){
            if(redesSociais[i] == null){
                redesSociais[i] = newInstagram;
                break;
            }
        }

        // Cria o novo usuario
        Usuario jorge = new Usuario("Jorge", "jorge.lafond@gmail.com", redesSociais);

        // Executa os metodos das redes sociais
        if(jorge.redesSociais[0] instanceof Facebook) {
            ((Facebook)jorge.redesSociais[0]).fazStreaming();
            ((Facebook)jorge.redesSociais[0]).compartilhar();
        }
        jorge.redesSociais[0].curtirPublicacao();
        jorge.redesSociais[1].postarFoto();
        jorge.redesSociais[1].postarVideo();
        jorge.redesSociais[1].postarComentario();
    }
}
