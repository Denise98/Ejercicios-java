/**
 * 
 *
 * 
 * @author Denise Burgos
 */

public class ejercicio11 {
  public static void main(String[] args) {
    
    System.out.println("Introduce la hora en formato 24 horas: ");
    int hora= Integer.parseInt(System.console().readLine());
    System.out.println("Introduce los minutos: ");
    int minutos= Integer.parseInt(System.console().readLine());
    
    final int segdia= 86400;
    final int seghora= 3600;
    if ((hora >= 0) && (hora <= 23)) { 
    System.out.println("Quedan" + (segdia-(seghora*hora))+ "segundos para el final del dia");
  } else{
    System.out.println("no existe esa hora");
  }
  if ((minutos <=0) && (minutos >=59)) {
    System.out.println("no existe esa hora");
  }
    
    
      }
      
    
  }
