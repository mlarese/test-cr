package com.example.test_cr.libri;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibroFakeDataService {
    @Autowired
    Faker faker;

    public Libro getLibro() {
        Libro l = new Libro();
        l.setTitolo(faker.book().title());
        l.setAutore(faker.book().author());
        l.setId(faker.idNumber().valid());
        return l;
    }

    public List<Libro> getLibri(int n) {
        List<Libro> libri = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            libri.add(getLibro());
        }
        return libri;
    }

}
