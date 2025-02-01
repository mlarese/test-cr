package com.example.test_cr.libreria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LibreriaRunner implements CommandLineRunner {
    @Autowired
    private LibreriaPrintService libreriaPrintService;

    @Override
    public void run(String... args) throws Exception {
        libreriaPrintService.printLibreria();
    }
}
