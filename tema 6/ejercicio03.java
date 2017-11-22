/**
 *
 *
 * @author Denise Burgos
 */

public class ejercicio03 {
  public static void main(String[] args) {
    int palo=(int)(Math.random()*4)+1;
    int carta= (int)(Math.random()*10)+1;
    String palo2="b";
    String carta2="a";
    switch(palo){
    case 1:
    palo2= "bastos";
    break;
    case 2:
    palo2= "oros";
    break;
    case 3:
    palo2= "copas";
    break;
    case 4:
    palo2= "espadas";
    break;
    }
  switch(carta){
  case 1:
  carta2= "A";
  break;
  case 2:
  carta2= "2";
  break;
  case 3:
  carta2= "3";
  break;
  case 4:
  carta2= "4";
  break;
  case 5:
  carta2="5";
  break;
  case 6:
  carta2="6";
  break;
  case 7:
  carta2="7";
  break;
  case 8:
  carta2="sota";
  break;
  case 9:
  carta2="caballo";
  break;
  case 10:
  carta2= "rey";
  break;
  }
  System.out.println(carta2+" de "+palo2);
}
}
