 /**
 *
 *
 * @author Denise Burgos
 */

public class ejercicio09 {
  public static void main(String[] args) {
    int contador= 0;
     System.out.println("Introduce un numero y te dire cuantas cifras tiene");
     int num= Integer.parseInt(System.console().readLine());
    
    while (num > 1){
      num/=10;
      contador++;
    }
    System.out.println("tiene "+contador+" cifras");
    
  }
}
      
