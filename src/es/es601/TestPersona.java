package es.es601;

import java.time.LocalDate;

public class TestPersona {

    public static void main(String[] args) {

        Persona p1 = new Persona("Mario", "Rossi",
                LocalDate.of(1990, 5, 12), 'M', true);

        Persona p2 = new Persona("Anna", "Bianchi");
        p2.setDataDiNascita(LocalDate.of(2010, 3, 20));

        Persona p3 = new Persona();

        System.out.println("=== PERSONE ===");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("\n=== INIZIALI ===");
        System.out.println(p1.getIniziali());
        System.out.println(p2.getIniziali());
        System.out.println(p3.getIniziali());

        System.out.println("\n=== MAGGIORENNI ===");
        System.out.println("p1 oggi: " + p1.isMaggiorenne());
        System.out.println("p2 oggi: " + p2.isMaggiorenne());
        System.out.println("p3 oggi: " + p3.isMaggiorenne());

        System.out.println("\n=== MAGGIORENNI A DATA SPECIFICA ===");
        System.out.println(p2.isMaggiorenne(LocalDate.of(2030, 1, 1)));

        System.out.println("\n=== EQUALS ===");
        Persona p4 = new Persona("Mario", "Rossi",
                LocalDate.of(1990, 5, 12), 'M', true);

        System.out.println("p1 equals p4: " + p1.equals(p4));
    }
}
