package com.example.demo.model;


import jakarta.persistence.*;
import java.util.List;

@Entity
public class ListaMusica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    @OneToMany(mappedBy = "playlist", cascade = CascadeType.ALL)
    private List<musica> songs;



    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<musica> getSongs() {
        return songs;
    }

    public void setSongs(List<musica> songs) {
        this.songs = songs;
    }
}