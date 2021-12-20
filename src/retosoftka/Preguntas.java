
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
    
    public Preguntas[] nivel2(){
        //Declaración de variables
        
        Preguntas  nivel2[] = new Preguntas[5];
        Respuestas res1[]= new Respuestas[4];
        Respuestas res2[]= new Respuestas[4];
        Respuestas res3[]= new Respuestas[4];
        Respuestas res4[]= new Respuestas[4];
        Respuestas res5[]= new Respuestas[4];
        
        //Creación de las preguntas del primer nivel
        
        //Se asignan las diferentes respuestas a un vector de respuestas y este después es asignado a la pregunta correspondiente
        res1[0]= asignarRespuestas("Marte",false);
        res1[1]= asignarRespuestas("Mercurio",true);
        res1[2]= asignarRespuestas("Tierra",false);
        res1[3]= asignarRespuestas("Urano",false);
        Preguntas pregunta1= new Preguntas("¿Qué planeta es el más cercano al sol?","cultura",2,
        res1);
        nivel2[0]=pregunta1;
        
        
        res2[0]= asignarRespuestas("Olímpico",true);
        res2[1]= asignarRespuestas("Chilena",false);
        res2[2]= asignarRespuestas("Taco",false);
        res2[3]= asignarRespuestas("Asombroso",false);
        Preguntas pregunta2= new Preguntas("¿En fútbol, Cómo se le llama a un gol hecho desde un tiro de esquina?","deporte",2,
        res2);
        nivel2[1]=pregunta2;
        
        
        res3[0]= asignarRespuestas("1605",false);
        res3[1]= asignarRespuestas("1890",false);
        res3[2]= asignarRespuestas("564",false);
        res3[3]= asignarRespuestas("1492",true);
        Preguntas pregunta3= new Preguntas("¿En qué año llegó Cristóbal Colón a América?","historia",2,
        res3);
        nivel2[2]=pregunta3;
        
        res4[0]= asignarRespuestas("EUA",false);
        res4[1]= asignarRespuestas("Rusia",true);
        res4[2]= asignarRespuestas("Australia",false);
        res4[3]= asignarRespuestas("China",false);
        Preguntas pregunta4= new Preguntas("¿Cuál es el país más grande del mundo?","geografia",2,
        res4);
        nivel2[3]=pregunta4;
        
        res5[0]= asignarRespuestas("Tres lados iguales",false);
        res5[1]= asignarRespuestas("Dos lados iguales",true);
        res5[2]= asignarRespuestas("Un lado igual",false);
        res5[3]= asignarRespuestas("Ningún lado igual",false);
        Preguntas pregunta5= new Preguntas("¿Cúantos lados iguales tiene un triángulo isósceles","Matematicas",2,
        res5);
        nivel2[4]=pregunta5;
        
        return nivel2;
    }
    
    public Preguntas[] nivel3(){
        //Declaración de variables
        
        Preguntas  nivel3[] = new Preguntas[5];
        Respuestas res1[]= new Respuestas[4];
        Respuestas res2[]= new Respuestas[4];
        Respuestas res3[]= new Respuestas[4];
        Respuestas res4[]= new Respuestas[4];
        Respuestas res5[]= new Respuestas[4];
        
        //Creación de las preguntas del primer nivel
        
        //Se asignan las diferentes respuestas a un vector de respuestas y este después es asignado a la pregunta correspondiente
        res1[0]= asignarRespuestas("Duro,Líquido,Aire",false);
        res1[1]= asignarRespuestas("Solido,Aguado,Gaseoso",false);
        res1[2]= asignarRespuestas("Solido,Líquido,Gaseoso",true);
        res1[3]= asignarRespuestas("Gaseoso,Duro,Suave",false);
        Preguntas pregunta1= new Preguntas("¿Cuáles son los estados de la materia?","cultura",3,
        res1);
        nivel3[0]=pregunta1;
        
        
        res2[0]= asignarRespuestas("1",true);
        res2[1]= asignarRespuestas("3",false);
        res2[2]= asignarRespuestas("2",false);
        res2[3]= asignarRespuestas("4",false);
        Preguntas pregunta2= new Preguntas("¿Cuántos puntos vale un tiro libre en baloncesto?","deporte",3,
        res2);
        nivel3[1]=pregunta2;
        
        
        res3[0]= asignarRespuestas("La Juana, La Elizabeth, La Patricia",false);
        res3[1]= asignarRespuestas("La Sirena, Jean, La Olga",false);
        res3[2]= asignarRespuestas("La María, La Reina, La Niña",false);
        res3[3]= asignarRespuestas("La Pinta, La Niña, La Santa María",true);
        Preguntas pregunta3= new Preguntas("¿Cómo se llamaban las tres carabelas que fueron a América con Cristóbal Colón?","historia",3,
        res3);
        nivel3[2]=pregunta3;
        
        res4[0]= asignarRespuestas("EUA",false);
        res4[1]= asignarRespuestas("China",true);
        res4[2]= asignarRespuestas("Rusia",false);
        res4[3]= asignarRespuestas("India",false);
        Preguntas pregunta4= new Preguntas("¿Cuál es el país con mayor población del mundo?","geografia",3,
        res4);
        nivel3[3]=pregunta4;
        
        res5[0]= asignarRespuestas("Un número que se parece mucho a otro",false);
        res5[1]= asignarRespuestas("Un número que solo es divisible por uno o por sí mismo",true);
        res5[2]= asignarRespuestas("Un número que comparte decimal con otro",false);
        res5[3]= asignarRespuestas("Un número que es múltiplo de 2",false);
        Preguntas pregunta5= new Preguntas("¿Qué es un número primo?","Matematicas",1,
        res5);
        nivel3[4]=pregunta5;
        
        return nivel3;
    }
    public Preguntas[] nivel4(){
        //Declaración de variables
        
        Preguntas  nivel4[] = new Preguntas[5];
        Respuestas res1[]= new Respuestas[4];
        Respuestas res2[]= new Respuestas[4];
        Respuestas res3[]= new Respuestas[4];
        Respuestas res4[]= new Respuestas[4];
        Respuestas res5[]= new Respuestas[4];
        
        //Creación de las preguntas del primer nivel
        
        //Se asignan las diferentes respuestas a un vector de respuestas y este después es asignado a la pregunta correspondiente
        res1[0]= asignarRespuestas("Marte",false);
        res1[1]= asignarRespuestas("Venus",false);
        res1[2]= asignarRespuestas("Tierra",true);
        res1[3]= asignarRespuestas("Jupiter",false);
        Preguntas pregunta1= new Preguntas("Tercer planeta en el sistema solar","cultura",4,
        res1);
        nivel4[0]=pregunta1;
        
        
        res2[0]= asignarRespuestas("Baloncesto",true);
        res2[1]= asignarRespuestas("Fútbol",false);
        res2[2]= asignarRespuestas("Golf",false);
        res2[3]= asignarRespuestas("Beisbol",false);
        Preguntas pregunta2= new Preguntas("¿Qué deporte practicaba Michael Jordan?","deporte",4,
        res2);
        nivel4[1]=pregunta2;
        
        
        res3[0]= asignarRespuestas("1935",false);
        res3[1]= asignarRespuestas("1945",false);
        res3[2]= asignarRespuestas("1938",false);
        res3[3]= asignarRespuestas("1939",true);
        Preguntas pregunta3= new Preguntas("¿En qué año comenzó la II Guerra Mundial?","historia",4,
        res3);
        nivel4[2]=pregunta3;
        
        res4[0]= asignarRespuestas("Euro",false);
        res4[1]= asignarRespuestas("Libra",true);
        res4[2]= asignarRespuestas("Peso",false);
        res4[3]= asignarRespuestas("Dolar",false);
        Preguntas pregunta4= new Preguntas("¿Cuál es la moneda del reino unido?","geografia",4,
        res4);
        nivel4[3]=pregunta4;
        
        res5[0]= asignarRespuestas("85",false);
        res5[1]= asignarRespuestas("45",true);
        res5[2]= asignarRespuestas("30",false);
        res5[3]= asignarRespuestas("55",false);
        Preguntas pregunta5= new Preguntas("Si 50 es el 100%, ¿Cuánto es el 90%?","Matematicas",4,
        res5);
        nivel4[4]=pregunta5;
        
        return nivel4;
    }
    
    public Preguntas[] nivel5(){
        //Declaración de variables
        
        Preguntas  nivel5[] = new Preguntas[5];
        Respuestas res1[]= new Respuestas[4];
        Respuestas res2[]= new Respuestas[4];
        Respuestas res3[]= new Respuestas[4];
        Respuestas res4[]= new Respuestas[4];
        Respuestas res5[]= new Respuestas[4];
        
        //Creación de las preguntas del primer nivel
        
        //Se asignan las diferentes respuestas a un vector de respuestas y este después es asignado a la pregunta correspondiente
        res1[0]= asignarRespuestas("Higado",false);
        res1[1]= asignarRespuestas("Riñones",false);
        res1[2]= asignarRespuestas("Páncreas",true);
        res1[3]= asignarRespuestas("Pulmones",false);
        Preguntas pregunta1= new Preguntas("¿En qué lugar del cuerpo se produce la insulina?","cultura",5,
        res1);
        nivel5[0]=pregunta1;
        
        
        res2[0]= asignarRespuestas("Nottingham Forest",true);
        res2[1]= asignarRespuestas("Barcelona",false);
        res2[2]= asignarRespuestas("Real Madrid",false);
        res2[3]= asignarRespuestas("Liverpool",false);
        Preguntas pregunta2= new Preguntas("Equipo ganador de la copa de europa en 1978/79","deporte",5,
        res2);
        nivel5[1]=pregunta2;
        
        
        res3[0]= asignarRespuestas("1917",false);
        res3[1]= asignarRespuestas("1830",false);
        res3[2]= asignarRespuestas("1630",false);
        res3[3]= asignarRespuestas("1789",true);
        Preguntas pregunta3= new Preguntas("¿En qué año empezó la revolución francesa?","historia",5,
        res3);
        nivel5[2]=pregunta3;
        
        res4[0]= asignarRespuestas("España",false);
        res4[1]= asignarRespuestas("Polonia",true);
        res4[2]= asignarRespuestas("Francia",false);
        res4[3]= asignarRespuestas("Portugal",false);
        Preguntas pregunta4= new Preguntas("¿A qué país pertenece la ciudad de Varsovia?","geografia",5,
        res4);
        nivel5[3]=pregunta4;
        
        res5[0]= asignarRespuestas("Resolver integrales",false);
        res5[1]= asignarRespuestas("Cálculo de probabilidades",true);
        res5[2]= asignarRespuestas("Resolver Derivadas",false);
        res5[3]= asignarRespuestas("Ecuaciones Diferenciales",false);
        Preguntas pregunta5= new Preguntas(" La campana de Gauss está asociada a…","Matematicas",5,
        res5);
        nivel5[4]=pregunta5;
        
        return nivel5;
    }
    
    private Respuestas asignarRespuestas(String respuesta,boolean correcto){
        Respuestas resp = new Respuestas(respuesta,correcto);
        return resp;
    }
}
