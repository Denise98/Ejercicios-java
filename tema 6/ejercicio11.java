/**
 *
 *
 * @author Denise Burgos
 */
 public class ejercicio11 {
  public static void main(String[] args) {
    String nota2= "";
    int contador=1;
    int consus=0;
    int consufi=0;
    int conbien=0;
    int connot=0;
    int consob=0;
    while(contador<21){
      int nota=(int)(Math.random()*5)+1;
      switch(nota){
        case 1:
        nota2= "suspenso";
        break;
        case 2:
        nota2="suficiente";
        break;
        case 3:
        nota2="bien";
        break;
        case 4:
        nota2="notable";
        break;
        case 5:
        nota2= "sobresaliente";
        break;
      }
        switch(nota2){
        case "suspenso":
        consus++;
        break;
        case "suficiente":
        consufi++;
        break;
        case "bien":
        conbien++;
        break;
        case "notable":
        connot++;
        break;
        case "sobresaliente":
        consob++;
        break;
      }
      System.out.println(nota2);
      contador++;
    }
    System.out.println("numero de suspensos: "+consus);
    System.out.println("numero de suficientes: "+consufi);
    System.out.println("numero de bien: "+conbien);
    System.out.println("numero de notables: "+connot);
    System.out.println("numero de sobresalientes: "+consob);
  }
}
