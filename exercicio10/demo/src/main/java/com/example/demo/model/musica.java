package com.example.demo.model;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class musica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

        private String title;
        private String artist;

        @ManyToOne
        @JoinColumn(name = "playlist_id")
        private ListaMusica playlist;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getArtist() {
            return artist;
        }

        public void setArtist(String artist) {
            this.artist = artist;
        }

        public ListaMusica getPlaylist() {
            return playlist;
        }

        public void setPlaylist(ListaMusica playlist) {
            this.playlist = playlist;
        }

}
