/**
 *
 *
 * @author Denise Burgos
 */
 public class ejercicio05 {
  public static void main(String[] args) {
    int[] num = new int[10];
    int i=0;
    int max=0;
    int min=99999999;
    System.out.println("introduce 10 numeros y te dire el maximo y el minimo");
    while(i<10){
      num[i]= Integer.parseInt(System.console().readLine());
      if(num[i]>max){
      max=num[i];
      } if(num[i]<min){
        min=num[i];
        }
          i++;
    }
    System.out.println("maximo: "+max);
    System.out.println("minimo: "+min);
  }
}
