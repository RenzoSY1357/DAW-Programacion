package Clases;

import java.util.Scanner;

public class Nomina {
 
public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args){

        Nomina.Menu();

    }
    


public static void Menu(){

System.out.println("\n" + "------------------------------ N O M I N A -----------------------------" + "\n");

    System.out.print("Introduza los Nombres y apellidos del empleado: ");
    String Nombre = Nomina.entrada.nextLine();

System.out.println("\n" + "------------------------------------------------------------------------");

System.out.println("Introduzca el cargo del empleado: " + "\n");
    System.out.println("[ 1 ]: Prog. junior.");
    System.out.println("[ 2 ]: Prog. senior.");
    System.out.println("[ 3 ]: Jefe de Proyecto." + "\n");
    
    System.out.print("[ CARGO ] ---> ");
    int cargo = Nomina.entrada.nextInt();

System.out.println("\n" + "------------------------------------------------------------------------");

System.out.println("Introduza el Nº de días en viajes laborales realizados durante el mes:" + "\n");
    System.out.print("[ Nº DE DÍAS ] ---> ");
    int dias = Nomina.entrada.nextInt();

System.out.println("\n" + "------------------------------------------------------------------------");

System.out.println("Introduzca el estado civil del empleado:" + "\n");

    char EstadoCivil;

    System.out.println("[ S ]: Soltero");
    System.out.println("[ C ]: Casado" + "\n");

    System.out.print("[ ESTADO CIVIL ] ---> ");
    EstadoCivil = Nomina.entrada.next().toUpperCase().charAt(0);

    Nomina.TablaNomina(Nombre, cargo, dias, EstadoCivil);

}
    



public static void TablaNomina(String Nombre, int cargo, int dias, char EstadoCivil){

    Nomina.Sueldo(cargo);

    cargo = Nomina.Sueldo(cargo);

        int dietas = dias*30;
        int SueldoBruto = (cargo + dietas);
        double RetencionIRPF;
        String retencion = "valor";

            if(EstadoCivil == 'S'){

                    retencion = "(25%)";
                    RetencionIRPF = (SueldoBruto*(0.25));
    
                }else{

                if(EstadoCivil == 'C'){

                            retencion = "(20%)";
                            RetencionIRPF = (SueldoBruto*(0.20));

                    }else{

                            RetencionIRPF = 0;

                                                    }
                                                        }

        double SueldoNeto = (SueldoBruto-RetencionIRPF);

System.out.println("\n" + "------------------------------------------------------------------------");

System.out.println("|        Nomina del trabajador " + Nombre);



System.out.println( "------------------------------------------------------------------------");
System.out.println("| Suelo base         " + cargo + "                                         |" );
System.out.println("| Dietas        " + dietas + "                                             |" );
System.out.println( "------------------------------------------------------------------------");
System.out.println("| Sueldo bruto        " + SueldoBruto + "                                  |" );
System.out.println("| Retencion IRPF " + retencion + "        " + RetencionIRPF + "            |" );
System.out.println( "------------------------------------------------------------------------");
System.out.println("| Sueldo Neto       " + SueldoNeto + "                                     |" );
System.out.println( "------------------------------------------------------------------------");

}



    public static int Sueldo(int cargo){

        switch(cargo){

            case 1:

            cargo = 950; break;

            case 2:
            cargo = 1200; break;

            case 3:
            cargo = 1600; break;

                default:
                cargo = 0;

        }

        return cargo;

        }


}
