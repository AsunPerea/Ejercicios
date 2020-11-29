package Exercicis;

import java.text.DecimalFormat;

public class Variables {

    public static void main(String[] args) {
        //Ex 1
        //A
        System.out.println("Hola que tal");
        System.out.println("------------------------");

        //B
        System.out.println("Hola");
        System.out.println("que");
        System.out.println("tal");

        //C
        System.out.println("------------------------");
        System.out.println("Hola\nque\ntal");

        System.out.println("------------------------");


        //Ex 2
        String nom = "Tim";
        System.out.println("Hola, el meu nom es" + " " + nom);

        System.out.println("------------------------");


        //Ex 3
        int a = 4;
        int b = 6;
        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        int division = a / b;
        System.out.println("a+b = " + suma);
        System.out.println("a-b= " + resta);
        System.out.println("a*b= " + multiplicacion);
        System.out.println("a/b= " + division);

        System.out.println("------------------------");

        //Ex 4
        int c = (a * (b + 2) * 10);
        System.out.println("El resultat es:" + c);

        System.out.println("------------------------");

        //Ex 5
        int grados = 30;
        double f = (double) 9 / 5 * grados + 32;
        System.out.println(c + " Son " + f + " farentheints");

        //Ex 6
        double euros = 5;
        DecimalFormat df = new DecimalFormat("#.00");

        double dolares = (euros * 1.18);

        System.out.println(euros + " euros son " + df.format(dolares) + " dolares");


        //Ex 7
        int A = 5;
        int B = 10;
        int AUX;

        AUX = A;
        A = B;
        B = AUX;
        System.out.println("A = " + A + " i" + " B = " + B);

        /* Ex 8 */

        int o = 4;
        int p = 6;
        int q = 2;

        double x = (p ^ 2 - 442) / 24;

        System.out.println(x);


        //Ex 9
        double altura = 6.05;
        double base = 10;

        double area = base * altura;
        double perimetro = 2 * (altura + base);

        System.out.println("El area del rectangulo es: " + area + "\nEl perimetro del rectangulo es: " + perimetro);


        //Ex 10
        final double pi = Math.PI;
        double alt = 10;
        double diametro = 2.5;

        double volumen = pi * diametro * diametro * alt;

        System.out.println("Un cilindro con una altura de " + altura + " cm i un diametro de " +
                (diametro + diametro) + " cm tiene un volumen de " + volumen + " cm3");

    }

}
