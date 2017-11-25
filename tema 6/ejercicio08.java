/**
 *
 *
 * @author Denise Burgos
 */
 public class ejercicio08 {
  public static void main(String[] args) {
    String morado= "\033[35m";
    int contador= 1;
    String blanco= "\033[37m";
    while(contador<14){
      int apuesta= (int)(Math.random()*3)+1;
      switch(apuesta){
        case 1:
          System.out.print(morado+"1"+blanco+"|X"+blanco+"|2");
          System.out.println();
          break;
        case 2:
          System.out.printf(blanco+"1|"+morado+"X"+blanco+"|2");
          System.out.println();
          break;
        case 3:
          System.out.print(blanco+"1|"+blanco+"X|"+morado+"2");
          System.out.println();
          break;
        case 4:
          System.out.print(morado+"1"+blanco+"|X"+blanco+"|2");
          System.out.println();
          break;
        case 5:
          System.out.print(morado+"1"+blanco+"|X"+blanco+"|2");
          System.out.println();
        break;
        case 6:
          System.out.printf(blanco+"1|"+morado+"X"+blanco+"|2");
          System.out.println();
        break;
      }
          
         contador++; 
    }
    System.out.println("PLENO AL 15");
    int apuesta2= (int)(Math.random()*3)+1;
    switch(apuesta2){
        case 1:
          System.out.print(morado+"1"+blanco+"|X"+blanco+"|2");
          System.out.println();
          break;
        case 2:
          System.out.printf(blanco+"1|"+morado+"X"+blanco+"|2");
          System.out.println();
          break;
        case 3:
          System.out.print(blanco+"1|"+blanco+"X|"+morado+"2");
          System.out.println();
          break;
        case 4:
          System.out.print(morado+"1"+blanco+"|X"+blanco+"|2");
          System.out.println();
          break;
        case 5:
          System.out.print(morado+"1"+blanco+"|X"+blanco+"|2");
          System.out.println();
        break;
        case 6:
          System.out.printf(blanco+"1|"+morado+"X"+blanco+"|2");
          System.out.println();
        break;
    }
  }
}
