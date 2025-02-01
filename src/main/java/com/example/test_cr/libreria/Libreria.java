package com.example.test_cr.libreria;

import com.example.test_cr.scafali.Scafale;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Libreria {
    private String id;
    private String nome;
    private String indirizzo;
    private String citta;
    private String cap;
    private String provincia;
    private String telefono;

    private List<Scafale> scaffali = new ArrayList<>();
}
