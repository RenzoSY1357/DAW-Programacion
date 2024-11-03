package Ejercicios_Tema_3;

import java.util.Scanner;

public class Ejercicio10{

public static double Mega = Math.pow(2,20);

public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("\n");

        

System.out.println("Cantidad de MegaBytes: ");
double MegaBytes = entrada.nextInt();
Math.round(MegaBytes);

Ejercicio10.Convertor(MegaBytes);

entrada.close();

}

public static void Convertor(double Megabytes){

        double Kilo = Math.pow(2,10);

        double MyKiloBytes = (Megabytes*Mega/Kilo);

        
System.out.println("Aqui estan tus Kilobytes: " + MyKiloBytes);

}


}
