/**
 *
 *
 * @author Denise Burgos
 */
 public class ejercicio15 {
  public static void main(String[] args) {
    int nota=4*(int)(Math.random()*7);
    String nota2="";
    String primeranota="";
    for(int i=1;i<=nota;i++){
      switch((int)(Math.random() * 7)+1){
        case 1:
        nota2="do";
        break;
        case 2:
        nota2="re";
        break;
        case 3:
        nota2="mi";
        break;
        case 4:
        nota2="fa";
        break;
        case 5:
        nota2="sol";
        break;
        case 6:
        nota2="la";
        break;
        case 7:
        nota2="si";
        break;
      }
      if(i==1){
      primeranota=nota2;
      }
      if(i==nota){
      nota2=primeranota;
      }
      System.out.print(nota2+" ");
      if(i==nota){
      System.out.print("||");
      } else if(i%4==0){
        System.out.print("|");
        }
    }
  }
}
