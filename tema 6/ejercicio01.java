/**
 *
 *
 * @author Denise Burgos
 */

public class ejercicio01 {
  public static void main(String[] args) {
  System.out.println("tiramos tres dados");
  int dado1=(int)(Math.random()*6)+1;
  int dado2=(int)(Math.random()*6)+1;
  int dado3=(int)(Math.random()*6)+1;
  String dado01="a";
  String dado02="b";
  String dado03="c";
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
   switch(dado3){
  case 1:
  dado03= "⚀";
  break;
  case 2:
  dado03= "⚁";
  break;
  case 3:
  dado03= "⚂";
  break;
  case 4:
  dado03= "⚃";
  break;
  case 5:
  dado03= "⚄";
  break;
  case 6:
  dado03= "⚅";
  break;
}
  System.out.println("dado 1: "+dado01);
  System.out.println("dado 2: "+dado02);
  System.out.println("dado 3: "+dado03);
  System.out.println("suma: "+(dado1+dado2+dado3));
}
}
