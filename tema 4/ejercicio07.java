/**
 *
 *
 * @author Denise Burgos
 */

public class ejercicio07 {
  public static void main(String[] args) {
  System.out.println("Vamos a calcular la media de 3 notas");
  System.out.print("Por favor introduce la primera nota ");
  double nota1= Double.parseDouble(System.console().readLine().toLowerCase());
  System.out.print("Introduce la segunda ");
  double nota2= Double.parseDouble(System.console().readLine().toLowerCase());
  System.out.print("Introduce la tercera ");
  double nota3= Double.parseDouble(System.console().readLine().toLowerCase());
  System.out.print("La media es "+ ((nota1+nota2+nota3)/3));
}
}
