package Ejercicios_Tema_3;
import java.util.Scanner;

public class EjercicioAleatorios {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args){

    EjercicioAleatorios.Ejercicio11();

    }

    public static void Ejercicio2(){

        //Los palos
        String palos = " "; //No entiendo por que me sale error, si es que NO le introdusco un valor
        double paloRandom = Math.random()*4;
            int paloEntero= (int)paloRandom + 1;

        switch(paloEntero){

            case 1:
            palos = "picas";
            break;

            case 2:
            palos = "corazones";
            break;

            case 3:
            palos = "diamantes";
            break;

            case 4:
            palos = "tréboles";
            break;

        }

        //La carta

        double cartaValor = Math.random()*13;
            int cartaEntero= (int)cartaValor + 1;

        String carta = String.valueOf(cartaEntero);

        switch(cartaEntero){

            case 1:
            carta = "A";
            break;

            case 11:
            carta = "J";
            break;

            case 12:
            carta = "Q";
            break;

            case 13:
            carta = "K";
            break;

        }

        System.out.print("Carta: " + carta + " " + palos);


    }
    
    public static void Ejercicio5(){

        System.out.print("Ingreso un numero: ");
        int numero = EjercicioAleatorios.entrada.nextInt();

        int Max = 0;
        int Min = 0;
        int Suma = 0;
        int Media = 0;

        for(int i = 0; i<numero ; i++){

            double a = Math.random()*99 +1;
            int b = (int)a + 100;

            System.out.print(b);
            System.out.print(", ");

            if(i == 0){

                Max = b;
                Min = b;

            }else{

                if(b>Max){
                    
                    Max = b;
                }

                if(b<Min){

                    Min = b;
                }

            }

            Suma = Suma +b;
            Media = Suma/numero;

        }

        System.out.println("\n" + "La Media: " + Media);
        System.out.println("La El Maximo: " + Max);
        System.out.println("La El Minimo: " + Min);

    }

    public static void Ejercicio6(){

        double numeroAleatorio = Math.random()*101;
        int numero = (int)numeroAleatorio;

        boolean aciertos = true;
        int intentos = 1;

        System.out.println("\n"+"SE GENERO UN NUMERO ALEATORIO");

        while(aciertos){

            System.out.print(":: Adivina el numero -> ");
            int adivina = EjercicioAleatorios.entrada.nextInt();

            if(adivina == numero){

                System.out.println("¡ACERTASTE!");

                aciertos = false;

            }else{

                if(intentos < 5){

                intentos = intentos + 1;

                System.out.println("::Intentalo de nuevo::");
                aciertos = true;

            }else if(intentos == 5 ){

                System.out.println("PERDISTE");
                aciertos = false;

            }

            }

            }

        }


    public static void Ejercicio7(){

            //TODO:

        System.out.println("------------------------------------------------------------------");
        System.out.println("|    Partidos    |   Apuesta 1   |   Apuesta 2   |   Apuesta 3   |");
        System.out.println("------------------------------------------------------------------");
        System.out.println("|    Partidos    |   Apuesta 1   |   Apuesta 2   |   Apuesta 3   |");
        System.out.println("------------------------------------------------------------------");
        
    }

    public static void Ejercicio9(){

        boolean generador = true;
        int contador = 0;

        while(generador){

            double Aleatoriedad = Math.random()*101;
            int numero = (int)Aleatoriedad;

            contador = contador + 1;

            System.out.print(numero + ", ");

            if(numero == 24){

                System.out.println("\n" + "ENCONTRADO: " + numero);
                System.out.println("NUMEROS GENERADOS: " + contador);

                generador = false;

            }
        }

    }

    public static void Ejercicio11(){

        System.out.println("\n");

        int a = 0,b= 0,c= 0,d= 0,e = 0;
        double nota = 8;

        for(int i = 0; i < 20; i++){

            nota = Math.random()*10 + 0.001;

            if(nota < 5 ){

                System.out.print( nota +" Suspenso, ");
                a = a + 1; //Suspensos

            }else if(nota < 6){

                System.out.print( nota + " Suficiente, ");
                b = b + 1; //Suficientes

            }else if(nota < 7){

                System.out.print( nota + " Bien, ");
                c = c + 1; //Bienes

            }else if(nota < 9){

                System.out.print( nota + " Notable, ");
                d = d + 1; //Notables

            }else if(nota <= 10){

                System.out.print( nota + " Sobresaliente, ");
                e = e + 1; //Sobresalientes
                
            }

        }

        System.out.println("\n");
        System.out.println("Suspensos: " + a);
        System.out.println("Suficientes: " + b);
        System.out.println("Bienes: " + c);
        System.out.println("Notables: " + d);
        System.out.println("SobreSalientes: " + e);



    }

    public static void Ejercicio12(){


        boolean infinito = true;

        while(infinito){

            double a = Math.random()*94 + 1;
            int b = (int)a + 32;
            char c = (char)b;

            System.out.print(c);

        }



    }


}
