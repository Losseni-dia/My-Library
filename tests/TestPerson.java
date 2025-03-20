import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.util.UUID;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import be.iccblx.poo.entities.Person;

public class TestPerson {


    @Test
    public void PersonWithName(){
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
        assertNotNull(jo.getBooks().values());
    }

   

    
}
