package be.iccblx.poo.entities;

import java.util.ArrayList;

public class MyLibrary {

    private String name;
    private ArrayList<Book> books;
    private ArrayList<Person> persons;
    public static final byte BOOK_LIMIT = 3;


    public MyLibrary(String name) {
        this.name = name;
        this.books = new ArrayList<Book>();
        this.persons = new ArrayList<Person> ();
    }


    public String getName() {
        return name;
    }
    public void setName(String name) throws RuntimeException{#
        if (name == null) {
            throw new RuntimeException("Le nom de la bibliothèque ne peut être nul");
            
        }
        if (name.trim() == " ") {
            throw new RuntimeException("Le nom de la bibliothèque ne peut être vide");
            
        }
        this.name = name.trim();
    }
    public ArrayList<Book> getBooks() {
        return books;
    }
    public void setBooks(ArrayList<Book> books) throws RuntimeException{
        this.books = books;
    }
    public ArrayList<Person> getPersons() {
        return persons;
    }
    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }
    public static byte getBookLimit() {
        return BOOK_LIMIT;
    }


    @Override
    public String toString() {
        return this.getName() + name + ": "+ books.size() +" books," + persons.size() +"  members";
    }


    public void addBook(Book b) throws RuntimeException{
        if (books.contains(b)) {
            throw new RuntimeException("Ce livre est déjà enregistré dans la bibliothèque !");
            
        }
        this.books.add(b);
    }

    public void addMember(Person p) throws RuntimeException{
        if (persons.contains(p)) {
            throw new RuntimeException("Cette personne est déjà inscrite dans la bibliothèque");
            
        }
        this.persons.add(p);
    }

    public void printBooks(){
        this.books.forEach((b)->{
            System.out.println(b.getTitle()+" - "+b.getAuthor());
        });
    }

    public void prindMembers(){
        this.persons.forEach((p)->{
            System.out.println(p.getName()+", inscrit le " + p.getRegistrationDate());
        });
    }

    
    public String printBooks2(){

        StringBuilder sb = new StringBuilder();

        this.books.forEach((b)->{
            sb.append(b.getTitle()+" - "+b.getAuthor());
        });

        return sb.toString();
    }

    public String prindMembers2(){

        StringBuilder sb = new StringBuilder();

        this.persons.forEach((p)->{
            sb.append(p.getName()+", inscrit le " + p.getRegistrationDate());
        });

        return sb.toString();
    }




     
}
