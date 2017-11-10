/**
 *
 *
 * @author Denise Burgos
 */

public class ejercicio11 {
  public static void main(String[] args) {
    int i=0;
    System.out.println("Introduce 5 numeros");
    System.out.printf("%15s %15s %15s /n", "Numero","Cuadrado","Cubo");
    do{
      double num= Double.parseDouble(System.console().readLine());
      double cuad= Math.pow(num,2);
      double cubo= Math.pow(num,3);
      System.out.printf("%15f, %15f,%15f",num,cuad,cubo);
      i++;
    } while(i<=5);
  }
}
      
    
