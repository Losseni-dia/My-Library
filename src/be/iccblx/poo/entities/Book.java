package be.iccblx.poo.entities;

import java.util.ArrayList;
import java.util.UUID;

public class Book  {

    protected UUID id;
    private String title;
    private String author;
    private int totalPage;
    private int loanPeriod;
    private ArrayList<Person> borrowers;
    private double rentalPrice;
    private Language language;
    private int nbCopies;
    private boolean borrowable;


    public Book(UUID id, String title, String author, int totalPage, int loanPeriod,
             double rentalPrice, Language language, int nbCopies,
            boolean borrowable) {
        this.id = id;
        setTitle(title);
        setAuthor(author);
        this.totalPage = totalPage;
        this.loanPeriod = loanPeriod;
        this.borrowers = new ArrayList<Person>();
        this.rentalPrice = rentalPrice;
        this.language = language;
        this.nbCopies = nbCopies;
        setBorrowable(borrowable);
    }


    public UUID getId() {
        return id;
    }


    public void setId(UUID id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) throws RuntimeException {
        if (title == null) {
            throw new RuntimeException("Le titre du livre ne peut être null");
            
        }
        if (title.trim() == "") {
            throw new RuntimeException("Le titre du livre ne peut être vide");
            
        }
        this.title = title.trim();
    }


    public String getAuthor() {
        return author;
    }


    public void setAuthor(String author) throws RuntimeException{
        if (author == null) {
            throw new RuntimeException("Le nom de l'auteur de ne peut être null");
            
        }
        if (author.trim() == "") {
            throw new RuntimeException("Le nom de l'auteur de ne peut être vide");
            
        }
        this.author = author.trim();
    }


    public int getTotalPage() {
        return totalPage;
    }


    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }


    public int getLoanPeriod() {
        return loanPeriod;
    }


    public void setLoanPeriod(int loanPeriod) {
        this.loanPeriod = loanPeriod;
    }


    public ArrayList<Person> getBorrowers() {
        return borrowers;
    }


    public void setBorrowers(ArrayList<Person> borrowers) {
        this.borrowers = borrowers;
    }


    public double getRentalPrice() {
        return rentalPrice;
    }


    public void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }


    public Language getLanguage() {
        return language;
    }


    public void setLanguage(Language language) {
        this.language = language;
    }


    public int getNbCopies() {
        return nbCopies;
    }


    public void setNbCopies(int nbCopies) {
        this.nbCopies = nbCopies;
    }


    public boolean isBorrowable() {
        return borrowable;
    }


    public void setBorrowable(boolean borrowable) throws RuntimeException {
        if (!borrowable) {
            throw new RuntimeException("Ce livre est momentanement indisponible.");
            
        }
        this.borrowable = borrowable;
    }


    @Override
    public String toString() {

        StringBuilder liste = new StringBuilder();
        borrowers.forEach(p -> {
            liste.append(p.getName()).append("\n");
        });
        
        return "Book [ title=" + title + ", author=" + author + ", totalPage=" + totalPage
                + ", loanPeriod=" + loanPeriod + " jours, borrowers=" + liste+ ", rentalPrice=" + Math.round(rentalPrice)
                + ", language=" + language + ", nbCopies=" + nbCopies + ", borrowable=" + borrowable + "]";
    }






    
    
}
