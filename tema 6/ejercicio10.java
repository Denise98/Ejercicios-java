/**
 *
 *
 * @author Denise Burgos
 */
 public class ejercicio10 {
  public static void main(String[] args) {
    int car=(int)(Math.random()*6)+1;
    int largo= (int)(Math.random()*40)+1;
    int contador= 1;
    String car2="";
    switch(car){
      case 1:
      car2="*";
      break;
      case 2:
      car2="-";
      break;
      case 3:
      car2="=";
      break;
      case 4:
      car2=".";
      break;
      case 5:
      car2="|";
      break;
      case 6:
      car2= "@";
      break;
    }
    while(contador<10){
      for(int i=1;i<largo;i++){
        System.out.print(car2);
      }
      System.out.println();
      contador++;
    }
  }
}
    
