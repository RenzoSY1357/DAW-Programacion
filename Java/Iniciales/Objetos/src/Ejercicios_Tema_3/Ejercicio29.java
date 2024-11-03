package Ejercicios_Tema_3;

import java.util.Scanner;

public class Ejercicio29 {
    
    public static Scanner entrada = new Scanner(System.in);

    public static String Desayuno;
    public static double precioDesayuno;

    public static String EleccionPitufo;

    public static String Bebida;
    public static double precioBebida;

    public static double Total;


    public static void main(String[] args){

        Ejercicio29.menu();

    }

    public static void menu(){

        Ejercicio29.entrada();

        Ejercicio29.salida();

    }

    public static void entrada(){

        boolean continuar1 = true;

        System.out.print("\n");

        while(continuar1){

        System.out.print("Qué ha tomado de comer? (palmera, donut o pitufo): ");
        Desayuno = Ejercicio29.entrada.next();


        switch(Desayuno){

            case "palmera":

                precioDesayuno = 1.40;

                continuar1 = false;
                break;

            case "donut":

                precioDesayuno = 1;

                continuar1 = false;
                break;

            case "pitufo":

            System.out.print("Era con aceite o tortilla?: ");
            EleccionPitufo = Ejercicio29.entrada.next();

            if(EleccionPitufo.equals("aceite")){

                precioDesayuno = 1.20;

                continuar1 = false;
                break;

            } else if(EleccionPitufo.equals("tortilla")){

                precioDesayuno = 1.60;

                continuar1 = false;
                break;

            } else{

                System.out.print("Introduzca un valor valido por favor:");

                System.out.print("\n");
    
                continuar1 = true;
                break; 
                
            }


            default:

            System.out.print("Introduzca un valor valido por favor:");

            System.out.print("\n");

            continuar1 = true;
            break;

        }


    }

    Ejercicio29.EleccionBebida();

    }

    public static void EleccionBebida(){

        boolean continuar2 = true;

        while(continuar2){
        
        System.out.print("Qué bebida tomo? (zumo o cafe):");
        Bebida = Ejercicio29.entrada.next().toLowerCase();

        System.out.print("\n");

        switch(Bebida){

            case "zumo":

            precioBebida = 1.50;

            continuar2 = false;
            break;

            case "cafe":

            precioBebida = 1.20;

            continuar2 = false;
            break;

            default:

            System.out.print("Introduzca un valor valido por favor:");

            System.out.print("\n");

            continuar2 = true;
            break;

        }

        }

    }

    public static void salida(){

        Total = precioDesayuno + precioBebida;

        System.out.print("\n");

        System.out.print(Desayuno + ": " + precioDesayuno);
        
        System.out.print("\n");

        System.out.print(Bebida + ": " + precioBebida);

        System.out.print("\n");

        System.out.print("Total desayuno: " + Total);
    }

}
