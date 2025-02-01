package com.example.test_cr.libreria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibreriaPrintService {
    @Autowired
    private Libreria libreria;

    public void printLibreria() {
        System.out.println("-------------------------------------");
        System.out.println("Libreria: " + libreria.getNome());
        System.out.println("-------------------------------------");
        System.out.print(" Indirizzo: " + libreria.getIndirizzo());
        System.out.print(" Città: " + libreria.getCitta());
        System.out.print(" CAP: " + libreria.getCap());
        System.out.print(" Provincia: " + libreria.getProvincia());
        System.out.println("Telefono: " + libreria.getTelefono());
        System.out.println("-------------------------------------");
        System.out.println("Scaffali: ");
        System.out.println("-------------------------------------");
        libreria.getScaffali().forEach(s -> {
            System.out.println("-------------------------------------");
            System.out.print(" ID: " + s.getId());
            System.out.print(" Posizione: " + s.getPosizione());
            System.out.println(" Descrizione: " + s.getDescrizione());
            System.out.println("-------------------------------------");
            System.out.println("Libri: ");
            System.out.println("-------------------------------------");
            s.getLibri().forEach(l -> {
                System.out.print(" ID: " + l.getId());
                System.out.print(" Titolo: " + l.getTitolo());
                System.out.println(" Autore: " + l.getAutore());
            });
        });
    }
}
