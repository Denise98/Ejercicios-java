/**
 *
 *
 * @author Denise Burgos
 */
 public class ejercicio17 {
  public static void main(String[] args) {
    System.out.println("Introduce la altura(minimo 4)");
    int alturaI= Integer.parseInt(System.console().readLine());
    System.out.println("Introduce la anchura(minimo 4)");
    int anchoI= Integer.parseInt(System.console().readLine());
    int alto= 1;
    int cuentaEspacios=0;
    int posicion= (int)(Math.random()*(alturaI - 2)*(anchoI- 2));
    
    for(int i= 1;i<=anchoI; i++){
    System.out.print("*");
    }
    alto++;
    System.out.println();
    
    while(alto<alturaI){
      System.out.print("*");//asterisco de la izquierda
      
      for(int i= 1;i<=anchoI-2;i++){
        if(cuentaEspacios==posicion){
          System.out.print("&");
        } else{
          System.out.print(" ");
        }
        cuentaEspacios++;
      }
      System.out.println("*");//asterisco de la derecha
      alto++;
    }
    for(int i= 1;i<=anchoI; i++){
    System.out.print("*");
    }
    alto++;
  }
}
