
/**
 * Write a description of class Comida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comida
{
    // instance variables - replace the example below with your own
    private String nombre;
    private int calorias;

    /**
     * Constructor for objects of class Comida
     */
    public Comida(String Nombre, int Calorias)
    {
       nombre = Nombre;
       calorias = Calorias;
    }

    public String getNombreComida(){
    return nombre;
    }
    
    public int getCalorias(){
    return calorias;
    }
}
