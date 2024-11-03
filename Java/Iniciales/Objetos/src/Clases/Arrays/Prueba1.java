package Clases.Arrays;

import java.util.Scanner;

public class Prueba1 {

    public static Scanner entrada = new Scanner(System.in);

    //LOS ARRAYS SON MONOMORFICOS # Una forma (Son del mismo tipo) Aqui, ejem: tipo int.
    
    //Constantes: escritas en class, fuera de los metodos
    static int ALUMNOS = 5; // las constantes, se escriben en mayuscula.
    static int ASIGNATURAS = 4;
    static int TRIMESTRES = 3;
    static String[] alumnos = new String[ALUMNOS]; //Imprime un Array de alumnos

    public static void main(String[] args){

    
    }

    //EXPLICACION
    public static void explicacion(){

    //Almacenar un array de notas con (enteros) de 10 alumnos
    int nota = 9; //v. monovaluada
    // new int: reserva 10 posicicones enteras estaticas de memoria ram.
    //entenciendo que int = 2 bytes, entonces, notas me ocupa 20 byes.

    // Long: 8 bytes, boolean: 1 byte, float: 4 bytes, double: 8 bytes.
    int [] notas = new int[10]; //v.multivaluada
    //notas [0] ... notas[9]

    //inicializando los valores de notas
    int[] notas1 = {2,5,7,1,6,8,9,10,4};
        //notas es el array, y notas1 son los valores dentro del array.

    /* De forma individual:

     notas[0] = 3;
     notas[0] = 3;
     notas[0] = 3;
     notas[0] = 3;
     ...

     */

    int [][] notas2 = new int[4][5]; // [5 filas] [6 columnas] //Cuenta al 0, recuerda
    notas2[0][0] = 3;
    //...
    notas2[0][4] = 7;
    notas2[1][0] = 6;
    //...
    notas2[1][4] = 7;
    //...
    notas2[3][0] = 3;
    notas2[3][4] = 7;

    //array 3D Tridimensional (cubo) (alumnos/asignaturas/trimestres)
    int[][][] notas3 = new int[4][5][2]; // [5 filas] [6 columnas] [3 de Profundidad]
    notas3[2][1][2] = 5; //El alumno 3, en la asignatura 2, en el trimestre 3, a sacado un 5.

    }


    //EJEMPLO 1:
    public static void notasTeclado(){

        int[] notas = new int[5];//0 al 4, indice's del array (5 espacios)

        System.out.println("----------- Lectura de Notas ---------- ");

        for (int i= 0; i<5; i++){//0 al 5 indice del for --- debe coincidir con el indice del array.

            System.out.println("Introduce la nota i " + i);
            notas [i] = Prueba1.entrada.nextInt();

        }

        System.out.println("----- Impresion de Nota -----");

        for(int i = 0; i<5; i++){

            System.out.println("La nota " + i + " es " + notas[i]);

        }


    }


    //EJEMPLO 2:
    public static void generarNotas(){

        double notas[] = new double[ALUMNOS];
        double temp = 0.0;
        double max = 0;
        double min =0;
        double media = 0;

        System.out.println("----------- Generacion de Notas ---------- ");
        for (int i=0; i<ALUMNOS; i++){

            //Genera variable de notas, entre 0 a 10, con 2 decimales
            temp = Math.random()*10;
            temp = Math.round(temp*100.0)/100.0;
            notas[i] = temp;

        }

        System.out.println("----- Impresion de Nota -----");
        for(int i = 0; i<ALUMNOS; i++){

            System.out.println("La nota " + i + " es " + notas[i]);

        }

        System.out.println("---- Informe de Resultado -----");

        max = notas[0];
        min = notas[0];

        for (int i=1; 1<ALUMNOS; i++){

            media = media + notas[i];

            if (notas[i]>max){

                max = notas[i];

            }

            if (notas[i]<min){

                min = notas[i];

            }


        }

        }
    }




