/**
 *
 *
 * @author Denise Burgos
 */

public class ejercicio08 {
  public static void main(String[] args) {
  System.out.println("Vamos a calcular la media de 3 notas");
  System.out.print("Por favor introduce la primera nota ");
  double nota1= Double.parseDouble(System.console().readLine().toLowerCase());
  System.out.print("Introduce la segunda ");
  double nota2= Double.parseDouble(System.console().readLine().toLowerCase());
  System.out.print("Introduce la tercera ");
  double nota3= Double.parseDouble(System.console().readLine().toLowerCase());
  double media= ((nota1+nota2+nota3)/3);
  if ((media>=0)&&(media<5)){
    System.out.print("tienes un insuficiente");
  }
  if ((media>=5)&&(media<6)){
    System.out.print("tienes un suficiente");
  }
  if ((media>=6)&&(media<7)){
    System.out.print("tienes un bien");
  }
  if ((media>=7)&&(media<9)){
    System.out.print("tienes un notable");
  }
  if ((media>=9)&&(media<=10)){
    System.out.print("tienes un sobresaliente");
  }
  if((media<0)&&(media>10)){
    System.out.print("no existe esa calificacion");
  }
}
}
