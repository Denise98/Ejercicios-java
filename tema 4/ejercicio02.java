/**
 *
 *
 * @author Denise Burgos
 */

public class ejercicio02 {
  public static void main(String[] args) {
    
    System.out.print("Introduce una hora del día: ");
    int hora = Integer.parseInt(System.console().readLine().toLowerCase());
    
	if((hora>=6) && (hora<=12)) {
      System.out.println("Buenos dias");
	}

	else if(hora>=13&&hora<=20){
        System.out.println("buenas tardes");
	}
	else if(hora>=21&&hora<=24){
        System.out.println("buenas noches");
	}
	else if(hora>=0&&hora<=5){
        System.out.println("buenas noches");
	}
	else if(hora>24){
		System.out.println("esa hora no existe");
	}
    
  }
}
