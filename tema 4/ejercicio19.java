/**
 *
 *
 * @author Denise Burgos
 */

public class ejercicio19 {
  public static void main(String[] args) {
  System.out.println("Introduce un numero de hasta 5 cifras y el numero de digitos que contiene");
  int num= Integer.parseInt(System.console().readLine().toLowerCase());
if (num<10){
  System.out.println("el numero tiene 1 cifra");
} else if(num<100){
  System.out.println("el numero tiene 2 cifras");
 } else if(num<1000){
   System.out.println("el numero tiene 3 cifras");
 } else if (num<10000){
   System.out.println("el numero tiene 4 cifras");
 } else if (num<100000){
   System.out.println("el numero tiene 5 cifras") ;
 } else if (num>=100000){
   System.out.println("solo se permiten hasta 5 cifras");
 }
}
}
