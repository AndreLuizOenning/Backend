package com.example.demo.repositorio;
import com.example.demo.model.musica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repositorioMusica extends JpaRepository<musica, Long> {
}