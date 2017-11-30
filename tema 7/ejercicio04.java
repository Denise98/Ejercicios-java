/**
 *
 *
 * @author Denise Burgos
 */
 public class ejercicio04 {
  public static void main(String[] args) {
    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];
    System.out.printf("%-10s %-12s %-12s\n","numero","cuadrado","cubo");
    for(int i=0;i<=20;i++){
      numero[i]=(int)(Math.random()*20);
      cuadrado[i]=numero[i]*numero[i];
      cubo[i]= numero[i]*numero[i]*numero[i];
      System.out.printf("%-10s %-12s %-12s\n",numero[i],cuadrado[i],cubo[i]);
    }
  }
}
