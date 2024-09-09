package DesafioIncode;

import java.util.ArrayList;

import java.util.Scanner;

import java.util.List;

public class DesafioListaDeTarefas {
    public static void main(String[] args) {

        // criacao das listas
        List<String> ListaDeTarefas = new ArrayList<>();
        int opcao = 0;
        int i = 1;
        //meio inicial de iniciar a lista de tarefas
            Scanner src = new Scanner(System.in);

            //loop principal
            while (true) {
                System.out.println("\n--- Lista de Tarefas ---");
                System.out.println("1. Adicionar nova tarefa");
                System.out.println("2. Marcar como concluida");
                System.out.println("3. Listar todas as tarefas");
                System.out.println("4. Sair");
                System.out.println("Escolha uma opcao: ");
                opcao = src.nextInt();
                src.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.print("Digite a tarefa: ");
                        String tarefa = src.nextLine();
                        ListaDeTarefas.add(tarefa); //adicionando tarefa na lista
                        System.out.println("Tarefa adicionada!");
                        break;
                    case 2:
                        System.out.print("Digite o numero da tarefa que deseja marcar como concluida: ");
                        int indice = src.nextInt();
                        src.nextLine(); // limpar buffer do scanner
                        if (indice > 0 && indice <= ListaDeTarefas.size()) { //verificando se o indice informado é valido
                            ListaDeTarefas.set(indice - 1, ListaDeTarefas.get(indice - 1) + "(Concluida!)"); //marcando tarefa com concluida
                        } else {
                            System.out.println("Indice Invalido!");
                        }
                        break;
                    case 3:
                        System.out.println("Tarefas: ");
                        for (i = 0; i < ListaDeTarefas.size(); i++) {
                            System.out.println((i + 1) + "-" + ListaDeTarefas.get(i)); //exibindo tarefas adicionadas
                        }
                        break;
                    case 4:
                        System.out.println("Encerrando o programa...");
                        src.close();
                        return;
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                }
            }
    }
}
