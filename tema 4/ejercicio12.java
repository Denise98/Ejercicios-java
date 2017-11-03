/**
 * 
 *
 * 
 * @author Denise Burgos
 */

public class ejercicio12 {
  public static void main(String[] args) {
    int suma= 0;
    System.out.println("¿Qué característica especial tiene el protagonista de kekkai sensen?: ");
    System.out.println( "a/ tiene unos ojos especiales          b/ tiene super poderes");
    System.out.println("c/ tiene super fuerza                  d/ tiene super oido");
    String resp1=System.console().readLine();
    if (resp1.equals ("a")){
    suma= suma+1;
    System.out.println("En danganronpa 3: Kibougamine Gakuen-Mirai-hen, ¿Quien parece estar muert@ pero no es asi?: ");
    System.out.println("a/Aoi Asahina            b/Chisa Yukizome");
    System.out.println("c/Kyoko Kirigiri         d/Ruruka Ando") ;
    String resp2= System.console().readLine();
    if (resp2.equals ("c")){
      suma= suma+1;
    }
    System.out.println("¿Por que Erza de Fairy Tail se apellida Scarlet?");
    System.out.println("a/porque sus padres se apellidaban asi     b/por como acababa tras las batallas");
    System.out.println("c/por la primera armadura que obtuvo       d/por el color de su pelo");
    String resp3= System.console().readLine();
    if (resp3.equals ("d")){
      suma= suma+1;
    }
    System.out.println("¿En que piso vence Kirito a Kayaba Akihiko?");
    System.out.println("a/50         b/75");
    System.out.println("c/85         d/100");
    String resp4= System.console().readLine();
    if (resp4.equals ("b")){
      suma= suma+1;
    }
    System.out.println("¿Como se llama la espada qu pierde zoro en Enies Lobby?");
    System.out.println("a/Shusui           b/Yabashiri");
    System.out.println("c/Wado Ichimonji   d/Sandai Kitetsu");
    String resp5= System.console().readLine();
    if (resp5.equals ("b")){
      suma= suma+1;
    }
    System.out.println("¿Como se llama la protagonista de Shigatsu wa kimi no uso?");
    System.out.println("a/Kaori Miyazono            b/Tsubaki Sawabe");
    System.out.println("c/Taishi Nakagawa           d/Kousei Arima");
    String resp6= System.console().readLine();
    if (resp6.equals("a")){
      suma= suma+1;
    }
    System.out.println("¿Cual de estos no es un Shonen?");
    System.out.println("a/Shokugeki no Soma          b/Kekkai sensen");
    System.out.println("c/Fate Stay Night            d/Nisekoi");
    String resp7= System.console().readLine();
    if (resp7.equals("c")){
      suma= suma+1;
    }
    System.out.println("¿Como se llama la autoproclamada archienemiga de Megumin en Konosuba?");
    System.out.println("a/Yunyun            b/Yinyin");
    System.out.println("c/Yayun              d/Yayin");
    String resp8= System.console().readLine();
    if (resp8.equals("a")){
      suma= suma+1;
    }
    System.out.println("¿Como se llama el personaje de Fullmetal Alchemist que convirtio a su hija en quimera?");
    System.out.println("a/Shou Turner           b/Gin Turner");
    System.out.println("c/Shou Tacker          d/Gin Tucker");
    String resp9= System.console().readLine();
    if(resp9.equals("c")){
      suma= suma+1;
    }
    System.out.println("¿Cual es el accesorio lleva siempre Chitoge Kirisaki de Nisekoi?");
    System.out.println("a/gafas              b/una pinza");
    System.out.println("c/una diadema        d/un lazo");
    String resp10= System.console().readLine();
    if (resp10.equals ("d")){
      suma= suma+1;
      }
    if (suma==10){
      System.out.println("Felicidades!! eres 100% otaku");
     } else{
       System.out.println("Tu puntuacion es: "+ suma);
     }
      }
      
    
  }
}

