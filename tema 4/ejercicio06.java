/**
 *
 *
 * @author Denise Burgos
 */

public class ejercicio06 {
  public static void main(String[] args) {
    
    System.out.println("vamos a calcular el tiempo que tarda un objeto al caer");
    System.out.print("Introduce la altura: ");
    double h = Double.parseDouble(System.console().readLine().toLowerCase());
    double g= 9.81;
	if((h/g)<0) {
    System.out.print("No se puede calcular");
	} else {
    System.out.print("tardará "+ (Math.sqrt(h/g))+" segundos");
	}
  }
}
