package Exercicis;

import java.util.Scanner;

public class Condicionales {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        //Ex.1
        System.out.println("Introduce un numero: ");
        num = sc.nextInt();

        if(num < 0){

            System.out.println("El numero introducido es un numero negativo");

        }else{
            System.out.println("El numero introducido es un numero positivo");
        }

        //Ex.2
        System.out.println("Introduce un numero: ");
        num = sc.nextInt();

        if(num % 2 == 0){

            System.out.println(num + " es multiple de 2");

        }else{
            System.out.println(num + " no es multiple de 2");
        }

        //Ex.3
        int num1;
        int num2;

        System.out.println("Introduce un numero: ");
        num1 = sc.nextInt();
        System.out.println("Introduce otro numero: ");
        num2 = sc.nextInt();

        if(num1 > num2){

            System.out.println(num1 + " es mayor que " + num2);

        }else if(num1 < num2){

            System.out.println(num1 + " es menor que " + num2);
        }else{

            System.out.println(num1 + " y " + num2 + " Son iguales");
        }

        //Ex.4
        //A
        System.out.println("Intoduce un numero: ");
        num = sc.nextInt();

        if(num == 1){

            System.out.println("Lunes");

        }else if(num == 2){

            System.out.println("Martes");

        }else if(num == 3){

            System.out.println("Miercoles");

        }else if(num == 4){

            System.out.println("Jueves");

        }else if(num == 5){

            System.out.println("Viernes");

        }else if(num == 6){

            System.out.println("Sabado");

        }else if(num == 7){

            System.out.println("Domingo");

        }else{

            System.out.println("Numero incorrecto");

        }

        //B
        System.out.println("Intoduce un numero: ");
        num = sc.nextInt();

        switch(num) {

            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Numero incorrecto");
                break;
        }

        //Ex.5
        int hora = 16;

        if(hora >= 8 && hora < 12){

            System.out.println("Por la mañana");

        }else if(hora >= 12 && hora < 17){

            System.out.println("Medio dia");

        }else if(hora >= 17 && hora < 20){

            System.out.println("Por la tarde");

        }else if(hora >= 20 && hora < 23){

            System.out.println("Por la noche");

        }else{

            System.out.println("Hora incorrecta");

        }

        //Ex.6
        int nota;
        System.out.println("Introduce un numero entre 0 y 10: ");
        nota = sc.nextInt();

        if(nota >= 0 && nota <= 4){

            System.out.println("Insuficiente");

        }else if(nota == 5){

            System.out.println("Suficiente");

        }else if(nota == 6){

            System.out.println("Bien");

        }else if(nota > 6 && nota < 9){

            System.out.println("Notable");

        }else if(nota >8 && nota < 11){

            System.out.println("Excelente");

        }else{

            System.out.println("Nota incorrecta");

        }

        //Ex.7
        int dia;
        int mes;
        int año;
        boolean correcto = false;
        System.out.println("Introduce dia: ");
        dia = sc.nextInt();
        System.out.println("Introduce mes: ");
        mes = sc.nextInt();
        System.out.println("Introdece año: ");
        año = sc.nextInt();

        if(dia >= 1 && dia < 30){
            if(mes >= 1 && mes < 12){
                if(año >= 1 && año < 2020){

                    correcto = true;

                }
            }
        }

        if (correcto) {

            System.out.println("Fecha correcta");

        }else{

            System.out.println("Fecha incorrecta");

        }

        //Ex.8
        boolean c = false;

        System.out.print("Introdueix el dia: ");
        dia = sc.nextInt();
        System.out.print("Introdueix el mes: ");
        mes = sc.nextInt();
        System.out.print("Introdueix l'any: ");
        año = sc.nextInt();

        if (año >= 1 && año <= 2020) {
            switch (mes) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (dia >= 1 && dia <=31) {
                        c = true;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (dia >= 1 && dia <= 30) {
                        c = true;
                    }
                    break;
                case 2:
                    if (dia >= 1 && dia <= 28) {
                        c = true;
                    }
                default:
                    break;
            }
        }
        if (c) {
            System.out.println("La data introduida és correcta");
        } else {
            System.out.println("La data introduica és incorrecta");
        }

        //Ex.9
        int numA;
        int numB;
        int numC;

        System.out.print("Introdueix el primer número: ");
        numA = sc.nextInt();
        System.out.print("Introdueix el segon número: ");
        numB = sc.nextInt();
        System.out.print("Introdueix el tercer número: ");
        numC = sc.nextInt();

        if (numA >= numB && numA >= numC) {
            if(numB >= numC) {
                System.out.println(numA + " " + numB + " " + numC);
            }
            else {
                System.out.println(numA + " " + numC + " " + numB);
            }
        } else if (numB >= numA && numB >= numC) {
            if (numA >= numC) {
                System.out.println(numB + " " + numA + " " + numC);
            } else {
                System.out.println(numB + " " + numC + " " + numA);
            }
        } else if (numC >= numA && numC >= numB) {
            if (numA >= numB) {
                System.out.println(numC + " " + numA + " " + numB);
            } else {
                System.out.println(numC + " " + numB + " " + numA);
            }
        }

        //Ex.10
        int edad;

        System.out.println("Introduce una edad: ");
        edad = sc.nextInt();

        if(edad >= 18){

            System.out.println("Es mayor de edad");

        }else if(edad < 18){

            System.out.println("Es menor de edad");

        }else{

            System.out.println("La edad introducida es incorrecta");

        }


    }
}

