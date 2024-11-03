package Ejercicios_Tema_3;

import java.util.Scanner;

public class Ejercicio16 {

    public static int numero;
    public static int primo;

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args){

    System.out.print("Introduce el número: ");
    numero = Ejercicio15.entrada.nextInt();

        Ejercicio16.primo(numero);

    }


    public static void primo(int numero){

        //Todos los numeros primos que hay dentro de la variable entrada

        int Numeroprimo = 1;
        boolean continuar = true;
        
        while(continuar){

        for(int i = 0; i <= numero; i++){

            Numeroprimo = Numeroprimo + 1;

            if(Numeroprimo%Numeroprimo == 0 && Numeroprimo/(Numeroprimo-1) == 1){

                primo = i;

            System.out.println("Numeros primos dentro de " + numero + ": " + primo );
            
        }

        }

        System.out.println(numero + " es numero primo");

        continuar = false;
    }
}
    
}
