/**
 *
 *
 * @author Denise Burgos
 */

public class ejercicio05 {
  public static void main(String[] args) {
    
    System.out.print("vamos a reolver una ecuacion del tipo ax+b=0");
    System.out.print("Introduce a: ");
    double a = Double.parseDouble(System.console().readLine().toLowerCase());
    System.out.print("Introduce b: ");
    double b= Double.parseDouble(System.console().readLine().toLowerCase());
	if(a== 0) {
    System.out.print("No se puede solucionar la ecuacion");
	} else {
    System.out.print("x= "+ (((-1)*b)/a));
	}
  }
}
