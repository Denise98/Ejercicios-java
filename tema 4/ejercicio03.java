/**
 *
 *
 * @author Denise Burgos
 */

public class ejercicio03 {
  public static void main(String[] args) {
    
    System.out.print("Introduce un numero del 1 al 7: ");
    int num = Integer.parseInt(System.console().readLine().toLowerCase());
    String dia;
	switch (num) {
      case 1:
        dia = "Lunes";
        break;
      
      case 2:
        dia = "Martes";
        break;
        
      case 3:
        dia = "Miercoles";
        break;
        
      case 4:
        dia = "Jueves";
        break;
        
      case 5:
        dia = "Viernes";
        break;
      case 6:
        dia= "Sabado";
        break;
      case 7:
        dia= "Domingo";
        break;
      default:
        dia = "No existe ese día";
        break;
	}
	System.out.print(dia);
	}
    
  }
