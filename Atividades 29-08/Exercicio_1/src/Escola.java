public class Escola {

    String nome;
    String email;
    int numTelefone;
    String endereco;
    Estudante [] estudantes = new Estudante[310];

    void addEstudante(Estudante e){
        for(int i = 0; i < estudantes.length; i++) {
            if (estudantes[i] == null) {
                estudantes[i] = e;
                break;
            }
        }
    }

    void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + numTelefone);
        System.out.println("Endereço: " + endereco);

        for (int i = 0; i < estudantes.length; i++){
            if(estudantes[i] != null){
                estudantes[i].mostraInfo();
            }
        }
    }

    void qtdEstudantesPorAno(){
        int alunosPrimeiro = 0;
        int alunosSegundo= 0;
        int alunosTerceiro = 0;

        for(int i = 0; i < estudantes.length; i++){
            if(estudantes[i] != null){
                if(estudantes[i].ano.equalsIgnoreCase("Primeiro"))
                    alunosPrimeiro++;
                else if(estudantes[i].ano.equalsIgnoreCase("Segundo"))
                    alunosSegundo++;
                else
                    alunosTerceiro++;
            }
        }
    }
}
