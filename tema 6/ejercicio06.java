/**
 *
 *
 * @author Denise Burgos
 */

public class ejercicio06 {
  public static void main(String[] args) {
    int num=(int)(Math.random()*100);
    System.out.println("Intenta adivinar el numero que estoy pensando entre 0 y 100 ");
    int numI= Integer.parseInt(System.console().readLine());
    int contador=1;
    while(contador<5){
    if(numI==num){
      System.out.println("Enhorabuena!!!");
      contador=5;
    } else{
      if(numI>num){
        System.out.println("el numero "+numI+" es mayor que el que estoy pensando");
      } else if(numI<num){
        System.out.println("el numero "+numI+" en menor que el que estoy pensando");
        }
      numI= Integer.parseInt(System.console().readLine());
      }
    contador++;
    }
    if((numI!=num)&&(contador>=5)){
    System.out.println("Se han acabado los intentos");
    }
  }

}
