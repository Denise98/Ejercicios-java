/**
 * 4. Sentencia condicional
 *
 * 1. Escribe un programa que pida por teclado un día de la semana y que diga 
 *    qué asignatura toca a primera hora ese día.
 *
 * @author Denise Burgos
 */

public class Ejercicio01 {
  public static void main(String[] args) {
    
    System.out.print("Introduce un día de la semana: ");
    String dia = System.console().readLine().toLowerCase();
    String clase;
    
    switch (dia) {
      case "lunes":
        clase = "Sistemas informáticos";
        break;
      
      case "martes":
        clase = "Programación";
        break;
        
      case "miércoles":
        clase = "Sistemas informáticos";
        break;
        
      case "jueves":
        clase = "Programación";
        break;
        
      case "viernes":
        clase = "Programación";
        break;
        case "sabado"
        clase= "no hay clase"
        break
      case "domingo"
        clase= "no hay clase"
        break
      default:
        clase = "No existe ese día";
        break;
    }
      if (clase= "no hay clase") {
    
        System.out.println("Ese dia "+clase);
        if(clase= "no existe ese dia");
        System.out.println(clase);
      } else {
        System.out.println(("El " + dia + " toca a primera hora " + clase + ".");
        ;
      }
      
    
  }
}
