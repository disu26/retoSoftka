
package retosoftka;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class RetoSoftka {
    static Scanner lectura= new Scanner(System.in);
    static String opcion = "1";
    static String nombre;
    public static void main(String[] args) {
        //Declaración de variables
        Respuestas res[];
        Preguntas preg = new Preguntas();
        
        int puntuacion=0,nivel=1;
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
                    switch (opcion) {
                        case "A":
                            if (res[0].isCorrecta()){
                                JOptionPane.showMessageDialog(null,"¡Respuesta Correcta!. Ganaste 1000 puntos");
                                puntuacion=puntuacion+1000;
                                nivel++;
                            }
                            else{
                                JOptionPane.showMessageDialog(null,"Respuesta incorrecta. Juego Terminado");
                                opcion="0";
                            }
                            break;
                        case "B":
                            if (res[1].isCorrecta()){
                                JOptionPane.showMessageDialog(null,"¡Respuesta Correcta!. Ganaste 1000 puntos");
                                puntuacion = puntuacion+1000;
                                nivel++;
                            }
                            else{
                                JOptionPane.showMessageDialog(null,"Respuesta incorrecta. Juego Terminado");
                                opcion = "0";
                            }
                            break;
                        case "C":
                            if (res[2].isCorrecta()){
                                JOptionPane.showMessageDialog(null,"¡Respuesta Correcta!. Ganaste 1000 puntos");
                                puntuacion = puntuacion+1000;
                                nivel++;
                            }
                            else{
                                JOptionPane.showMessageDialog(null,"Respuesta incorrecta. Juego Terminado");
                                opcion = "0";
                            }
                            break;
                        case "D":
                            if (res[3].isCorrecta()){
                                JOptionPane.showMessageDialog(null,"¡Respuesta Correcta!. Ganaste 1000 puntos");
                                puntuacion = puntuacion+1000;
                                nivel++;
                            }
                            else{
                                JOptionPane.showMessageDialog(null,"Respuesta incorrecta. Juego Terminado");
                                opcion = "0";
                            }
                            break;
                        default:
                            break;
                    }
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
                switch (opcion) {
                    case "A":
                        if (res[0].isCorrecta()){
                            JOptionPane.showMessageDialog(null,"¡Respuesta Correcta!.¿¿ Ganaste 2000 puntos");
                            puntuacion = puntuacion+2000;
                            nivel++;
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Respuesta incorrecta. Juego Terminado");
                            opcion = "0";
                        }
                        break;
                    case "B":
                        if (res[1].isCorrecta()){
                            JOptionPane.showMessageDialog(null,"¡Respuesta Correcta!. Ganaste 2000 puntos");
                            puntuacion = puntuacion+2000;
                            nivel++;
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Respuesta incorrecta. Juego Terminado");
                            opcion = "0";
                        }
                        break;
                    case "C":
                        if (res[2].isCorrecta()){
                            JOptionPane.showMessageDialog(null,"¡Respuesta Correcta!,¿. Ganaste 2000 puntos");
                            puntuacion = puntuacion+2000;
                            nivel++;
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Respuesta incorrecta. Juego Terminado");
                            opcion = "0";
                        }
                        break;
                    case "D":
                        if (res[3].isCorrecta()){
                            JOptionPane.showMessageDialog(null,"¡Respuesta Correcta!. Ganaste 2000 puntos");
                            puntuacion = puntuacion+2000;
                            nivel++;
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Respuesta incorrecta. Juego Terminado");
                            opcion = "0";
                        }
                        break;
                    default:
                        break;
                }
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
                switch (opcion) {
                    case "A":
                        if (res[0].isCorrecta()){
                            JOptionPane.showMessageDialog(null,"¡Respuesta Correcta!. Ganaste 3000 puntos");
                            puntuacion=puntuacion+3000;
                            nivel++;
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Respuesta incorrecta. Juego Terminado");
                            opcion = "0";
                        }
                        break;
                    case "B":
                        if (res[1].isCorrecta()){
                            JOptionPane.showMessageDialog(null,"¡Respuesta Correcta!. Ganaste 3000 puntos");
                            puntuacion = puntuacion+3000;
                            nivel++;
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Respuesta incorrecta. Juego Terminado");
                            opcion = "0";
                        }
                        break;
                    case "C":
                        if (res[2].isCorrecta()){
                            JOptionPane.showMessageDialog(null,"¡Respuesta Correcta!. Ganaste 3000 puntos");
                            puntuacion = puntuacion+3000;
                            nivel++;
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Respuesta incorrecta. Juego Terminado");
                            opcion = "0";
                        }
                        break;
                    case "D":
                        if (res[3].isCorrecta()){
                            JOptionPane.showMessageDialog(null,"¡Respuesta Correcta!. Ganaste 3000 puntos");
                            puntuacion = puntuacion+3000;
                            nivel++;
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Respuesta incorrecta. Juego Terminado");
                            opcion = "0";
                        }
                        break;
                    default:
                        break;
                }
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
                switch (opcion) {
                    case "A":
                        if (res[0].isCorrecta()){
                            JOptionPane.showMessageDialog(null,"¡Respuesta Correcta!. Ganaste 4000 puntos");
                            puntuacion = puntuacion+4000;
                            nivel++;
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Respuesta incorrecta. Juego Terminado");
                            opcion = "0";
                        }
                        break;
                    case "B":
                        if (res[1].isCorrecta()){
                            JOptionPane.showMessageDialog(null,"¡Respuesta Correcta!. Ganaste 4000 puntos");
                            puntuacion = puntuacion+4000;
                            nivel++;
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Respuesta incorrecta. Juego Terminado");
                            opcion = "0"; 
                        }
                        break;
                    case "C":
                        if (res[2].isCorrecta()){
                            JOptionPane.showMessageDialog(null,"¡Respuesta Correcta!. Ganaste 4000 puntos");
                            puntuacion = puntuacion+4000;
                            nivel++;
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Respuesta incorrecta. Juego Terminado");
                            opcion = "0";
                        }
                        break;
                    case "D":
                        if (res[3].isCorrecta()){
                            JOptionPane.showMessageDialog(null,"¡Respuesta Correcta!. Ganaste 4000 puntos");
                            puntuacion = puntuacion+4000;
                            nivel++;
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Respuesta incorrecta. Juego Terminado");
                            opcion = "0";
                        }
                        break;
                    default:
                        break;
                }
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
                switch (opcion) {
                    case "A":
                        if (res[0].isCorrecta()){
                            JOptionPane.showMessageDialog(null,"¡Respuesta Correcta!. Ganaste 5000 puntos");
                            puntuacion = puntuacion+5000;
                            nivel++;
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Respuesta incorrecta. Juego Terminado");
                            opcion = "0";
                        }
                        break;
                    case "B":
                        if (res[1].isCorrecta()){
                            JOptionPane.showMessageDialog(null,"¡Respuesta Correcta!. Ganaste 5000 puntos");
                            puntuacion = puntuacion+5000;
                            nivel++;
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Respuesta incorrecta. Juego Terminado");
                            opcion = "0";
                        }
                        break;
                    case "C":
                        if (res[2].isCorrecta()){
                            JOptionPane.showMessageDialog(null,"¡Respuesta Correcta!. Ganaste 5000 puntos");
                            puntuacion = puntuacion+5000;
                            nivel++;
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Respuesta incorrecta. Juego Terminado");
                            opcion = "0";
                        }
                        break;
                    case "D":
                        if (res[3].isCorrecta()){
                            JOptionPane.showMessageDialog(null,"¡Respuesta Correcta!. Ganaste 5000 puntos");
                            puntuacion=puntuacion+5000;
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
}
