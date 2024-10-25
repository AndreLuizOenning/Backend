package com.example.demo.repositorio;
import com.example.demo.model.ListaMusica;
import org.springframework.data.jpa.repository.JpaRepository;


public interface repositorioLista extends JpaRepository<ListaMusica, Long> {
}
