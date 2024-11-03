package Ejercicios_Tema_3;

import java.util.Scanner;

public class Ejercicio4y8 {
 
//Variable a nivel de clase, se le llama propiedad de la clase.
//Variable a nivel de metodo, se le valor.

    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);

       
        System.out.println("3.4 Ejercicios \n");

        //EJERCICIO 8

        int euro_por_hora = 12;

        System.out.println("Numero de horas promedio trabajadas:");

        int Horas = sc.nextInt();

        System.out.print("\nSalario base total semanal = " + Horas*5*euro_por_hora);

        sc.close();

    }

}
