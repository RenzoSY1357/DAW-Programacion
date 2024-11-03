package Ejercicios_Tema_3;

import java.util.Scanner;

public class Ejercicio9 {

    public static final double pi = 3.1416;


public static void main(String[] args){


        Scanner entrada = new Scanner(System.in);

        System.out.println("\n");


System.out.println("Valor del radio: ");
int radio = entrada.nextInt();

System.out.println("Valor de la altura");
int altura = entrada.nextInt();

Ejercicio9.proceso(radio,altura);

entrada.close();

}

public static void proceso( int radio, int altura){

    double radiocuadrado = Math.pow(radio, 2);

    double formula = (pi*radiocuadrado*altura)/3;

    System.out.println("El volumen del cono es: " + formula);

}


}