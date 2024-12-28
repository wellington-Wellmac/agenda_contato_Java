import java.util.ArrayList;
import java.util.Scanner;

public class AgendaDeContatos {
    public static void main(String[] args) {
        ArrayList<Contato> contatos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Adicionar Contato");
            System.out.println("2. Buscar Contato");
            System.out.println("3. Listar Contatos");
            System.out.println("4. Remover Contato");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o telefone: ");
                    String telefone = scanner.nextLine();
                    contatos.add(new Contato(nome, telefone));
                    System.out.println("Contato adicionado!");
                    break;

                case 2:
                    System.out.print("Digite o nome para buscar: ");
                    String busca = scanner.nextLine();
                    boolean encontrado = false;
                    for (Contato contato : contatos) {
                        if (contato.nome.equalsIgnoreCase(busca)) {
                            System.out.println("Contato encontrado: " + contato);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("Lista de Contatos:");
                    for (Contato contato : contatos) {
                        System.out.println(contato);
                    }
                    break;

                case 4:
                    System.out.print("Digite o nome do contato para remover: ");
                    String remover = scanner.nextLine();
                    contatos.removeIf(contato -> contato.nome.equalsIgnoreCase(remover));
                    System.out.println("Contato removido (se existia).");
                    break;

                case 5:
                    System.out.println("Saindo...");
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
