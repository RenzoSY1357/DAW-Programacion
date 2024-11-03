package Ejercicios_Tema_3;

import java.util.Scanner;


public class Ejercicio15 {
    
    public static Scanner entrada = new Scanner(System.in);

    public static double a;

    public static void main(String[] args){

        int b;

        System.out.print("\n");

        System.out.print("Introduce la base del número: ");
        a = Ejercicio15.entrada.nextDouble();

        System.out.print("Introduce su exponente: ");
        b = Ejercicio15.entrada.nextInt();

        Ejercicio15.Potencia(a,b);

        System.out.print("\n");


    }

    public static double Potencia(double a, int b){

        double c;

        c = a;

        System.out.println("Multiplicador: "+ c);

        for(int i = 1; i < b; i++){

            a = a*c + i*0;

            if(i<=b){
            System.out.println("Multiplicador: "+ c);
            }

            }

            System.out.println("Resultado: "+ a);

        return a;

}

}
