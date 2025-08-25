package view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleMenu {

    private Scanner scanner = new Scanner(System.in);

    public void exibirMenu() {
        while (true) {
            System.out.println("\n===== MENU - TASKBOARD =====");
            System.out.println("1. Criar nova board");
            System.out.println("2. Selecionar board");
            System.out.println("3. Excluir boards");
            System.out.println("4. Sair");
            System.out.println("Escolha uma opcao: ");

            int opcao = lerOpcao();

            switch (opcao) {
                case 1 -> criarBoard();
                case 2 -> selecionarBoard();
                case 3 -> excluirBoards();
                case 4 -> sair();
                default -> System.out.println("Opção inválida");
            }
        }
    }

    private int lerOpcao() {
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            scanner.nextLine();
            return -1;
        }
    }

    private void criarBoard() {
        System.out.println("Criando board: ");
    }

    private void selecionarBoard() {
        System.out.println("Selecionando board: ");
    }

    private void excluirBoards() {
        System.out.println("Excluindo boards: ");
    }

    private void sair() {
        System.out.println("Saindo...");
        System.exit(0);
    }
}
