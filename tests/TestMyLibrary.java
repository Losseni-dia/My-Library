import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.UUID;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import be.iccblx.poo.entities.Book;
import be.iccblx.poo.entities.Language;
import be.iccblx.poo.entities.MyLibrary;
import be.iccblx.poo.entities.Person;

public class TestMyLibrary {


    private static Person jo;
    private static Book lre;
    @BeforeAll
    static void setUp(){

       jo = new Person(UUID.randomUUID(), "Jo Jota");
       
       lre = new Book(UUID.randomUUID(), "Les Rivièrs Eteintes", "Losseni Dia", 146,14, 3, Language.FR, 10, true);
        
    }


    @Test
    public void testMyLibraryWithName(){
        //Préparation
        MyLibrary lib = new MyLibrary("Nid des lecteurs");

        //Utilisation
        String expected = "Nid des lecteurs";
        String result = lib.getName();

        lib.addBook(lre);
        lib.addMember(jo);

        //Vérification
        assertEquals(expected, result);
        assertTrue(lib.getBooks().size() == 1);
        assertEquals(1, lib.getPersons().size());
        assertEquals(jo, lib.getPersons().get(0));
        assertEquals(lre, lib.getBooks().get(0));

    }

    @Test
    public void testMyLibraryWithNullValueName(){
        //Préparation
        MyLibrary lib = new MyLibrary(null);

        lib.addBook(lre);
        lib.addMember(jo);

        //Vérification
       assertNotNull(lib);
       assertNull(lib.getName());
       assertThrows(RuntimeException.class, () -> {
        System.out.println("Le nom de la bibliothèque ne peut être null");

       });

    }

    
    @Test
    public void testMyLibraryWithEmptyValueName(){
        //Préparation
        MyLibrary lib = new MyLibrary("");

        lib.addBook(lre);
        lib.addMember(jo);

        //Vérification
       assertEquals("",lib.getName());
       assertThrows(RuntimeException.class, () -> {
        System.out.println("Le nom de la bibliothèque ne peut être vide");

       });

    }

    @Test
    public void testMyLibraryWithNoMember(){
        //Préparation
        MyLibrary lib = new MyLibrary("Nid des lecteurs");

        lib.addBook(lre);

        //Vérification
       assertEquals(0, lib.getPersons().size());
       assertThrows(RuntimeException.class, () -> {
        System.out.println("La bibliothèque doit avoir au moins un adhérent !");

       });

    }

    @Test
    public void testMyLibraryWithNoBook(){
        //Préparation
        MyLibrary lib = new MyLibrary("Nid des lecteurs");

        //Vérification
       assertEquals(0, lib.getPersons().size());
       assertEquals(0, lib.getBooks().size());
       assertThrows(RuntimeException.class, () -> {
        System.out.println("La bibliothèque doit contenir au moins un livre !");

       });

    }

    public void testMyLibraryToString(){

        MyLibrary lib = new MyLibrary("Nid des lecteurs");
        
        lib.addBook(lre);
        lib.addMember(jo);

        String expected = "Nid des lecteurs: "
        this.getName() + name + ": "+ books.size() +" books," + persons.size() +"  members";

    }


    
}
