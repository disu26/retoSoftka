
package retosoftka;

public class Preguntas {
    String pregunta;
    String categoria;
    int dificultad;
    Respuestas respuestas[];
    
    
    public Preguntas() {
    }

    public Preguntas(String pregunta, String categoria, int dificultad,Respuestas[] res) {
        
        this.pregunta = pregunta;
        this.categoria = categoria;
        this.dificultad = dificultad;
        this.respuestas = res.clone();
    }
    
    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    public Respuestas[] getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(Respuestas[] respuestas) {
        this.respuestas = respuestas;
    }
    
    public Preguntas[] nivel1(){
        //Declaración de variables
        
        Preguntas  nivel1[] = new Preguntas[5];
        Respuestas res1[]= new Respuestas[4];
        Respuestas res2[]= new Respuestas[4];
        Respuestas res3[]= new Respuestas[4];
        Respuestas res4[]= new Respuestas[4];
        Respuestas res5[]= new Respuestas[4];
        
        //Creación de las preguntas del primer nivel
        
        //Se asignan las diferentes respuestas a un vector de respuestas y este después es asignado a la pregunta correspondiente
        res1[0]= asignarRespuestas("24",false);
        res1[1]= asignarRespuestas("45",false);
        res1[2]= asignarRespuestas("60",true);
        res1[3]= asignarRespuestas("100",false);
        Preguntas pregunta1= new Preguntas("¿Cuántos minutos tiene una hora?","cultura",1,
        res1);
        nivel1[0]=pregunta1;
        
        
        res2[0]= asignarRespuestas("Arquero",true);
        res2[1]= asignarRespuestas("Defensa",false);
        res2[2]= asignarRespuestas("Lateral",false);
        res2[3]= asignarRespuestas("Delantero",false);
        Preguntas pregunta2= new Preguntas("Persona encargada de que el equipo contrario no haga goles en el fútbol","deporte",1,
        res2);
        nivel1[1]=pregunta2;
        
        
        res3[0]= asignarRespuestas("Portugal",false);
        res3[1]= asignarRespuestas("España",false);
        res3[2]= asignarRespuestas("Inglaterra",false);
        res3[3]= asignarRespuestas("Grecia",true);
        Preguntas pregunta3= new Preguntas("¿Dónde se originaron los juegos olímpicos?","historia",1,
        res3);
        nivel1[2]=pregunta3;
        
        res4[0]= asignarRespuestas("Europa",false);
        res4[1]= asignarRespuestas("América",true);
        res4[2]= asignarRespuestas("África",false);
        res4[3]= asignarRespuestas("Asia",false);
        Preguntas pregunta4= new Preguntas("¿En qué continente se encuentra ecuador?","geografia",1,
        res4);
        nivel1[3]=pregunta4;
        
        res5[0]= asignarRespuestas("8",false);
        res5[1]= asignarRespuestas("4",true);
        res5[2]= asignarRespuestas("6",false);
        res5[3]= asignarRespuestas("3",false);
        Preguntas pregunta5= new Preguntas("¿Cuánto es 2+2?","Matematicas",1,
        res5);
        nivel1[4]=pregunta5;
        
        return nivel1;
    }
    
    private Respuestas asignarRespuestas(String respuesta,boolean correcto){
        Respuestas resp = new Respuestas(respuesta,correcto);
        return resp;
    }
}
