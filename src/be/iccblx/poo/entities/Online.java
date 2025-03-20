package be.iccblx.poo.entities;

import java.util.UUID;

public class Online extends Book {

    private String content;

    public Online(UUID id, String title, String author, int totalPage, int loanPeriod, double rentalPrice, Language language,
            int nbCopies, boolean borrowable, String content) {
        super(id, title, author, totalPage, loanPeriod, rentalPrice, language, nbCopies, borrowable);
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return super.toString()+"Online [content=" + content + "]";
    }


    



    
}
