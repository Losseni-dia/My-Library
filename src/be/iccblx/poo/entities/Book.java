package be.iccblx.poo.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.UUID;

public class Book  {

    protected UUID id;
    private String title;
    private String author;
    private int totalPage;
    private int loanPeriod;
    private Map<LocalDate, ArrayList<Person>> borrowers;
    private double rentalPrice;
    private Language language;
    private int nbCopies;
    private boolean borrowable;


    public Book(UUID id, String title, String author, int totalPage,
             double rentalPrice, Language language, int nbCopies,
            boolean borrowable) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.totalPage = totalPage;
        this.loanPeriod = 0;
        this.borrowers = new HashMap<LocalDate, ArrayList<Person>>();
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


    public void setTitle(String title) {
        this.title = title;
    }


    public String getAuthor() {
        return author;
    }


    public void setAuthor(String author) {
        this.author = author;
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


    public Map<LocalDate, ArrayList<Person>> getBorrowers() {
        return borrowers;
    }


    public void setBorrowers(Map<LocalDate, ArrayList<Person>> borrowers) {
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
        return "Book [id=" + id + ", title=" + title + ", author=" + author + ", totalPage=" + totalPage
                + ", loanPeriod=" + loanPeriod + ", borrowers=" + borrowers + ", rentalPrice=" + rentalPrice
                + ", language=" + language + ", nbCopies=" + nbCopies + ", borrowable=" + borrowable + "]";
    }






    
    
}
