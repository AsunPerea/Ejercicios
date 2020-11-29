package ExercicisClasses;

import java.util.Scanner;

public class Persona {

    private String nom;
    private int edad;
    private int id;
    private String genero;
    private int telf;

    public Persona (String nom, int edad, int id, String genero, int telf) {
        this.nom = nom;
        this.edad = edad;
        this.id = id;
        this.genero = genero;
        this.telf = telf;
    }

    public Persona() {}


    public String getNom() {
        return this.nom;
    }

    public int getEdad() {
        return this.edad;
    }

    public int getId() {
        return this.id;
    }

    public String getGenero() {
        return this.genero;
    }

    public int getTelf() {
        return this.telf;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setTelf(int telf) {
        this.telf = telf;
    }


    public void display() {
        System.out.println("Nombre: " + this.nom);
        System.out.println("Edad: " + this.edad);
        System.out.println("Id: " + this.id);
        System.out.println("Genero: " + this.genero);
        System.out.println("Telefono: " + this.telf);
    }


    public static void main(String[] args) {

        // Crear persona y mostrarla
        Persona p1 = new Persona("Pepe", 50, 0001, "Maculino", 665858784);
        p1.display();

        // Pedir por teclado los datos de la persona
        Persona p2 = new Persona();
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce nombre: ");
        p2.setNom(sc.nextLine());

        System.out.print("Introduce edad: ");
        p2.setEdad(sc.nextInt());

        System.out.print("Introduce Id: ");
        p2.setId(sc.nextInt());

        System.out.print("Introduce Genero: ");
        p2.setGenero(sc.nextLine());

        System.out.print("Introduce Telefono: ");
        p2.setTelf(sc.nextInt());

        p2.display();
    }
}


