package application;

import entities.RedeSocial;

public class Programa {

    public static void main(String[] args) {
        RedeSocial redeSocial = new RedeSocial();

        redeSocial.adicionarUsuario("Daniel Júnior");
        redeSocial.adicionarUsuario("Raquel Vilgovino");

        redeSocial.postar("Daniel Júnior", "Java 22 é massa");
        redeSocial.postar("Raquel Vilgovino", "Streams é a melhor novidade do Java");


        System.out.println(redeSocial.lerMural("Daniel Júnior"));

        System.out.println("=======================================================");

        redeSocial.seguir("Daniel Júnior", "Raquel Vilgovino");



    }
}

