 /**
 *
 *
 * @author Denise Burgos
 */

public class ejercicio08 {
  public static void main(String[] args) {
     System.out.println("Introduce un numero y te dire su tabla de multiplicar");
     int num= Integer.parseInt(System.console().readLine());
    for(int i=0;i<=10;i++){
      System.out.println( num + "*" + i + " = " + num*i);
    }
  }
}
      
