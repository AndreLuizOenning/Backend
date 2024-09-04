package com.example.exercicio03;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

class main{


    public static void main(String[] args) {

        ArrayList<Barco> list = new ArrayList<Barco>();
        Barco b1 = new Barco("Barco 01", 2);
        list.add(new Barco("Barco 01", 2));
        list.add(new Barco("Barco 02", 5));
        list.add(new Barco("Barco 03", 7));
        list.add(new Barco("Barco 04", 12));
        list.add(new Barco("Barco 05", 20));

        ArrayList<BasePorto> list2 = new ArrayList<BasePorto>();
        PortoGrande pg = new PortoGrande();
        list2.add(pg);
        PortoPequeno pp = new PortoPequeno();
        list2.add(pp);

        for (Barco barco : list) {
            if (barco.tamanho<=10){
                pp.atracarBarco(barco);
            } else { pg.atracarBarco(barco); }
        }

        for (Barco barco : pp.barcosAtracados){
            System.out.println(barco.nome + " atracado no porto pequeno");
        }

        for (Barco barco : pg.barcosAtracados){
            System.out.println(barco.nome + " atracado no porto grande");
        }



        System.out.println(list);

    }
}