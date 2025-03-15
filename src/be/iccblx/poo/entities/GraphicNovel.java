package be.iccblx.poo.entities;

import java.util.UUID;

public class GraphicNovel extends Book{

    private Person cartoonist;
    private String color;

    public GraphicNovel(UUID id, String title, String author, int totalPage, double rentalPrice, Language language,
            int nbCopies, boolean borrowable, Person cartoonist, String color) {
        super(id, title, author, totalPage, rentalPrice, language, nbCopies, borrowable);
        this.cartoonist = cartoonist;
        this.color = color;
    }

    public Person getCartoonist() {
        return cartoonist;
    }

    public void setCartoonist(Person cartoonist) {
        this.cartoonist = cartoonist;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString()+ "GraphicNovel [cartoonist=" + cartoonist + ", color=" + color + "]";
    }

    



 
}
