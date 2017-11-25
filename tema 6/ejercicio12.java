/**
 *
 *
 * @author Denise Burgos
 */
 public class ejercicio12 {
  public static void main(String[] args) {
    boolean matrix2= true;
    String verde= "\033[32m";
    while(true){
      int matrix=(int)(Math.random()*94)+32;
      System.out.print(verde+(char)matrix);
    }
  }
}
