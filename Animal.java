
package interfazaccioneshumanas;
// Clase Animal que implementa métodos de interfaces
public class Animal implements AccionGeneral
{
    String raza;
    // Métodos requeridos en la interfaz AccionesGeneral
    public void dormir()
    { 
        System.out.println("El animal de raza " + this.raza + " esta durmiendo");
    }
    public void alimentar() 
    { 
        System.out.println("El animal de raza " + this.raza + " se esta alimentaando"); 
    }
    public void jugar() 
    { 
        System.out.println("El animal de raza " + this.raza + " esta jugando");
    }
    public void desplazar()
    { 
        System.out.println("El animal de raza " + this.raza + " se esta desplazando");
    }
    // Métodos propios de Humano
    public void cazar() 
    { 
        System.out.println("El animal de raza " + this.raza + " esta cazando"); 
    }
    public String getRaza()
    {
        return raza;
    }
    public void setRaza(String raza)
    {
        this.raza = raza;
    }
}
