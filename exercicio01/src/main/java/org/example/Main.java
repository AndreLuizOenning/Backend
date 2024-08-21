package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual genero de filme você prefere?");
        System.out.println("1-->Romance");
        System.out.println("2-->Ação");

        Integer genero = scanner.nextInt();


        System.out.println("Qual ambientação de filme você prefere?");
        System.out.println("1-->Espacial");
        System.out.println("2-->Medieval");

        Integer ambient = scanner.nextInt();

        if (genero == 1 && ambient == 1) {
            System.out.println("Gravidade");
        }
        if (genero == 1 && ambient == 2) {
            System.out.println("O lado feio do amor");
        }
        if (genero == 2 && ambient == 1) {
            System.out.println("Star Wars");
        }
        if (genero == 2 && ambient == 2) {
            System.out.println("Caldeirão Magico");
        }


    }
}