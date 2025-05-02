package academy.devdojo.maratonajava.javacore.Fmodificadorestico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    static {
        System.out.println("dentro do bloco de inicialização 1");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    static {
        System.out.println("dentro do bloco de inicialização 2");

    }

    static {
        System.out.println("dentro do bloco de inicialização 3");

    }

    {
        System.out.println("dentro do bloco de inicialização nao estitico");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for(int episodios: Anime.episodios){
            System.out.print(episodios + " ");
        }
        System.out.println();


    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
