/**
 *
 *
 * @author Denise Burgos
 */

public class ejercicio09 {
  public static void main(String[] args) {
    
    System.out.print("vamos a reolver una ecuacion de segundo grado");
    System.out.print("Introduce a: ");
    double a = Double.parseDouble(System.console().readLine().toLowerCase());
    System.out.print("Introduce b: ");
    double b= Double.parseDouble(System.console().readLine().toLowerCase());
    System.out.print("Introduce c: ");
    double c= Double.parseDouble(System.console().readLine().toLowerCase());
    double z= (Math.pow(b,2)-(4*a*c));
  if((2*a)== 0) {
    System.out.print("No se puede solucionar la ecuacion");
	}
  else if (Math.sqrt(z)<0){
    System.out.print("no se puede resover la ecuacion");
  } else {
      System.out.print("x1= "+ ((-b+Math.sqrt(z))/(2*a)));
      System.out.print("x2= "+((-b-Math.sqrt(z))/(2*a)));
  }
}
	}
