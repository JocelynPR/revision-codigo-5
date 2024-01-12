/*
 * Se debe ingresar un número entero, que posteriormente se obtiene su modulo y se realiza una comparación entre 
 * el resultado y los valores de 3,7,8,9.  
 * Como resultado se obtiene el número inicial y se muestra la leyenda si es o no un número afortunado.
 * */

package revision5;

import java.util.Scanner; //Se agrega el import para leer

public class Codigo5 {

	//Se crea método main para eecutar el programa
			public static void main(String[]args) {
				//Se crea clase Scanner para poder utilizarla
				//Se renombra la variable scanner  y se agrega System in
				Scanner scanner = new Scanner(System.in);
				//Se cambia el apostrofe por una doble , se agrega ln a print
			    System.out.println("Introduzca un número: ");
			    //Se renombra la variable "ni" por "número" y en lugr de string se cambia a int
			    int numero = scanner.nextInt();
			    scanner.close(); //se cierra scanner
			  
			    //Se cambia el nombre de las variables para mayor entendimiento
			    int caso = numero; 
			    int afortunado = 0;
			    int noAfortunado = 0;
			    
			    // Se inicia un ciclo while.
			    while (numero > 0) {
				  int digito = (int) (numero % 10); 
				// Se compara el digito con alguno de los siguientes valores según la condición.
			      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			    	  afortunado++;
			      } else {
			    	  noAfortunado++;
			      } //Se cierra para que no se cree un ciclo infinito
					numero /= 10;
			    }// Se cierra while

			    // Se hace comparacion
			    if (afortunado > noAfortunado) {
			    	//Se corrige prinln a println
			      System.out.println("El " + caso + " es un número afortunado.");
			    } else {
			      System.out.println("El " + caso + " no es un número afortunado.");
			    }//Se cierra if else 
			}

}
