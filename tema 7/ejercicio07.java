/**
 *
 *
 * @author Denise Burgos
 */
 public class ejercicio07 {
  public static void main(String[] args) {
    int[] num1 = new int[100];
    for(int i=0;i<100;i++){
      num1[i]=(int)(Math.random()*21);
      System.out.println(num1[i]);
    }
    System.out.println("Que numero desea sustituir?");
    int num2=Integer.parseInt(System.console().readLine());
    System.out.println("por cual desea sustituirlo?");
    int num3=Integer.parseInt(System.console().readLine());
    for(int j=0;j<100;j++){
      if(num1[j]==num2){
      num1[j]=num3;
      }
      System.out.println(num1[j]);
    }
  }
}
  
