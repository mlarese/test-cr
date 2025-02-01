package com.example.test_cr.scafali;

import com.example.test_cr.libri.Libro;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Scafale {
    private String id;
    private String descrizione;
    private String posizione;

    public List<Libro> libri= new ArrayList<>();
}
