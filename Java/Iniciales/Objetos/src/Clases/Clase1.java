package Clases;


public class Clase1 {
   
    // Una clase contiene propiedades y métodos
    //propiedades ---> variables de una clase
    //métodos---> funciones de la clase.
    // Una clase contiene propiedades y métodos.
   
    /*
    Método o función main (Palabra correcta es método), es el punto de entrada al proyecto.
    En el método main() comienza la ejecución de la clase.
    */

    public static void main(String[] args) throws Exception {
        // mensaje por consola
        
         // CLASE 1

         double comision = 15.5;
 
         System.out.printf("%20s %-10s %10s%n","Producto", "Cantidad", "Precio");
 
         System.out.printf("El valor de la comision es del%n %.5f euros%n", comision);
         System.out.printf("El valor de la comision es del%n %-10.5f euros%n", comision);
         
         System.out.printf("Portatil", 10, 1300.45);
         System.out.printf( "IPad 13Pro", 4, 2400);
         System.out.printf( "Iphone 14", 40, 1500.3);
 
         System.out.printf("%20s %10s %10s%n", "Iphone 14", 40, 1500.3 + "\n");
         
         /*
         - El %...s con el s, significa que estas dandole formato a un String.
         - Porcentaje, es un modificador de la primera variable %."5 decimales" saldria "50000", 5 decimales.
         - El 10 es el ancho de columna, el - significa que se mueve a la izquierda (los espacios, u tabs).
         - Aquí, se quiere que se escriba una comisión con 3 decimales, la f es de float.
         - %n significa salto de linea.
        */
        
        
        // CLASE 2

        String nombre = "José Antonio";
        String apellidos = "Morgado"; //Classe String java --> contiene métodos
        String ciudad = "Almeria";//string ciudad = "Almeria"; //tipo básico cadena de caracteres "string", sin mayuscula "S"
        String nombreCompleto;

        nombreCompleto = nombre + " " + apellidos;
        
        System.out.println("Nombre = "+ nombre);
        //El "+" es una funcion llamada sobrecarga, que lo que hace es concatenar una cadena de caracteres si los valores son string.
        //La sobrecarga de operadores es

        System.out.println("Apellidos y ciudad = "+ apellidos.concat(" y eres de ").concat(ciudad));

		// Concat()
        nombreCompleto.concat(nombre).concat("").concat(apellidos);
        System.out.println("Largo de la línea de nombre completo = " + nombreCompleto.length());
        //El metodo lenght calcula la longitud de la cadena, la cadena ".lenght", no es funcion, es un METODO
        System.out.println(("Vives en ").concat(ciudad));

        System.out.printf(("Vives en ").concat(ciudad) + "\n");
        //Esto es una muestra para que puedas ver que printf no realiza un salto de linea, sino tiene un "\n" al final.
      
}}

