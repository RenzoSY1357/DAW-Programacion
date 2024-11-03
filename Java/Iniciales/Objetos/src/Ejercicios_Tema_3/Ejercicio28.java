package Ejercicios_Tema_3;

import java.util.Scanner;

public class Ejercicio28 {

    public static Scanner entrada = new Scanner(System.in);

public static String Jugador1;
public static int a;

public static String Jugador2;
public static int b;

public static void main(String[] args){

    Ejercicio28.Menu();

}

public static void Menu(){

    System.out.print("\n");

System.out.println("    - PIEDRA, PAPEL Y TIJERAS -");

Ejercicio28.entrada();

    System.out.print("\n");

Ejercicio28.salida();

}


public static void entrada(){

    System.out.print("\n");

Ejercicio28.EleccionJugador1();

    System.out.print("\n");

Ejercicio28.EleccionJugador2();


}

public static void EleccionJugador1(){

    boolean continuar1 = true;

    while(continuar1){

        System.out.print("Turno del jugador 1: (introduzca piedra, papel o tijera): ");
        Jugador1 = Ejercicio28.entrada.next().toLowerCase();

    switch(Jugador1){

        case "piedra":
    
        a = 1;

            continuar1 = false;
            break;

        case "papel":
    
        a = 2;

            continuar1 = false;
            break;

        case "tijera":
    
        a = 3;

            continuar1 = false;
            break;

        default:
    
            System.out.print("\n");

        System.out.println("Elija un valor valido: ");

            continuar1 = true;
            break;
    
    
    }

    }

}

public static void EleccionJugador2(){

    boolean continuar2 = true;

    while(continuar2){

        System.out.print("Turno del jugador 2: (introduzca piedra, papel o tijera): ");
        Jugador2 = Ejercicio28.entrada.next().toLowerCase();

    switch(Jugador2){

        case "piedra":
    
        b = 1;

            continuar2 = false;
            break;

        case "papel":
    
        b = 2;

            continuar2 = false;
            break;

        case "tijera":
    
        b = 3;

            continuar2 = false;
            break;

        default:
    
            System.out.print("\n");

        System.out.println("Elija un valor valido: ");

            continuar2 = true;
            break;
    
    
    }

    }


}

public static void salida(){

  if( a == b ){

    System.out.println("Empate");

  }else if(a == 1 & b == 3){

    System.out.println("Gana jugador 1");

  }else if(a == 3  & b == 2){

    System.out.println("Gana jugador 1");

  }else if(a == 2 & b == 1){

    System.out.println("Gana jugador 1");

  }else if(b == 1 & a == 3){

    System.out.println("Gana jugador 2");

  }else if(b == 3 & a == 2){

    System.out.println("Gana jugador 2");

  }else if(b == 2 & a == 1){

    System.out.println("Gana jugador 2");

  }

}
    
}
