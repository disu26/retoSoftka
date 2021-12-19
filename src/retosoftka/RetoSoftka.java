
package retosoftka;

import java.util.Random;
import java.util.Scanner;

public class RetoSoftka {

    public static void main(String[] args) {
        //Declaración de variables
        Respuestas res[] = new Respuestas[4];
        Preguntas preg = new Preguntas();
        Scanner lectura= new Scanner(System.in);
        int opcion=0;
        String seleccion;
        Random numAleatorio = new Random();
        int aleatorio;
        //Se obtienen las preguntas del primer nivel de la clase preguntas
        Preguntas  nivel1[] = new Preguntas[5];
        nivel1 = preg.nivel1();
        
        //Menú
        
        System.out.println("Primera Ronda");
        aleatorio = numAleatorio.nextInt(5);
        System.out.println(nivel1[aleatorio].getPregunta());
        res = nivel1[aleatorio].getRespuestas();
        System.out.println("A. "+res[0].getRespuesta());
        System.out.println("B. "+res[1].getRespuesta());
        System.out.println("C. "+res[2].getRespuesta());
        System.out.println("D. "+res[3].getRespuesta());
        seleccion=lectura.next();
        if(seleccion.equals("A")){
            if (res[0].isCorrecta()) System.out.println("¡Respuesta Correcta!, Ganaste 1000 puntos");
            else System.out.println("Respuesta incorrecta. Juego Terminado");
        }else if(seleccion.equals("B")){
            if (res[1].isCorrecta()) System.out.println("¡Respuesta Correcta!, Ganaste 1000 puntos");
            else System.out.println("Respuesta incorrecta. Juego Terminado");
        }else if(seleccion.equals("C")){
            if (res[2].isCorrecta()) System.out.println("¡Respuesta Correcta!, Ganaste 1000 puntos");
            else System.out.println("Respuesta incorrecta. Juego Terminado");
        }else if(seleccion.equals("D")){
            if (res[3].isCorrecta()) System.out.println("¡Respuesta Correcta!, Ganaste 1000 puntos");
            else System.out.println("Respuesta incorrecta. Juego Terminado");
        }
    }
}
