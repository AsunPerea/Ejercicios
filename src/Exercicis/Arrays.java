package Exercicis;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args){

        int[] numeros = new int[4];
        Scanner sc = new Scanner(System.in);

        //Ex.1
        //Sin bucle:
        numeros[0] = 5;
        numeros[1] = 4;
        numeros[2] = 9;
        numeros[3] = 7;
        System.out.println(numeros[0] + " " + numeros[1] + " " + numeros[2] + " " + numeros[3]);

        //Con bucle:
        for(int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        //Ex.2
        for(int i = 0; i < numeros.length; i++ ){
            System.out.println("Introduce numero: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println(numeros[0] + " " + numeros[1] + " " + numeros[2] + " " + numeros[3]);

        //Ex.3
        for(int i = 0; i < numeros.length; i++ ){
            System.out.println("Introduce numero: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("Numeros a la inversa");
        for(int i = 3; i >= 0; i-- ){
            System.out.println(numeros[i]);
        }

        //Ex.4
        int suma = 0;

        for(int i = 0; i < numeros.length; i++ ){
            System.out.println("Introduce numero: ");
            numeros[i] = sc.nextInt();
            suma = suma + numeros[i];
        }
        System.out.println(suma);

        //Ex.5
        String[] caracteres = {"Hola","que","tal","estas","?"};
        String frase = caracteres[0] + " " + caracteres[1] + " " + caracteres[2] + " " + caracteres[3];
        System.out.println(frase);

        //Ex.6
        int[] nums = {1, 2, 20, 4};
        String num;
        num = nums[0] + " " + nums[1] + " " + nums[2] + " " + nums[3];
        System.out.println(num);


        //Ex.7
        int[] numeros1 = {1, 2, 20, 4};
        double media = 0;
        double resultado = 0;
        int size = numeros1.length;

        for(int i = 0; i < size; i++){
            media = media + numeros1[i];
            resultado = media / size;
        }
        System.out.println(resultado);

        //Ex.8
        int [] numsA = {3, 4, 1};
        int [] numsB = {2, 7, 5};
        int [] numsC = new int[6];

        for (int i = 0; i < numsA.length; i++) {
            numsC[i * 2] = numsA[i];
            numsC[i * 2 + 1] = numsB[i];
        }
        for (int i = 0; i < numsC.length; i++) {
            System.out.print(numsC[i] + " ");
        }
    }

    }
