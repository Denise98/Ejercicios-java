/**
 *
 *
 * @author Denise Burgos
 */
 public class ejercicio09 {
  public static void main(String[] args) {
    int contador=1;
    int numI=1;
    while(numI!=24){
      numI=(int)(Math.random()*100);
      contador++;
      System.out.println(numI);
    }
    System.out.println("Se han generado "+contador+" numeros");
  }
}
