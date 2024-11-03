
package Clases;

import java.util.Scanner;


public class Persona {

    // propiedades a NIIVEL DE CLASE SON ACCESIBLES A TODOS LOS MÉTODOS DE ESA CLASE
    public static String nombre1;
    public static String nombre2;
    public static int edad1;
    public static int edad2;
    // Lectura es una clase estatica

    public static void main(String[] args) {
    // en la var. cadena almacena la lectura por consola--> Flujo de datos
    // nombre1, nombre2, edad1, edad2

        System.out.println("\n");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el nombre persona 1: ");
        Persona.nombre1 = entrada.nextLine();
        //nombre1 = entrada.nextline
        // String nombre1 = entrada.nextLine();
        

        System.out.println("La edad de persona 1:");
        Persona.edad1 = Integer.parseInt(entrada.nextLine());
        // int edad1 = Integer.parseInt(entrada.nextLine());

        System.out.println(" Introduce el Nombre persona 2");
        Persona.nombre2 = entrada.nextLine();
        // String nombre2 = entrada.nextLine();

        System.out.println("La edad de persona 2: ");
        Persona.edad2 = Integer.parseInt(entrada.nextLine());
        // int edad2 = Integer.parseInt(entrada.nextLine());


        System.out.println("Persona 1 se llama " + nombre1);
        System.out.println("la edad de " + nombre1 + " es " + edad1);
        
        System.out.println("Persona 2 se llama " + nombre2);
        System.out.println("la edad de " + nombre2 + "es " + edad2 );
        
        Persona.quienEsMayor(edad2, nombre2);
        
        entrada.close();

    }

    public static void quienEsMayor(int edad2, String nombre2){

        if (Persona.edad1 > edad2){

            System.out.println(Persona.nombre1 + " es mayor que " + nombre2);

        } else if (Persona.edad1 == edad2) {
            System.out.println(Persona.nombre1 + " tiene la misma edad que " + nombre2);
            
        } else{
            System.out.println(nombre2 + " es mayor que " + Persona.nombre1);
        }
    }
    

    

}
