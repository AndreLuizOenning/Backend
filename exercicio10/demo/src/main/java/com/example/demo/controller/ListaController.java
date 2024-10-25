package com.example.demo.controller;

import com.example.demo.model.ListaMusica;
import com.example.demo.services.ServiceLista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/playlists")
public class ListaController {
    @Autowired
    private ServiceLista playlistService;

    @PostMapping
    public ResponseEntity<ListaMusica> createPlaylist(@RequestBody ListaMusica playlist) {
        ListaMusica newPlaylist = playlistService.createPlaylist(playlist);
        return new ResponseEntity<>(newPlaylist, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ListaMusica>> getAllPlaylists() {
        List<ListaMusica> playlists = playlistService.getAllPlaylists();
        return new ResponseEntity<>(playlists, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ListaMusica> getPlaylistById(@PathVariable Long id) {
        ListaMusica playlist = playlistService.getPlaylistById(id);
        return new ResponseEntity<>(playlist, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlaylist(@PathVariable Long id) {
        playlistService.deletePlaylist(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
