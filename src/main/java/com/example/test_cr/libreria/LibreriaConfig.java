package com.example.test_cr.libreria;

import com.example.test_cr.scafali.Scafale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class LibreriaConfig {
    @Autowired
    private Scafale scafaleSinistra;
    @Autowired
    private Scafale scafaleDestra;
    @Autowired
    private Scafale scafaleCentrale;


    @Bean
    public Libreria daTarantola() {
        Libreria l = new Libreria();
        l.setNome("Da Tarantola");
        l.setIndirizzo("Via dei Matti, 0");
        l.setCitta("Roma");
        l.setCap("00100");
        l.setProvincia("RM");
        l.setTelefono("06 12345678");

        l.setScaffali(List.of(scafaleSinistra, scafaleDestra, scafaleCentrale));

        return l;
    }
}
