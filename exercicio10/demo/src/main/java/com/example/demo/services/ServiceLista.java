package com.example.demo.services;

import com.example.demo.model.ListaMusica;
import com.example.demo.repositorio.repositorioLista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceLista {

    @Autowired
    private repositorioLista playlistRepository;

    public ListaMusica createPlaylist(ListaMusica playlist) {
        return playlistRepository.save(playlist);
    }

    public List<ListaMusica> getAllPlaylists() {
        return playlistRepository.findAll();
    }

    public ListaMusica getPlaylistById(Long id) {
        return playlistRepository.findById(id).orElseThrow(() -> new RuntimeException("Playlist not found"));
    }

    public void deletePlaylist(Long id) {
        playlistRepository.deleteById(id);
    }
}
