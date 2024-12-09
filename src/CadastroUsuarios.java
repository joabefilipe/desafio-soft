import java.util.Scanner;

public class CadastroUsuarios {
    public static void main(String[] args) {
        int opcao = 0;
        String cadastro = "";

        String menu = """
                ** Digite sua opção **
                1 - Cadastrar novo usuário
                2 - Consultar usuarios cadastrado
                3 - Sair
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 3){
            System.out.println(menu);
            opcao = leitura.nextInt();
            leitura.nextLine();

            if (opcao == 1){
                System.out.println("Nome da cadastrada: ");
                String nome = leitura.nextLine();
                System.out.println("Email cadastrado: ");
                String email = leitura.nextLine();

                System.out.println("Nome: " + nome);
                System.out.println("Email: " + email);

                if (!cadastro.contains("Nome cadastrado: " + nome + ", Email cadastrado: " + email)){
                    cadastro += "Nome cadastrado: " + nome + ", Email cadastrado: " + email + "\n";
                    System.out.println("Usuário cadastrado com sucesso!");
                } else {
                    System.out.println("Usuário duplicado, retorne o cadastro!");
                }
            } else if (opcao == 2){
                System.out.println(cadastro);
            }

        }
    }
}
