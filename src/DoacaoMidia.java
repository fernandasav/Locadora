//Criar classe DoacaoMidia
//        Essa classe deve conter método pegarMidiaAleatoria() que devolve uma midia já criada na biblioteca
//        aleatória
//        Esse classe deve conter método assisitirFilme(Dvd dvd) e chamar os dois métodos de legenda
//        Método main: O main deve pegar uma midia aleatoria e dar o play

import java.util.Random;

public class DoacaoMidia {

    public static void main(String[] args) {
        Midia midia = pegarMidiaAleatoria();
        System.out.println(midia);
        midia.darPlay();

        Dvd dvd = new Dvd("1234", 27.90, "Romeu e Julieta", "Italiano", true, "Inglês");
        assistirFilme(dvd);
    }
    public static Midia pegarMidiaAleatoria () {
        Dvd dvdUm = new Dvd("0", 13.10, "Nasce uma Estrela", "Espanhol", true, "Inglês");
        Dvd dvdDois = new Dvd("1", 17.69, "Gone with the wind", "inglês", true, "Português");
        CD cdUm = new CD("2", 12.90, "AS 4 Estações", "Sandy e Junior", 12);
        CD cdDois = new CD("3", 18.50, "Love Songs", "ColdPlay", 8);

        Random gerador = new Random();
        int valorAleatorio = gerador.nextInt(4);

        switch (valorAleatorio) {
            case 0:
                return dvdUm;
            case 1:
                return dvdDois;
            case 2:
                return cdUm;
            default:
                return cdDois;
        }
    }
    public static void assistirFilme(Dvd dvd) {
        dvd.legenda(false);
        dvd.legenda(true,"Russo");
        dvd.legenda(false);
    }
}
