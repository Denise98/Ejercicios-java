/**
 * 
 *
 * 
 * @author Denise Burgos
 */

public class ejercicio16 {
  public static void main(String[] args) {
    int suma= 0;
    System.out.println("Vamos a hacer un test de infidelidad, por favor contesta con V o F");
    System.out.println("Tu pareja parece estar mas inquieta de lo normal sin motivo aparente ");
    String resp1=System.console().readLine();
    if (resp1.equals ("V")){
    suma= suma+3;
    System.out.println("Ha aumentado el gasto en vestuario ");
    String resp2= System.console().readLine();
    if (resp2.equals ("V")){
      suma= suma+3;
    }
    System.out.println("Ha perdido el interes que antes mostraba por ti ");
    String resp3= System.console().readLine();
    if (resp3.equals ("V")){
      suma= suma+3;
    }
    System.out.println("Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
    String resp4= System.console().readLine();
    if (resp4.equals ("V")){
      suma= suma+3;
    }
    System.out.println("No te deja que mires la agenda de su teléfono móvil");
    String resp5= System.console().readLine();
    if (resp5.equals ("V")){
      suma= suma+3;
    }
    System.out.println("A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
    String resp6= System.console().readLine();
    if (resp6.equals("V")){
      suma= suma+3;
    }
    System.out.println("Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
    String resp7= System.console().readLine();
    if (resp7.equals("V")){
      suma= suma+3;
    }
    System.out.println("Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
    String resp8= System.console().readLine();
    if (resp8.equals("V")){
      suma= suma+3;
    }
    System.out.println("Has notado que últimamente se perfuma más");
    String resp9= System.console().readLine();
    if(resp9.equals("V")){
      suma= suma+3;
    }
    System.out.println("Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
    String resp10= System.console().readLine();
    if (resp10.equals ("V")){
      suma= suma+3;
      }
    if ((suma>=0)&&(suma<=10)){
      System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
     } else if((suma>=11)&&(suma<=22)){
       System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
     } else if((suma>=23)&&(suma<=30)){
       System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
     }
      }
    }
  }

