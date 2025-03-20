package be.iccblx.poo.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.UUID;

public class Person {

    protected UUID id;
    private String name;
    private LocalDate registrationDate;
    private Map<LocalDate, ArrayList<Book>> books;

    public Person(UUID id,String name) {
        this.id = id;
        setName(name);
        this.registrationDate = LocalDate.now();
        this.books = new HashMap<LocalDate, ArrayList<Book>>();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws RuntimeException {
        if (name == null) {
            throw new RuntimeException("Le nom du membre ne peut être null");    
        }

        if (name.trim() == "") {
            throw new RuntimeException("Le nom du membre ne peut être vide");    
        }
        this.name = name.trim();
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Map<LocalDate, ArrayList<Book>> getBooks() {
        return books;
    }

    public void setBooks(Map<LocalDate, ArrayList<Book>> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        
        return "Person [" + id + ": " + name + ", inscrit le " + registrationDate + ", loans=" + ( books != null ? books.values().size(): null)
         + "]";
    }

    public int countLoans(){

        // TODO
     return 0;
    }

    public void getLateBooks(){
        books.forEach((date, bookList) -> {
            
        });
    }





    



}
