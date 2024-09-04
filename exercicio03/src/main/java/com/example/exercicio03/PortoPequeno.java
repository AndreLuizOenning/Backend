package com.example.exercicio03;

public class PortoPequeno extends BasePorto{
    @Override
    public void atracarBarco(Barco barco){
        if (barco.tamanho <= 10){
            barcosAtracados.add(barco);
        } else {
            System.out.println("Error");
        }
    }

}
