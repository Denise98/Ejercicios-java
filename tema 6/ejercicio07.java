/**
 *
 *
 * @author Denise Burgos
 */
 public class ejercicio07 {
  public static void main(String[] args) {
    String morado= "\033[35m";
    int contador= 1;
    String blanco= "\033[37m";
    while(contador<14){
      int apuesta= (int)(Math.random()*3)+1;
      if(apuesta==1){
        System.out.print(morado+"1"+blanco+"|X"+blanco+"|2");
        System.out.println();
      } else if(apuesta==2){
        System.out.printf(blanco+"1|"+morado+"X"+blanco+"|2");
        System.out.println();
        } else if(apuesta==3){
          System.out.print(blanco+"1|"+blanco+"X|"+morado+"2");
          System.out.println();
          }
         contador++; 
    }
    System.out.println("PLENO AL 15");
    int apuesta2= (int)(Math.random()*3)+1;
    if(apuesta2==1){
        System.out.print(morado+"1"+blanco+"|X"+blanco+"|2");
        System.out.println();
      } else if(apuesta2==2){
        System.out.printf(blanco+"1|"+morado+"X"+blanco+"|2");
        System.out.println();
        } else if(apuesta2==3){
          System.out.print(blanco+"1|"+blanco+"X|"+morado+"2");
          System.out.println();
          }
  }
}
