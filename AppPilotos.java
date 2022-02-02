

import java.io.IOException;
import java.util.Scanner;

import aplicativos.*;

public class AppPilotos {
    public static void main(String[] args) throws InterruptedException, IOException { 
        final int MAX_ELEMENTOS = 20;
        int opcao, qtdCadastrados = 0;
        Pessoa[] pilotos = new Pessoa[MAX_ELEMENTOS];
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("\n****\nMENU\n****\n");
            System.out.println("1 - Cadastrar piloto");
            System.out.println("2 - Listar pilotos cadastrados");
            System.out.println("3 - Localizar piloto pelo CPF");
            System.out.println("4 - Aumentar espaço de armazenamento");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            opcao = in.nextInt();
            in.nextLine(); // Tira o ENTER que ficou na entrada na instrução anterior

            if (opcao == 1) {
                // Se não tem mais espaço no vetor, caio fora
                if (qtdCadastrados == MAX_ELEMENTOS) {
                    System.out.println("\nNão há espaço para cadastrar novos pilotos.");
                    voltarMenu(in);
                    continue;
                }

                //Cadastre seu piloto aqui
                Piloto p1 = new Piloto();   

                System.out.println("Nome do piloto:");
                String nome = in.nextLine();
                p1.setNome(nome);

                System.out.println("CPF do piloto:");
                int cpf = in.nextInt();
                in.nextLine();
                p1.setCpf(cpf);

                System.out.println("Brevê do piloto:");
                String breve = in.nextLine();
                p1.setBreve(breve); 

                System.out.println("Matricula do piloto:");
                int matricula = in.nextInt();
                p1.setMatricula(matricula);

                pilotos[qtdCadastrados] = p1;
                qtdCadastrados++;
                
                System.out.println("\nPiloto cadastrado com sucesso.");
                voltarMenu(in);
            } else if (opcao == 2) {
                // Se não tem ninguém cadastrado no vetor, caio fora
                if (qtdCadastrados == 0) {
                    System.out.println("\nNão há pilotos cadastrados para exibir.");
                    voltarMenu(in);
                    continue;
                }

                // Exiba os pilotos aqui

                for(int i = 0; i < qtdCadastrados; i++) {
                    System.out.println("Lista dos pilotos cadastrados: \n");
                    System.out.println("Nome do piloto (" + (i+1) + "):" + pilotos[i].getNome());
                    System.out.println("-------------------------------------------");
                }

                voltarMenu(in);
            } else if (opcao == 3) {

                System.out.println("Informa o CPF:");
                int cpfBuscado = in.nextInt();
                in.nextLine();

                for(int i = 0; i < qtdCadastrados; i++) {
                    if(cpfBuscado == pilotos[i].getCpf()) {
                        System.out.println("\nNome do piloto encontrado:" + pilotos[i].getNome());
                        voltarMenu(in);
                        continue;
                    } else {
                        System.out.println("Piloto não encontrado.");
                        voltarMenu(in);
                        continue;
                    }
                }

            } else if (opcao == 4) {

                System.out.println("Digite o tamanho do novo vetor:");
                Pessoa[] novoVetor = new Pessoa[in.nextInt()]; 

                for(int cont = 0; cont < qtdCadastrados; cont++) {
                    novoVetor[cont] = pilotos[cont];
                }
                qtdCadastrados = novoVetor.length;
                System.out.println("O tamanho do novo vetor é " + qtdCadastrados); 

            }
            else if (opcao != 0) {
                System.out.println("\nOpção inválida!");
            }
        } while (opcao != 0);

        System.out.println("Fim do programa!");

        in.close();
    }

    private static void voltarMenu(Scanner in) throws InterruptedException, IOException {
        System.out.println("\nPressione ENTER para voltar ao menu.");
        in.nextLine();

        // Limpa toda a tela, deixando novamente apenas o menu
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            System.out.print("\033[H\033[2J");
        
        //System.out.flush();
    }
}