/**
 *
 *
 * @author Denise Burgos
 */

public class ejercicio04 {
  public static void main(String[] args) {
    
    System.out.print("Introduce las horas trabajadas: ");
    int hora = Integer.parseInt(System.console().readLine().toLowerCase());
    int sueldo;
	if(hora<= 40) {
    sueldo= hora*12;
  }
	else{
    sueldo= ((40*12)+((hora-40)*16));
	}
    System.out.print(sueldo);
  }
}
