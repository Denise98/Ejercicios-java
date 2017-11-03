/**
 * 
 *
 * 
 * @author Denise Burgos
 */

public class ejercicio14 {
  public static void main(String[] args) {
    System.out.println("Introduce un numero: ");
double num= Double.parseDouble(System.console().readLine());
double div2= num%2;
double div5= num%5;
if (div2==0){
  System.out.println("El numero es par");
}
if(div5==0){
  System.out.println("El numero es divisible entre 5");
} else{
  System.out.println("El numero no es par ni divisible entre 5");
}
}
}
