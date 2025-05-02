package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominios.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akudama Drive","TV", 20 );
        anime.init("Akudama Drive 2","TV", 20, "Ação" );
        anime.setGenero("Ação");
        anime.imprime();


    }
}
