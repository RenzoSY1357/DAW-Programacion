package Ejercicios_Tema_3;

import java.util.Scanner;

public class Ejercicio27 {

    public static Scanner entrada =  new Scanner(System.in);

public static String tarta;
public static String sabor;
public static int precio;

public static String nata;
public static double precioNata = 2.50;

public static String nombre;
public static String eleccion;
public static double precioNombrePersonalizado = 2.50;

public static double Total;


public static void main(String[] args) {
    
Ejercicio27.Menu();

}

public static void Menu(){

System.out.print("\n");

    Ejercicio27.EleccionTarta();

    Ejercicio27.Nata();

    Ejercicio27.Nombre();

Ejercicio27.Salida();

}

public static void EleccionTarta(){

    boolean continuar1 = true;

    System.out.println("Que tarta quiere?");

while(continuar1){

    System.out.print("Puede elejir entre manzana, fresa y chocolate: ");
    tarta = Ejercicio27.entrada.next().toLowerCase();

    switch(tarta){

        case "manzana":

        nombre = "de Manzana";
        precio = 18;

            continuar1 = false;
            break;
        
        case "fresa":

        nombre = "de Fresa";
        precio = 16;

            continuar1 = false;
            break;

        case "chocolate":
        
        System.out.print("¿De qué sabor negro o blanco?: ");
        sabor = Ejercicio27.entrada.next().toLowerCase();

            if(sabor.equals("negro")){

                nombre = "de Chocolate negro";
                precio = 14;

                    continuar1 = false;
                    break;

            }else if(sabor.equals("blanco")){

                nombre = "de Chocolate blanco";
                precio = 15;

                    continuar1 = false;
                    break;

            } else {

                System.out.println("Ese no es un sabor, por favor elija de nuevo");

                System.out.print("\n");

                continuar1 = true;
                break;
            }


    }
}

    Total = precio;

}

public static void Nata(){

    boolean continuar2 = true;


    while(continuar2){

    System.out.print("Quiere nata? (si/no): ");
    nata = Ejercicio27.entrada.next().toLowerCase();

    switch(nata){

        case "si":

        continuar2 = false;
        break;

        case "no":

        continuar2 = false;
        break;

        default:

        System.out.print("\n");

        System.out.println("Por favor indique un valor valido:");

        continuar2 = true;
        break;

    }


    }

}

public static void Nombre(){

boolean continuar3 = true;

while(continuar3){

    System.out.print("Quiere ponerle nombre? (si/no): ");
    eleccion = Ejercicio27.entrada.next().toLowerCase();

    switch(eleccion){

        case "si":
        
                System.out.print("\n");
    
            System.out.println("Introdusca el nombre de la tarta por favor:");
            nombre = Ejercicio27.entrada.next();

            continuar3 = false;
            break;
        

        case "no":

            continuar3 = false;
            break;

        default:

                System.out.print("\n");

            System.out.println("Por favor indique un valor valido:");

            continuar3 = true;
            break;

    }

    


}

}

public static void Salida(){

        System.out.print("\n");

    System.out.println("Tarta " + nombre + ": " + precio);
    
    if(nata.equals("si")){

        System.out.println("Con nata: " + precioNata);

        Total = Total + precioNata;

    }

    if(eleccion.equals("si")){

        System.out.println("Con nombre: " + precioNombrePersonalizado);

        Total = Total + precioNombrePersonalizado;
        
    }

    System.out.println("Total: " + Total);


}


}
