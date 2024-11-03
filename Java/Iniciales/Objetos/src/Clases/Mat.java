package Clases;
import java.util.Scanner;

public class Mat {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args){

        Mat.aleatorios();

    }

    public static void pruebas1(){

            double valor = Math.sin(90); //Seno
            System.out.println(valor);
            System.out.println(Math.toRadians(valor)); //De decimal a radian
            System.out.println(Math.sqrt(64)); // Le saca raiz cuadrada
            System.out.println(Math.pow(3, 2));//3, lo eleva al cuadrado
            System.out.println(Math.abs(-10));//Devuelve valor absoluto
            System.out.println(Math.round(10.4)); //Redondear
            System.out.println(Math.max(23,25)); //Imprime el mayor numero
            Mat.aleatorios(); // Numero aleatorio entre 0 y 1, nunca va a cojer 0, y nunca va a cojer 1
    }

    public static void aleatorios(){

        double numero = 0;
        //numeros entre 0 y 6

        for (int i=0; i<5; i++){
        numero = Math.random()*6;
        //numeros entre 0 y 6
        System.out.println(numero+ "->");
        System.out.print(Math.round(numero)+"-"); //Mathround(), redondea el numero
        System.out.print((int)numero);//Le saca el entero al numero
        System.out.println();


        
        }
    }

}
