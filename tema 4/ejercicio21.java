/**
 *
 *
 * @author Denise Burgos
 */

public class ejercicio21 {
  public static void main(String[] args) {
    System.out.println("Por favor introduce la nota del primer control: ");
    double nota1= Double.parseDouble(System.console().readLine());
    System.out.println("Introduce la nota del segundo control: ");
    double nota2= Double.parseDouble(System.console().readLine());
    double media= (nota1+nota2)/2;
    if(media>=5){
      System.out.println("nota final de programacion: "+media);
    } else{
      System.out.println("resultado de la recuperacion(apto/no apto): ");
      String rec= System.console().readLine();
      if (rec.equals ("apto")){
        System.out.println("nota final de programacion: 5");
      } else{
        System.out.println("nota final de programacion: "+media);
      }
    }
  }
}
