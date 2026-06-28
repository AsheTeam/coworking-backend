package com.example.coworking;

import com.example.coworking.modelos.Jugador;
import com.example.coworking.repositorios.IJugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class CoworkingApplication implements CommandLineRunner {

    private final IJugadorRepository jugadorRepository;

    public CoworkingApplication(IJugadorRepository jugadorRepository) {
        this.jugadorRepository = jugadorRepository;
    }
    public static void main(String[] args) {
        SpringApplication.run(CoworkingApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Jugador> jugadores = jugadorRepository.findAll();
        System.out.println(jugadores);
    }
}
