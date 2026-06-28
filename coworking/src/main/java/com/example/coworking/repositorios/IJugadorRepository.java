package com.example.coworking.repositorios;

import com.example.coworking.modelos.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IJugadorRepository extends JpaRepository<Jugador, Integer> {
}
