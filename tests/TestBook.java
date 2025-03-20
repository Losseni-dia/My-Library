
import static org.junit.Assert.*;

import java.util.UUID;

import org.junit.jupiter.api.Test;

import be.iccblx.poo.entities.Book;
import be.iccblx.poo.entities.Language;

public class TestBook {

    @Test
    public void testsBookWithTitle(){

        //Préparation
        Book lre = new Book(UUID.randomUUID(), "Les Rivièrs Eteintes", "Losseni Dia", 146,14, 3, Language.FR, 10, true);

        //Utilisation
        String titleExpected = "Les Rivièrs Eteintes";
        String result = lre.getTitle();
        String authorExpected ="Losseni Dia";
        String result2 = lre.getAuthor();

        //Vérification
        assertTrue(titleExpected == result);
        assertEquals(authorExpected, result2);
        assertEquals(146, lre.getTotalPage());
        assertTrue(lre.getRentalPrice() == 3);
        assertTrue(lre.getLanguage().equals(Language.FR));
        assertEquals(10, lre.getNbCopies());
        assertTrue(lre.isBorrowable());
        assertEquals(0, lre.getBorrowers().size());
        assertNotNull(lre.getBorrowers());



    }

    @Test
    public void testsBookNullValueTitle(){

        //Préparation
        Book lre = new Book(UUID.randomUUID(), null, "Losseni Dia", 146, 14, 3, Language.FR, 10, true);


        //Vérification
       assertNotNull(lre);
       assertNotNull(lre.getTitle());
       assertThrows(RuntimeException.class, () ->{
        System.out.println("Le titre du livre ne peut être null ! ");
       });

    }

    @Test
    public void testsBookWithAuthor(){

        //Préparation
        Book lre = new Book(UUID.randomUUID(), "Les Rivières Eteintes", "Losseni Dia", 146,14, 3, Language.FR, 10, true);

        //Utilisation
        String authorExpected ="Losseni Dia";
        String result = lre.getAuthor();


        //Vérification
        assertEquals(authorExpected, result);

    }

    @Test
    public void testsBookWithNullValueAuthor(){

        //Préparation
        Book lre = new Book(UUID.randomUUID(), "Les Rivières Eteintes", null, 146,14, 3, Language.FR, 10, true);

        //Vérification
        assertNull(lre.getAuthor());
        assertThrows(RuntimeException.class, () ->{
            System.out.println("L'auteur du livre ne peut être null");
        });
        
    }

    @Test
    public void testsBookWithEmptyValueAuthor(){

        //Préparation
        Book lre = new Book(UUID.randomUUID(), "Les Rivières Eteintes", "", 146,14, 3, Language.FR, 10, true);

        //Vérification
        assertNotNull(lre.getAuthor());
        assertTrue(lre.getAuthor() == "");
        assertThrows(RuntimeException.class, () ->{
            System.out.println("L'auteur du livre ne peut être vide");
        });
        
    }

    @Test
    public void testsNotBorrowableBook(){

        //Préparation
        Book lre = new Book(UUID.randomUUID(), "Les Rivières Eteintes", "Losseni Dia", 146,14, 3, Language.FR, 10, false);

        //Vérification
        assertFalse(lre.isBorrowable());
        assertThrows(RuntimeException.class, () ->{
            System.out.println("Ce livre est momentanément indisponible !");
        });
        
    }

    @Test
    public void toStringWithNoBorrowers(){

         //Préparation
         Book lre = new Book(UUID.randomUUID(), "Les Rivières Eteintes", "Losseni Dia", 146,14, 3, Language.FR, 10, true);

         //Utilisation
         String expexted = "Book [ title=" + "Les Rivières Eteintes" + ", author=" + "Losseni Dia"
                + ", totalPage=" + 146
                + ", loanPeriod=" + 14 + " jours, borrowers=" + "" + ", rentalPrice=" + 3
                + ", language=" + Language.FR + ", nbCopies=" + 10 + ", borrowable=" + true+ "]";

         String result = lre.toString();

         //Vérification

         assertEquals(expexted, result);







    }

    

    
}
