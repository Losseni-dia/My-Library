import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.util.UUID;

import org.junit.jupiter.api.Test;

import be.iccblx.poo.entities.Person;

public class TestPerson {


    @Test
    public void testsPersonWithName(){
        //Préparation
        Person jo = new Person(UUID.randomUUID(), "Jo Jota");

        //Utilisation
        String expected = "Jo Jota";
        String result = jo.getName();

        //Vérification
        assertNotNull(jo);
        assertEquals(expected, result);
        assertEquals(LocalDate.now(), jo.getRegistrationDate());
        assertTrue(jo.getBooks().size() == 0);
        assertNotNull(jo.getBooks());
    }

    @Test
    public void testsPersonWitNullValueName(){
        //Préparation
        Person jo = new Person(UUID.randomUUID(), null);

        //Vérification
        assertNotNull(jo);
        assertNull(jo.getName());
        assertThrows(RuntimeException.class, () -> { 
            System.out.println("Le nom du membre ne peut être null");
        } );
    }

    @Test
    public void testsPersonWithEmptyValueName(){
        //Préparation
        Person jo = new Person(UUID.randomUUID(), "");

        //Vérification
        assertNotNull(jo.getName());
        assertEquals("", jo.getName());
        assertThrows(RuntimeException.class, () -> { 
            System.out.println("Le nom du membre ne peut être vide");
        } );
    }

   

    
}
