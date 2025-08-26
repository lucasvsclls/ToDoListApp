/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
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
    
    public String get_title(){
        return title;
    }
    
    public void set_title(String new_title){
        this.title = new_title;
    }
    
    public String get_description(){
        return description;
    }
    
    public void set_description(String new_description){
        this.description = new_description;
    }
    
    public boolean get_done(){
        return done;
    }
    
    public void set_done(boolean is_done){
        this.done = is_done;
    }
    
    public LocalDateTime get_task_date(){
        return this.task_date;
    }
}
