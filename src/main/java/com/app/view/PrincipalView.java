 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.app.view;
/**
 *
 * @author lucas.cortes
 */
import com.app.model.Tasks;
import com.app.service.TasksControl;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.List;

public class PrincipalView {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        
        Scanner input = new Scanner(System.in);
        TasksControl control = new TasksControl();
        
        while(true){
            System.out.println("\n\n====Gerenciador de Tarefas====");
            System.out.println("1. Criar Tarefa");
            System.out.println("2. Listar Tarefa");
            System.out.println("3. Atualizar Tarefa");
            System.out.println("4. Remover Tarefa");
            System.out.println("5. Sair");
            System.out.println("Escolha uma opcao: ");
            
            int opcao = input.nextInt();
            input.nextLine();
            
            switch (opcao){
                case 1 -> {
                    System.out.println("Titulo: ");
                    String title = input.nextLine();
                    
                    System.out.println("Descricao: ");
                    String description = input.nextLine();
                    
                    control.createTask(title, description);
                    System.out.println("Tarefa Criada");  
                }
                
                case 2 -> {
                    List <Tasks> tasks = control.listTasks();
                    
                    if (tasks.isEmpty()){
                        System.out.println("Nenhuma Tarefa cadastrada");
                    } else {
                        System.out.println("\nLista de Tarefas:\n");
                        for (Tasks t : tasks){
                            System.out.println("Id: " + t.getId());
                            System.out.println("Titulo: " + t.getTitle());
                            System.out.println("Descricao: " + t.getDescription());
                            System.out.println("Data de criacao: " + t.getTaskDate());
                            System.out.println("Completa: " + t.isDone());
                            System.out.println("\n");
                        }
                    }
                }
                
                case 3 -> {
//                  update
                    List<Tasks> tasksList = control.listTasks();
                    if (tasksList.isEmpty()) {
                        System.out.println("Nenhuma tarefa cadastrada.");
                    } 
                    else {
                        System.out.println("Tarefas disponíveis:");
                        for (Tasks t : tasksList) {
                            System.out.println("ID: " + t.getId() + ", Titulo: " + t.getTitle());
                        }

                        System.out.println("Id da tarefa que quer atualizar:");
                        long id = input.nextLong();
                        input.nextLine();

                        System.out.println("Digite o titulo atualizado: ");
                        String newTitle = input.nextLine();

                        System.out.println("Nova descricao: ");
                        String newDescription = input.nextLine();

                        System.out.println("Ja foi feita? (true/false): ");
                        boolean done = input.nextBoolean();
                        input.nextLine();

                        control.updateTask(id, newTitle, newDescription, done);
                    }
                }
                case 4 -> {
//                  removed
                    System.out.println("Digite o id da tarefa que quer remover: ");
                    long id = input.nextLong();
                    input.nextLine();
                    
                    control.removeTask(id);
                }
                case 5 -> {
//                  sair
                    System.out.println("Fechando o programa");
                    System.exit(0);
                }
            }
        
        }
    }
}
