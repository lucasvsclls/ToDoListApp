/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.service;

/**
 *
 * @author lucas.cortes
 */
import com.app.model.Tasks;
import java.util.ArrayList;
import java.util.List;

public class TasksControl {
    
    private List<Tasks> tasks = new ArrayList();
    private long counterID = 1l;
    
    //create task
    public Tasks createTask(String title, String description){
        
        //metodo construtor da class task
        Tasks task = new Tasks(title, description, counterID++);
        task.setDone(false);
        tasks.add(task);
        return task;
    }
    
    //list tasks
    public List <Tasks> listTasks(){
        return tasks;
    }   
    
    //update tasks
    public void updateTask(long id, String newTitle, String newDescription, boolean done) {
        for (Tasks task : tasks) {
            if (task.getId().equals(id)) {
                // atualiza os campos
                task.setTitle(newTitle);
                task.setDescription(newDescription);
                task.setDone(done);
                System.out.println("Atualização completa");
            }
        }
    }     
    
    //remove tasks
    public void removeTask(long id) {
       boolean removed = tasks.removeIf(task -> task.getId().equals(id));
       if (removed) {
           System.out.println("Task removida");
       } 
       else {
           System.out.println("Task nao encontrada");
       }
   }
}
