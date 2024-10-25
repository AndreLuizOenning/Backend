package com.example.demo.controller;
import com.example.demo.model.musica;
import com.example.demo.services.ServiceMusica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/playlists/{playlistId}/musicas")
public class MusicaController {
    @Autowired
    private ServiceMusica musicaService;

    @PostMapping
    public ResponseEntity<musica> addSong(@PathVariable Long playlistId, @RequestBody musica song) {
        musica newSong = musicaService.addSong(song);
        return new ResponseEntity<>(newSong, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<musica>> getAllSongs() {
        List<musica> songs = musicaService.getAllSongs();
        return new ResponseEntity<>(songs, HttpStatus.OK);
    }

    @DeleteMapping("/{songId}")
    public ResponseEntity<Void> removeSong(@PathVariable Long songId) {
        musicaService.removeSong(songId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
