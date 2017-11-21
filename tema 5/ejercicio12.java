/**
 *
 *
 * @author Denise Burgos
 */

public class ejercicio12 {
  public static void main(String[] args) {
    System.out.println("¿Cuantos numeros de la serie fibonacci desea conocer?");
    int n= Integer.parseInt(System.console().readLine());
    int i= 0;
    int num1=0;
    int num2=1;
    int num3=0;
    while(i<=n-1){
      System.out.print(num3);
      num1= num2;
      num2= num3;
      
      num3= num1+num2;
      i++;
    }
  }
}
