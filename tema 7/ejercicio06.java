/**
 *
 *
 * @author Denise Burgos
 */
 public class ejercicio06 {
  public static void main(String[] args) {
    int[] num1 = new int[15];
    int[] numRota = new int[15];
    int i=0;
    System.out.println("introduce 15 numeros");
    while(i<15){
      num1[i]=Integer.parseInt(System.console().readLine());
      i++;
    }
    for(int k=0;k<14;k++){
      numRota[k+1]=num1[k];
    }
    
    
    
    
    
    
    numRota[0]=num1[14];
    
    for(int j=0;j<15;j++){
      System.out.println(j+" = "+num1[j]+"    "+j+" = "+numRota[j]);
    }
  }
}
