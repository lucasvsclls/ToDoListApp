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
    //implementar
    
    
    //remove tasks
     public boolean removeTask(long id) {
        return tasks.removeIf(task -> task.getId().equals(id));
    }    
    
}
