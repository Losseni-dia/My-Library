package be.iccblx.poo.entities;

import java.util.UUID;

public class App {
    public static void main(String[] args) throws Exception {

        Person p = new Person(UUID.randomUUID(), "Jo");

        System.out.println(p);
        
    }
}
