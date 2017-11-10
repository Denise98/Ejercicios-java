 /**
 *
 *
 * @author Denise Burgos
 */

public class ejercicio07 {
  public static void main(String[] args) {
    int clave= 0;
    int contador= 0;
    while (contador < 4){
      clave= Integer.parseInt(System.console().readLine());
      if (clave==3465) {
        System.out.println("La caja fuerte se ha abierto satisfactoriamente");
        contador +=4;
      } else {
        System.out.println("Lo siento esa no es la combinacion");
      contador++;
      }
      }
  }
}
      
