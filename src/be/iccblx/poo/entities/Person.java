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

    public Person(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
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

    public void setName(String name) {
        this.name = name;
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





    



}
