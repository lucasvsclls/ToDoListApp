/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Objects;
/**
 *
 * @author lucas.cortes
 */
public class Tasks {
    private static int count;
    
    private Long id;
    private String title;
    private String description;
    private boolean done;
    private LocalDateTime task_date;
    
    //Construtores 

    public Tasks(){
       this.done = false;
       this.task_date = LocalDateTime.now();
       count++;
    }
    
    public Tasks(String title){
        this();
        this.title = title;
    }
    
    public Tasks(String title, String description){
        this(title);
        this.description = description;
    }
    
    public Tasks(String title, String description, Long id){
        this(title, description);
        this.id = id;
    }
    
    //Metodos getters e setters
    
     public Long getId() {
        return this.id;
    }
    
    public String getTitle(){
        return title;
    }
    
    public void setTitle(String new_title){
        this.title = new_title;
    }
    
    public String getDescription(){
        return description;
    }
    
    public void setDescription(String new_description){
        this.description = new_description;
    }
    
    public boolean isDone(){
        return done;
    }
    
    public void setDone(boolean is_done){
        this.done = is_done;
    }
    
    
    public LocalDateTime getTaskDate(){
        return this.task_date;
    }
    
    public void setTaskDate(LocalDateTime new_task){
    this.task_date = new_task;
}
    
}
