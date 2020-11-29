package Exercicis;

import java.util.Scanner;

public class Bucles {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        //Ex.1
        System.out.println("Introduce un numero: ");
        num = sc.nextInt();

        for(int i = 0; i <= num; i++) {

            System.out.println(i);

        }

        //Ex.2
        System.out.println("Introduce un numero: ");
        num = sc.nextInt();

        while(num>0) {

            System.out.println("Introduce numero: ");
            num = sc.nextInt();
        }

        //Ex.3
        System.out.println("Introduce un numero: ");
        num = sc.nextInt();

        while(num != 0) {

            if (num > 0) {

                System.out.println("El numero es positivo");
            } else {

                System.out.println("El numero es negativo");
            }
            System.out.println("Introduce un numero: ");
            num = sc.nextInt();
        }

        //Ex.4
        System.out.println("Introduce un numero: ");
        num = sc.nextInt();

        while(num%2!=0) {

            System.out.println("Introduce numero: ");
            num = sc.nextInt();
        }

        //Ex.5
        int intentos = 0;

        System.out.println("Introduce un numero: ");
        num = sc.nextInt();

        while(num >= 0){

            System.out.println("Introduce numero: ");
            num = sc.nextInt();
            intentos++;
        }

        System.out.println("Numeros introducidos: " + intentos);

        //Ex.6
        int n = 0;
        int suma = 0;

        do{
            System.out.println("Introduce un numero: ");
            n = sc.nextInt();
            suma = suma+n;

        }while(n!=0);
        System.out.println("La suma de todos los numeros introducidos es: " + suma);

        //Ex.7
        int nu = 0;
        int cantidadnum = 0;
        int sum = 0;
        double media = 0;

        do{
            System.out.println("Introduce un numero: ");
            nu = sc.nextInt();
            sum = sum+nu;
            cantidadnum++;
        }while(nu!=0);
        media = sum / cantidadnum;
        System.out.println("La media de los numeros introducidos es:" + media);

        //Ex.9
        int numOculto = 9;
        int intent = 0;
        System.out.println("Introduce un numero: ");
        num = sc.nextInt();
        intent++;
        while (num != numOculto) {
            if (num < numOculto) {
                System.out.println("El numero oculto es mayor que el numero que ha introducido");
                System.out.println("Introduce un numero mayor: ");
                num = sc.nextInt();
                intent++;
            } else {
                System.out.println("El numero oculto es menor que el numero que ha introducido");
                System.out.println("Introduce un numero menor: ");
                num = sc.nextInt();
                intent++;
            }
        }
        System.out.println("Has acertado en " + intent);

        //Ex.10
        boolean negativos = false;

        for(int i = 0; i <= 5; i++) {
            System.out.println("Introduce un numero: ");
            num = sc.nextInt();
            if (num < 0) {
                negativos = true;
            }
        }
        if(negativos = true){
            System.out.println("Entre los numero introducidos hay numeros negativos");
        }else{
            System.out.println("Entre los numeros introducidos no hay ningun numero negativo");
        }

        //Ex.11
        int max = -1;

        for (int i = 0; i <= 6; i++) {
            System.out.println("Introduce un numero: ");
            num = sc.nextInt();
            if(num >= max){
                max = num;
            }
        }
        System.out.println("El numero mayor es: " + max);


        //Ex.12
        int invalidas = 0;
        int suspensos = 0;
        int aprovados = 0;
        int s = 0;
        double med = 0;

        for (int i = 0; i <= 4; i++) {
            System.out.println("Introduce las notas de los alumnos: ");
            num = sc.nextInt();
            if (num < 0) {
                invalidas++;
            }
            if (num > 10) {
                invalidas++;
            }
            if (num < 5 | num == 0) {
                suspensos++;
            }
            if(num == 5|num == 6|num == 7|num == 8|num == 9|num == 10){
                aprovados++;
                s= s+num;
                med = (double)s/aprovados;
            }
        }
        System.out.println("Aprovados: " + aprovados + " La media es de: " + med);
        System.out.println("Suspensos: " + suspensos);
        System.out.println("Notas no validas: " + invalidas);



    }


    }





