package Ejercicios_Tema_3;

import java.util.Scanner;

public class Ejercicio26Cine {
    
    public static Scanner entrada = new Scanner(System.in);

public static int Ticket = 8;
public static int TicketDoble = 11;
public static String euro = "\u20ac";

public static String entradas;
public static String Dia;

public static float Total;
public static float descuento;
public static float Cobro;


public static void main(String[] args){

    Ejercicio26Cine.MenuEntrada();
    entrada.close();

}

public static void MenuEntrada(){

    System.out.println("\n");

System.out.println("************************************************************************");

System.out.println("                    - Venta de entradas CineCampa -" + "\n");

Ejercicio26Cine.DiaSem();

System.out.print("Número de entradas: ");
entradas = Ejercicio26Cine.entrada.next();

Ejercicio26Cine.TarjetaCine();


System.out.println("************************************************************************");

Ejercicio26Cine.MenuSalida();

}


public static void MenuSalida(){

System.out.println("Aquí tiene sus entradas. Gracias por su compra." + "\n");

Ejercicio26Cine.NumEntradas(entradas);

Cobro = Total - (descuento*Total);

System.out.println("Total                       " + Total + " " + euro);
System.out.println("Descuento                   " + (descuento*100) + "%" + " " + euro);
System.out.println("A pagar                     " + Cobro + " " + euro);


}

public static void NumEntradas(String entradas){

    int Totalentradas;

while(true){

try{
    
        Totalentradas = Integer.parseInt(entradas);
    
if((Totalentradas % 2) == 0){

        System.out.print("Entrada de parejas: ");
        System.out.println((Totalentradas/2));

            Total = ((Totalentradas/2)*TicketDoble);

        System.out.println("Precio por entrada de pareja: " + TicketDoble);

        break;

    }else if((Totalentradas % 2) != 0){
    
        Total = (Totalentradas*Ticket) + (((Totalentradas-1)/2)*TicketDoble);

    System.out.println("Entrada individual: " + 1);

    System.out.print("Entrada de parejas: ");
    System.out.println(((Totalentradas-1))/2);

    System.out.println("Precio por entrada de pareja: " + TicketDoble);
    System.out.println("Precio por entrada individual: " + Ticket);
        
    break;

        }else if((Totalentradas == 1)){

            TicketDoble = 0;

        System.out.println("Entradas individuales: " + 1);
        System.out.println("Precio por entrada individual: " + Ticket);

        break;

    }}

catch(NumberFormatException e){

    System.out.println("[System 32 bytes, Nº Entrada no valido, reinicie el programa]: " + "\n");
    break;

}

}

System.out.print("\n");



}


public static void DiaSem(){

    boolean repetir = true;
    String Dia;

    while(repetir){

        System.out.print("Día de la semana: ");
        Dia = Ejercicio26Cine.entrada.next().toUpperCase();
        
        if((Dia.equals("LUNES")) || (Dia.equals("MARTES")) || (Dia.equals("JUEVES"))
        || (Dia.equals("VIERNES")) || (Dia.equals("SABADO")) || (Dia.equals("DOMINGO"))){
            /*No sé por que hay un problema con sabado que cuando le añado una tilde en la "a" y lo ejecuto,
            no me reconoce la tilde */

            repetir = false;

        }else{

        if(Dia.equals("MIERCOLES")){

            Ticket = 5;
            repetir = false;

        }else{

        System.out.println("[Dia no valido. Repetir.]");
        repetir = true;

            }
        }
        }
        }

public static void TarjetaCine(){

    boolean repetir2 = true;
    char Tarjeta;

    while(repetir2){

        System.out.print("¿Tiene tarjeta CineCampa? [s] / [n]: ");
        Tarjeta = Ejercicio26Cine.entrada.next().toLowerCase().charAt(0);

        if(Tarjeta != 'n' && Tarjeta != 's' ){

            System.out.println("[Por favor introdusca los valores  [s] / [n] ]");
            repetir2 = true;

        }else{
                if(Tarjeta == 'n'){

                    System.out.print("\n");
                    repetir2 = false;

                }else{

                if(Tarjeta == 's'){

                    descuento = 0.10f;

                    System.out.print("\n");
                    repetir2 = false;

                }

                }
                
            }

        }

        }
    }




