package Taller;

public class Pelicula {

    private String titol;
    private int duracio;
    private String director;

    public Pelicula(String titol, int duracio, String director){

        this.titol = titol;
        this.duracio = duracio;
        this.director = director;
    }

    public String getTitol(){

        return titol;
    }

    public int getDuracio(){

        return duracio;
    }

}
