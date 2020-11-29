package Taller;

public class Cinema {

    private String nom;
    private int numSalas;
    private Pelicula peliculas[];

    public Cinema(){

    }

    public void peliculaMesLlarga(){

        int mayor = 0;
        Pelicula pelicula = new Pelicula("", 0, "");

        for(int i = 0; i < peliculas.length; i++){


            if(peliculas[i].getDuracio() > mayor) {

                mayor = this.peliculas[i].getDuracio();
                pelicula = this.peliculas[i];

            }

        }

        System.out.println("La pelicula mayor es: " + mayor);


    }


}
