/**
 *
 *
 * @author Denise Burgos
 */
 public class ejercicio14 {
  public static void main(String[] args) {
    System.out.println("Piensa un numero del 0 al 100 y lo intentare adivinar");
    System.out.println("dale a intro para empezar");
    System.console().readLine();
    int contador=1;
    String resp="no";
    String mayoromenor="";
    while((contador<5)&&(resp.equals("no"))){
    int num=(int)(Math.random()*100);
    System.out.println("¿es "+num+" el numero que estas pensando?");
    resp=System.console().readLine();
      if (resp.equals("no")){
      System.out.println("¿es mayor o menor?");
      mayoromenor=System.console().readLine();
      contador++;
      } else{
        System.out.println("He acertado!!");
        }
      if((resp.equals("no"))&&(contador==5))
      System.out.println("vaya no he podido acertar");
    }
  }
}
