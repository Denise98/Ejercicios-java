/**
 * 
 *
 * 
 * @author Denise Burgos
 */

public class ejercicio10 {
  public static void main(String[] args) {
    
    System.out.println("Introduce el mes de nacimiento: ");
    String mes = System.console().readLine().toLowerCase();
    System.out.println("Introduce el dia del mes");
    int dia= Integer.parseInt(System.console().readLine().toLowerCase());
    String horoscopo;
    switch (mes) {
      case "enero":
        if((dia>=20)&&(dia<=31)){
        horoscopo= "acuario ♒";
      } else{
        horoscopo= "capricornio ♑ ";
      }
        break;
      
      case "febrero":
      if (dia<=19){
        horoscopo = "acuario ♒";
        } else{
        horoscopo= "piscis ♓";
      }
        break;
        
      case "marzo":
      if (dia<21){
        horoscopo = "piscis ♓";
       } else{
        horoscopo= "aries ♈";
      }
        break;
        
      case "abril":
      if (dia<21){
        horoscopo = "aries ♈";
       } else{
        horoscopo= "tauro ♉ ";
      }
        break;
        
      case "mayo":
      if (dia<21){
        horoscopo = "tauro ♉";
       } else{
        horoscopo= "geminis ♊";
      }
        break;
        case "junio":
        if(dia<21){
        horoscopo= "geminis ♊";
       } else{
        horoscopo= "cancer ♋";
      }
      case "julio":
      if(dia<21){
        horoscopo= "cancer ♋";
       } else{
        horoscopo= "leo ♌";
      }
        break;
        case "agosto":
        if (dia<22){
        horoscopo= "leo ♌";
       } else{
        horoscopo= "virgo ♍";
      }
        break;
        case "septiembre":
        if (dia<23){
        horoscopo= "virgo ♍";
       } else{
        horoscopo= "libra ♎";
      }
        break;
        case "octubre":
        if (dia<23){
        horoscopo= "libra ♎";
       } else{
        horoscopo= "escorpio ♏";
      }
      break;
        case "noviembre":
        if (dia<23){
        horoscopo="escorpio ♏";
       } else{
        horoscopo= "sagitario ♐";
      }
      break;
        case "diciembre":
        if (dia<21){
        horoscopo= "sagitario ♐";
       } else{
        horoscopo= "capricornio ♑";
      }
      break;
      default:
        horoscopo = "No existe esa fecha";
        break;
    }
      System.out.print("tu signo del zodiaco es "+ horoscopo);
      }
      
    
  }
