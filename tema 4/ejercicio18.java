/**
 *
 *
 * @author Denise Burgos
 */

public class ejercicio18 {
  public static void main(String[] args) {
  System.out.println("Introduce un numero de hasta 5 cifras y te dire la primera cifra");
  int num= Integer.parseInt(System.console().readLine().toLowerCase());
if (num<10){
  System.out.println("la primera cifra es "+num);
} else if(num<100){
  System.out.println("la primera cifra es "+num/10);
 } else if(num<1000){
   System.out.println("la primera cifra es "+num/100);
 } else if (num<10000){
   System.out.println("la primera cifra es "+num/1000);
 } else if (num<100000){
   System.out.println("la primera cifra es "+num/10000) ;
 } else if (num>=100000){
   System.out.println("solo se permiten hasta 5 cifras");
 }
}
}
