/**
 *
 *
 * @author Denise Burgos
 */

public class ejercicio20 {
  public static void main(String[] args) {
  System.out.println("Introduce un numero de hasta 5 cifras y te dire si es capicua");
  int num= Integer.parseInt(System.console().readLine().toLowerCase());
if (num<10){
  System.out.println("el numero es capicua");
} if((num>=10)&&(num<100)){
  if ((num/10)==(num%10)){
  System.out.println("el numero es capicua");
}
 } if((num>=100)&&(num<1000));{
   if ((num/100)==(num%10)){
   System.out.println("el numero es capicua");
 }
 } if ((num>=1000)&&(num<10000)){
   if((num/1000)==(num%10)&&((( num / 100 ) % 10)== (( num / 10) % 10))) {
   System.out.println("el numero es capicua");
 }
 } if ((num>=10000)&&(num<100000)){
   if(((num / 10000) == (num % 10) ) && ((((num / 1000) % 10)) == ((num / 10) % 10))); {
   System.out.println("el numero es capicua") ;
 }
 } if (num>=100000){
   System.out.println("solo se permiten hasta 5 cifras");
 } else{
   System.out.println("el numero no es capicua");
 }
}
}
