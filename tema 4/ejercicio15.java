/**
 * 
 *
 * 
 * @author Denise Burgos
 */

public class ejercicio15 {
  public static void main(String[] args) {
    System.out.println("Introduce un caracter: ");
  String car= System.console().readLine();
  System.out.println("Elige entre estas opciones: ");
  System.out.println("1. vertice hacia arriba");
  System.out.println("2. vertice hacia abajo");
  System.out.println("3. vertice hacia la derecha");
  System.out.println("4. vertice hacia la izquierda");
  int op= Integer.parseInt(System.console().readLine());
  switch(op){
    case 1:
    System.out.println("   "+car+"   ");
    System.out.println("  "+car+car+car+"  ");
    System.out.println(" "+car+car+car+car+car+" ");
    System.out.println(car+car+car+car+car+car+car);
    break;
    case 2:
    System.out.println(car+car+car+car+car+car+car);
    System.out.println(" "+car+car+car+car+car+" ");
    System.out.println("  "+car+car+car+"  ");
    System.out.println("   "+car+"   ");
    break;
    case 3:
    System.out.println(car);
    System.out.println(car+car);
    System.out.println(car+car+car);
    System.out.println(car+car+car+car);
    System.out.println(car+car+car);
    System.out.println(car+car);
    System.out.println(car);
    break;
    case 4:
    System.out.println("   "+car);
    System.out.println("  "+car+car);
    System.out.println(" "+car+car+car);
    System.out.println(car+car+car+car);
    System.out.println(" "+car+car+car);
    System.out.println("  "+car+car);
    System.out.println("   "+car);
    break;
  }
}
}
