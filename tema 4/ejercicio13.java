/**
 * 
 *
 * 
 * @author Denise Burgos
 */

public class ejercicio13 {
  public static void main(String[] args) {
    System.out.println("Vamos a ordenar 3 numeros de mayor a menor");
    System.out.println("Por favor introduce el primer numero ");
    double a=Double.parseDouble(System.console().readLine());
    System.out.println("Introduce el segundo numero ");
    double b =Double.parseDouble(System.console().readLine());
    System.out.println("Introduce el tercer numero");
    double c=Double.parseDouble(System.console().readLine());
    if ((a>b)&&(b>c)){
      System.out.println(a+","+b+","+c);
    } else if((a>c)&&(c>b)){
      System.out.println(a+","+c+","+b);
    } else if((b>a)&&(a>c)){
      System.out.println(b+","+a+","+c);
    } else if ((b>c)&&(c>a)){
      System.out.println(b+","+c+","+a);
    } else if ((c>a)&&(a>b)){
      System.out.println(c+","+a+","+b);
    } else if ((c>b)&&(b>a)){
      System.out.println(c+","+b+","+c);
    }
  }
  }
