 /**
 *
 *
 * @author Denise Burgos
 */

public class ejercicio10 {
  public static void main(String[] args) {
    int contador= 0;
    int num=0;
    double suma= 0;
    System.out.println("Introduce numeros positivos y para acabar un numero negativo");
    while(num>=0){
      num= Integer.parseInt(System.console().readLine());
      contador++;
    suma+=num;
    if(num<0){
    System.out.print("media= "+(suma-num/contador-1));
  }
}
}
}
