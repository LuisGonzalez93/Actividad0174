
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
    }

    public int comer(Comida comida){
        int ingerir = -1;
        int caloriaComida = comida.getCalorias();
        if(hombre == true && comida!=null){
            if((10*peso)+(6*altura)+(5*edad)+5>=caloriasIngeridas){
                ingerir = caloriaComida;
                caloriasIngeridas = caloriasIngeridas + caloriaComida;
            }
                    }
        if(hombre == false && comida!=null){
            if((10*peso)+(6*altura)+(5*edad)-161>=caloriasIngeridas){
                ingerir = caloriaComida;
                caloriasIngeridas = caloriasIngeridas + caloriaComida;
            }
                    }         
                   
        return ingerir;
    }

    public int getCaloriasIngeridas(){
        return caloriasIngeridas;
    }
}
