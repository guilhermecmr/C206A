import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Escola escola = new Escola();
        escola.nome = "Escola";
        escola.endereco = "Rua Jorge";
        escola.numTelefone = 132452;
        escola.email = "escola@gmail.com";

        boolean controle = true;

        while(controle) {

            System.out.println("1 - Adicionar aluno");
            System.out.println("2 - Mostrar informações");
            System.out.println("3 - Mostrar quantidade de alunos por ano");
            System.out.println("4 - Sair");
            sc.nextLine(); ////////////// Limpa buffer

            System.out.println("Digite a opção: ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    Estudante aluno = new Estudante();
                    System.out.print("Nome do aluno: ");
                    aluno.nome = sc.nextLine();
                    System.out.println("Idade do aluno: ");
                    aluno.idade = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ano do aluno: ");
                    aluno.ano = sc.nextLine();
                    break;

                case 2:
                    escola.mostraInfo();
                    break;

                case 3:
                    escola.qtdEstudantesPorAno();
                    break;

                case 4:
                    controle = false;
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
