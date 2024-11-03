package Clases;

import java.util.Scanner;

public class Clase2{

    public static void main(String[] args) throws Exception{
        
      System.out.println("\n");

      //CLASE 2
        
        //En la var. cadena almacena la lectura por consola

        /*
          nextline se pone a meter caracteres por consola hasta que le de a la siguiente linea, y todo lo guarda en la variable nombre
          sc, es la consola de datos.dasd

          "meter caracteres por consola", quiere decir escribir.
        */
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        
        System.out.println("Introduce tu apellido: ");
        String Apellido = sc.nextLine();

        System.out.println("Introduce tu edad: ");

        int Edad = Integer.parseInt(sc.nextLine());
        //"Integer" es una clase, al igual que la clase "String"

        // Escritura por teclado, es un flujo de datos, cual acaba cuando se preciona INTRO.

      System.out.println("Te llamas "+ nombre + ", apellido es " + Apellido + " y tu edad es " + Edad + " años");
      
      Clase2.esMayor(Edad); // Invocando la clase "CLase2" de un metodo
      Clase2.FechaNacimiento(Edad);
      
      sc.close();

    }

    public static void esMayor(int edad) {
      //medoto estático de clase Clase2 para saber si es o no mayor de edad.
      /*
      Si no se pusiera "static", seria una clase normal,
        - poner static significa que todos sus metodos y propiedades son staticos.
        - clase "estatica" significa que no se pueden crear objetos.
        */

      // void (resultado del metodo) : significa que no devuelve nada.

      //De las clases normales se crean objetos del operador new

      if (edad >= 18){

        System.out.println("Con la edad de " + edad + " años eres Mayor de edad" );
    }else{

        System.out.println("Con la edad de " + edad + " años eres Menor de edad");
      }

      }

      public static void FechaNacimiento(int edad) {

          int anio = 2024 - edad;

          System.out.println("Naciste en el anio " + anio);
    
      }

      

    }
  
  
  
  
  
  
  
  
  
  

  