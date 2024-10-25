package com.example.demo.services;
import com.example.demo.model.musica;
import com.example.demo.repositorio.repositorioMusica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ServiceMusica {
    @Autowired
    private repositorioMusica songRepository;

    public musica addSong(musica song) {
        return songRepository.save(song);
    }

    public List<musica> getAllSongs() {
        return songRepository.findAll();
    }

    public void removeSong(Long id) {
        songRepository.deleteById(id);
    }
}
