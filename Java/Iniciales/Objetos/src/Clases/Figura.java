package Clases;

import java.util.Scanner;

public class Figura {

    public static double AreaRectangulo;
    public static double AreaTriangulo;
    public static String Elegir;

public static void main(String[] args){

    Scanner entrada = new Scanner(System.in);
    System.out.println("\n");

System.out.println("Que area deseas saber?: ");
String Elegir = entrada.nextLine();

System.out.println("Dame la base: ");
int base = entrada.nextInt();

System.out.println("Dame la altura: ");
int altura = entrada.nextInt();

    double resultado = Figura.Eleccion(Elegir, base, altura);

System.out.println("El resultado del área es: " + resultado);

if(!Elegir.equals("Triangulo")){

}

entrada.close();

}

public static double Eleccion(String Entrada, double base, double altura){

    if(Entrada.equals("Triangulo")){

        return base*altura;

    } else{

        if(Entrada.equals("Rectangulo")){

            return (base*altura)/2;

        } else{


            return 0;

        }

        }


}


    
}
