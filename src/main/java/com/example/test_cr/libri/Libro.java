package com.example.test_cr.libri;

import com.example.test_cr.scafali.Scafale;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Libro {
    public String id;
    public String titolo;
    public String autore;

}
