
package retosoftka;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class RetoSoftka {
    
    static Scanner lectura= new Scanner(System.in);
    static String opcion = "1";
    static String nombre;
    static int puntuacion=0,nivel=1;
    
    public static void main(String[] args) {
        //Declaración de variables
        Respuestas res[];
        Preguntas preg = new Preguntas();
        
        Random numAleatorio = new Random();
        int aleatorio;
        //Se obtienen las preguntas por nivel de la clase preguntas
        Preguntas  nivel1[];
        nivel1 = preg.nivel1();
        
        Preguntas nivel2[];
        nivel2 = preg.nivel2();
        
        Preguntas nivel3[];
        nivel3 = preg.nivel3();
        
        Preguntas nivel4[];
        nivel4 = preg.nivel4();
        
        Preguntas nivel5[];
        nivel5 = preg.nivel5();
        //Menú
        while(!opcion.equals("0")) {
            try{
              //Se empieza en el nivel 1 por defecto y este va subiendo si se responde correctamente.
              //El primer switch detecta en qué nivel se encuentra y en base a esto muestra las preguntas correspondientes a este nivel.
              switch (nivel) {
                case 1:
                    aleatorio = numAleatorio.nextInt(5);
                    res = nivel1[aleatorio].getRespuestas();
                    opcion = JOptionPane.showInputDialog(null,"************************\nPuntuación: "+puntuacion+"\nPrimera ronda"+
                        "\n"+nivel1[aleatorio].getPregunta()+
                        "\nA. "+res[0].getRespuesta()+
                        "\nB. "+res[1].getRespuesta()+
                        "\nC. "+res[2].getRespuesta()+
                        "\nD. "+res[3].getRespuesta()+
                        "\n0.Salir");
                    //Se llama el método que verifica si la opcion seleccionada es la correcta o no.
                    correcta(res);
                    break;
            case 2:
                aleatorio = numAleatorio.nextInt(5);
                res = nivel2[aleatorio].getRespuestas();
                opcion = JOptionPane.showInputDialog(null,"************************\nPuntuación: "+puntuacion+"\nSegunda ronda"+
                    "\n"+nivel2[aleatorio].getPregunta()+
                    "\nA. "+res[0].getRespuesta()+
                    "\nB. "+res[1].getRespuesta()+
                    "\nC. "+res[2].getRespuesta()+
                    "\nD. "+res[3].getRespuesta()+
                    "\n0.Salir");
                correcta(res);
                break;
            case 3:
                aleatorio = numAleatorio.nextInt(5);
                res = nivel3[aleatorio].getRespuestas();
                opcion = JOptionPane.showInputDialog(null,"************************\nPuntuación: "+puntuacion+"\nTercera ronda"+
                    "\n"+nivel3[aleatorio].getPregunta()+
                    "\nA. "+res[0].getRespuesta()+
                    "\nB. "+res[1].getRespuesta()+
                    "\nC. "+res[2].getRespuesta()+
                    "\nD. "+res[3].getRespuesta()+
                    "\n0.Salir");
                correcta(res);
                break;
            case 4:
                aleatorio = numAleatorio.nextInt(5);
                res = nivel4[aleatorio].getRespuestas();
                opcion = JOptionPane.showInputDialog(null,"************************\nPuntuación: "+puntuacion+"\nCuarta ronda"+
                    "\n"+nivel4[aleatorio].getPregunta()+
                    "\nA. "+res[0].getRespuesta()+
                    "\nB. "+res[1].getRespuesta()+
                    "\nC. "+res[2].getRespuesta()+
                    "\nD. "+res[3].getRespuesta()+
                    "\n0.Salir");
                correcta(res);
                break;
            case 5:
                aleatorio = numAleatorio.nextInt(5);
                res = nivel5[aleatorio].getRespuestas();
                opcion = JOptionPane.showInputDialog(null,"************************\nPuntuación: "+puntuacion+"\nQuinta ronda"+
                    "\n"+nivel5[aleatorio].getPregunta()+
                    "\nA. "+res[0].getRespuesta()+
                    "\nB. "+res[1].getRespuesta()+
                    "\nC. "+res[2].getRespuesta()+
                    "\nD. "+res[3].getRespuesta()+
                    "\n0.Salir");
                correcta(res);
                break;
            case 6:
                if (puntuacion==15000) {
                    JOptionPane.showMessageDialog(null,"¡Felicitaciones, Ganaste el juego¡");
                }
                nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre para registrar su puntuación");
                opcion="0";
                break;
            default:
                throw new AssertionError();
            }
           if(opcion.equals("0") && puntuacion!=15000) nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre para registrar su puntuación");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Opcion Incorrecta");
        }
        }
    }
    
    //Metodo para verificar si una respuesta es correcta o no.
    static private void correcta(Respuestas res[]){
        switch (opcion) {
                    case "A":
                        if (res[0].isCorrecta()){
                            //Se calcula la puntuación dependiendo del nivel.
                            puntuacion();
                            nivel++;
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Respuesta incorrecta. Juego Terminado");
                            opcion = "0";
                        }
                        break;
                    case "B":
                        if (res[1].isCorrecta()){
                            puntuacion();
                            nivel++;
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Respuesta incorrecta. Juego Terminado");
                            opcion = "0";
                        }
                        break;
                    case "C":
                        if (res[2].isCorrecta()){
                            puntuacion();
                            nivel++;
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Respuesta incorrecta. Juego Terminado");
                            opcion = "0";
                        }
                        break;
                    case "D":
                        if (res[3].isCorrecta()){
                            puntuacion();
                            nivel++;
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Respuesta incorrecta. Juego Terminado");
                            opcion="0";
                        }
                        break;
                    default:
                        break;
        }
    }
    
    //Metodo para calcular la puntuacion si una respuesta es correcta.
    static private void puntuacion(){
        switch (nivel) {
            case 1:
                JOptionPane.showMessageDialog(null,"¡Respuesta Correcta!. Ganaste 1000 puntos");
                puntuacion = puntuacion+1000;
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"¡Respuesta Correcta!. Ganaste 2000 puntos");
                puntuacion = puntuacion+2000;
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"¡Respuesta Correcta!. Ganaste 3000 puntos");
                puntuacion = puntuacion+3000;
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"¡Respuesta Correcta!. Ganaste 4000 puntos");
                puntuacion = puntuacion+4000;
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"¡Respuesta Correcta!. Ganaste 5000 puntos");
                puntuacion = puntuacion+5000;
                break;
            default:
                throw new AssertionError();
        }
    }
}
