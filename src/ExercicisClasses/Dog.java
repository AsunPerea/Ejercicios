package ExercicisClasses;

public class Dog {
    private String nom;
    private int edad;
    private String raza;
    private boolean pedigree;
    private int numVacunas;
    private String UltimaVacuna;

    public Dog() {}

    public Dog (String nom, int edad, String raza, boolean pedigree, int numVacunas, String UltimaVacuna) {
        this.nom = nom;
        this.edad = edad;
        this.raza = raza;
        this.pedigree = pedigree;
        this.numVacunas = numVacunas;
        this.UltimaVacuna = UltimaVacuna;
    }

    public String getNom() {
        return nom;
    }

    public int getEdad() {
        return edad;
    }

    public String getRaza() {
        return raza;
    }

    public boolean getPedigree() {
        return pedigree;
    }

    public int getNumVacunas() {
        return numVacunas;
    }

    public String getUltimaVacuna() {
        return UltimaVacuna;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAge(int edad) {
        this.edad = edad;
    }

    public void setBreed(String raza) {
        this.raza = raza;
    }

    public void setPedigree(boolean pedigree) {
        this.pedigree = pedigree;
    }

    public void setNumVacunas(int numVacunas) {
        this.numVacunas = numVacunas;
    }

    public void setUltimaVacuna(String UltimaVacuna) {
        this.UltimaVacuna = UltimaVacuna;
    }

    public void display() {
        System.out.println("Nombre: " + this.nom);
        System.out.println("Edad: " + this.edad);
        System.out.println("Raza: " + this.raza);
        System.out.println("Pedigree: " + this.pedigree);
        System.out.println("Numero de Vacunas: " + this.numVacunas);
        System.out.println("Ultima Vacuna: " + this.UltimaVacuna);
    }

        public void NuevaVacuna(String UltimaVacuna) {
        this.numVacunas++;
        this.UltimaVacuna = UltimaVacuna;
    }
}

