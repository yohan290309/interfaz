
package interfazaccioneshumanas;


public class Hombre extends Humano 
{
    String nombre;
    
    // Constructores de la clase
    
    public Hombre(){}
    
    public Hombre(String nombre, long documento)
    {
        this.nombre = nombre;
    }
    
    // Métodos propios de Hombre
    public String getNombre()
    {
        return nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
}