/**
 *
 *
 * @author Denise Burgos
 */
 public class ejercicio13 {
  public static void main(String[] args) {
    String dado01="";
    String dado02="";
    int dado1=0;
    int dado2=1;
    while(dado1!=dado2){
      dado1=(int)(Math.random()*6)+1;
      dado2=(int)(Math.random()*6)+1;
      switch(dado1){
        case 1:
        dado01= "⚀";
        break;
        case 2:
        dado01= "⚁";
        break;
        case 3:
        dado01= "⚂";
        break;
        case 4:
        dado01= "⚃";
        break;
        case 5:
        dado01= "⚄";
        break;
        case 6:
        dado01= "⚅";
        break;
      }
       switch(dado2){
        case 1:
        dado02= "⚀";
        break;
        case 2:
        dado02= "⚁";
        break;
        case 3:
        dado02= "⚂";
        break;
        case 4:
        dado02= "⚃";
        break;
        case 5:
        dado02= "⚄";
        break;
        case 6:
        dado02= "⚅";
        break;
      }
      System.out.println(dado01+" "+dado02);
    }
  }
}
