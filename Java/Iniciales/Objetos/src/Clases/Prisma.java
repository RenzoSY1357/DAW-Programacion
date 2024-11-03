package Clases;

import java.util.Scanner;


public class Prisma {

    public static void main(String [] args){


        System.out.println("\n");
        Scanner entrada = new Scanner(System.in);

    System.out.println("---------- BIENVENIDO AL CALCULO DEL PRISMA TRIANGULAR ---------" + "\n");

    System.out.println("Dame la base de un triangulo:");
    int BaseTriangulo = entrada.nextInt();

    System.out.println("Ahora dame su altura altura:");
    int AlturaTriangulo = entrada.nextInt();

    System.out.println("Dame el lado de un cuadrado:");
    int LadoCuadrado = entrada.nextInt();

    Prisma.PrismaTriangular(BaseTriangulo, AlturaTriangulo, LadoCuadrado);
    
    entrada.close();

    }

    public static void PrismaTriangular( int BaseTriangulo, int AlturaTriangulo, int LadoCuadrado ){

        int resultado = (BaseTriangulo*AlturaTriangulo*3) + (LadoCuadrado*LadoCuadrado);

        System.out.println("El area del prisma triangular es: " + resultado );

    }
    


}
