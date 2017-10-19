/**

*Ejercicio 5
* 
*Modifica el programa anterior añadiendo colores. Puedes mostrar cada asig-
*natura de un color diferente.
* 
* @author Denise Burgos García
*/
public class Ejercicio05 {
  public static void main(String[] args) {
 String rj="\033[31m";
String v="\033[32m";
String nj="\033[33m";
String az="\033[34m";
String m="\033[35m";
String bl="\033[37m";
	 System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes");
	 System.out.printf("----------------------------------------------------\n");
	 System.out.printf("%-15s %-15s %-15s %-15s %-15s\n", m+"SINF", rj+"PRO", m+"SINF", rj+"PRO", rj+"PRO");
	 System.out.printf("%-15s %-15s %-15s %-15s %-15s\n", m+"SINF", rj+"PRO", m+"SINF", rj+"PRO", rj+"PRO");
	 System.out.printf("%-15s %-15s %-15s %-15s %-15s\n", m+"SINF", rj+"PRO", m+"SINF", rj+"PRO", bl+"ED");
	 System.out.printf("%-15s %-15s %-15s %-15s %-15s\n", az+"FOL", v+"BBDD", bl+"ED", v+"BBDD", nj+"LM");
	 System.out.printf("%-15s %-15s %-15s %-15s %-15s\n", az+"FOL", v+"BBDD", bl+"ED", v+"BBDD", nj+"LM");
	 System.out.printf("%-15s %-15s %-15s %-15s %-15s\n", az+"FOL", v+"BBDD", nj+"LM", v+"BBDD", nj+"LM");
     
  }
}
