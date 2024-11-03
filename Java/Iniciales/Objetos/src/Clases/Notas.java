package Clases;

import java.util.Scanner;

// pedir las notas de un alumno

public class Notas {

public static Scanner entrada = new Scanner(System.in);

public static void main(String[] args){

System.out.println("\n");

System.out.println("-------------- NOTAS ----------------------" + "\n");

    System.out.println("Nombre y apellidos del alumno: ");
    String Nombre = Notas.entrada.nextLine();

System.out.println("\n" + "-------------------------------------------");

    Notas.Evaluacion();

}

public static void Evaluacion(){

boolean continuar = true;
char respuesta;

while (continuar){

    Notas.pintarMenu();

System.out.println("Desas añadir otra materia S/N?");
respuesta = Notas.entrada.next().toUpperCase().charAt(0);

if(respuesta != 'S'){
  continuar = false;
  entrada.close();
}

}

}


public static void pintarMenu(){

    System.out.print("\n");

        System.out.print("Modulo: ");
        String Modulo = Notas.entrada.next();

        System.out.print("Puntaje del alumno en modulo: ");
        double Nota = Notas.entrada.nextDouble();

    System.out.print("Su nota es: ");
    
    if((Nota < 0) || ((Nota >= 0) && (Nota < 5))){

        System.out.println("Suspenso" + "\n");
    
        }else{
    
            if((Nota >= 5) && (Nota < 6)){
    
                System.out.println("Aprobado" + "\n");
    
    
            }else{
    
            if((Nota >= 6) && (Nota < 7)){
    
                System.out.println("Bien" + "\n");
    
            }else{
    
                if((Nota >= 7) && (Nota < 9)){
    
                    System.out.println("Notable" + "\n");
    
                }else{
    
                    if((Nota >= 9) && (Nota <= 10)){
    
                    System.out.println("sobresaliente" + "\n");
    
                    }else{
    
                        if(Nota > 10){
    
                            System.out.println("Matricula" + "\n");
    
                        }
    
                    }
    
            }
    
    
            }
    
        }


}


}}


