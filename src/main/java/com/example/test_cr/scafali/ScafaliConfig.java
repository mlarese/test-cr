package com.example.test_cr.scafali;

import com.example.test_cr.libri.LibroFakeDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Configuration
public class ScafaliConfig {
    @Autowired
    private LibroFakeDataService libroFakeDataService;

    @Bean(name = "scafaleSinistra")
    public Scafale  scafaleSinistra(){
        Scafale s = new Scafale();
        s.setPosizione("Sinistra");
        s.setDescrizione("Scafale sinistro");
        s.setId("1");
        s.setLibri(libroFakeDataService.getLibri(25));
        return s;
    }

    @Bean(name = "scafaleDestra")
    public Scafale  scafaleDestra(){
        Scafale s = new Scafale();
        s.setPosizione("Destra");
        s.setDescrizione("Scafale destro");
        s.setId("2");
        s.setLibri(libroFakeDataService.getLibri(25));
        return s;
    }

    @Bean(name = "scafaleCentrale")
    public Scafale  scafaleCentrale(){
        Scafale s = new Scafale();
        s.setPosizione("Centrale");
        s.setDescrizione("Scafale centrale");
        s.setId("3");
        s.setLibri(libroFakeDataService.getLibri(25));
        return s;
    }

}
