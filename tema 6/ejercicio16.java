/**
 *
 *
 * @author Denise Burgos
 */
 public class ejercicio16 {
  public static void main(String[] args) {
    int figura1=(int)(Math.random()*5)+1;
    int figura2=(int)(Math.random()*5)+1;
    int figura3=(int)(Math.random()*5)+1;
    String figura01="";
    String figura02="";
    String figura03="";
    switch(figura1){
      case 1:
      figura01="corazón";
      break;
      case 2:
      figura01="diamante";
      break;
      case 3:
      figura01="herradura";
      break;
      case 4:
      figura01= "campana";
      break;
      case 5:
      figura01="limon";
      break;
    }
    switch(figura2){
      case 1:
      figura02="corazón";
      break;
      case 2:
      figura02="diamante";
      break;
      case 3:
      figura02="herradura";
      break;
      case 4:
      figura02= "campana";
      break;
      case 5:
      figura02="limon";
      break;
    }
    switch(figura3){
      case 1:
      figura03="corazón";
      break;
      case 2:
      figura03="diamante";
      break;
      case 3:
      figura03="herradura";
      break;
      case 4:
      figura03= "campana";
      break;
      case 5:
      figura03="limon";
      break;
    }
    System.out.println(figura01+" "+figura02+" "+figura03);
    if(figura01==figura02){
    System.out.println("Bien, ha recuperado su moneda");
    } else if(figura01==figura03){
      System.out.println("Bien, ha recuperado su moneda");
      }else if(figura02==figura03){
        System.out.println("Bien, ha recuperado su moneda");
        } else if((figura01==figura02)&&(figura02==figura03)){
          System.out.println("Enhorabuena ha conseguido 10 monedas");
          } else{
            System.out.println("Lo siento, ha perdido");
            }
  }
}

