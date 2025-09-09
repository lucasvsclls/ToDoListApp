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
                    
                    System.out.println("Descrição: ");
                    String description = input.nextLine();
                    
                    control.createTask(title, description);
                    System.out.println("Tarefa Concluida");  
                }
                
                case 2 -> {
                    List <Tasks> tasks = control.listTasks();
                    
                    if (tasks.isEmpty()){
                        System.out.println("Nenhuma Tarefa cadastrada");
                    } else {
                        System.out.println("Lista de Tarefas:");
                        for (Tasks t : tasks){
                            System.out.println("Titulo: " + t.getTitle());
                            System.out.println("Descrição: " + t.getDescription());
                            System.out.println("Data de criação: " + t.getTaskDate());
                            System.out.println("Completa: " + t.isDone());
                        }
                    }
                }
                
                //case 3 -> 
                //update
                
                //case 4 ->
                //removed
                
                //case 5 ->
                //sair
                  
            }
        
        }
    }
}
