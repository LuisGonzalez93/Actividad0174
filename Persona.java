
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
    // instance variables - replace the example below with your own
    private String nombrePersona;
    private int peso;
    private int altura;
    private int edad;
    private int caloriasIngeridas;
    private boolean hombre;
    private Comida comida;
    private int metabolismoBasal;
    private boolean sobrecargado;
    /**
     * Introduce los datos de Persona
     */
    public Persona(String Nombre,boolean Hombre,int Peso,int Altura,int Edad)
    {
        nombrePersona = Nombre;
        peso = Peso;
        altura = Altura;
        edad = Edad;
        caloriasIngeridas = 0;
        hombre = Hombre;
        sobrecargado = false;
           if(hombre == true){
            metabolismoBasal= (10*peso)+(6*altura)+(5*edad)+5;}
            else{
            metabolismoBasal= (10*peso)+(6*altura)+(5*edad)-161;
            }
    }

    public int comer(Comida comida){
        int ingerir = -1;
        int caloriaComida = comida.getCalorias();
        if(hombre == true && comida!=null){
            if(metabolismoBasal>=caloriasIngeridas){
                ingerir = caloriaComida;
                caloriasIngeridas = caloriasIngeridas + caloriaComida;
                
            }
        }
        if(hombre == false && comida!=null){
            if(metabolismoBasal>=caloriasIngeridas){
                ingerir = caloriaComida;
                caloriasIngeridas = caloriasIngeridas + caloriaComida;
                
            }
        }         
        while(metabolismoBasal<=caloriasIngeridas){
        sobrecargado = true;
        }
        return ingerir;
    }

    public int getCaloriasIngeridas(){
        return caloriasIngeridas;
    }

    public String contestar(String pregunta){
        String respuesta = "";
        
        if((pregunta.length()%3)==0 && sobrecargado == false){
            respuesta="SI";
        }
        if((pregunta.length()%3)!=0 && sobrecargado == false){
            respuesta="NO";
        }
        if(pregunta.contains(nombrePersona)||sobrecargado == true){
            respuesta = pregunta.toUpperCase();
            System.out.println(pregunta.toUpperCase());
        }
       
        return respuesta;
    }
}
