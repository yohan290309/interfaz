
package interfazaccioneshumanas;
// Clase Humano que implementa métodos de interfaces
public class Humano implements AccionesHumanas, AccionGeneral
{
    long documento;
    // Métodos requeridos en la interfaz AccionesHumano
    @Override
    public void estudiar()
    { 
        System.out.println("El humano con documento " + this.documento + " esta estudiando"); 
    }
    @Override
    public void trabajar() 
    { 
        System.out.println("El humano con documento " + this.documento + " esta trabajando"); 
    }

    // Métodos requeridos en la interfaz AccionesGeneral 
    @Override
    public void dormir() 
    { 
        System.out.println("El humano con documento " + this.documento + " esta durmiendo");
    }
    @Override
    public void alimentar()
    {
        System.out.println("El humano con documento " + this.documento + " se esta alimentando");
    }
    @Override
    public void jugar()
    { 
        System.out.println("El humano con documento " + this.documento + " esta jugando");
    }
    @Override
    public void desplazar()
    { 
        System.out.println("El humano con documento " + this.documento + " se esta desplazando");
    }
    
    // Métodos propios de Humano
    public void razonar()
    { 
        System.out.println("El humano con documento " + this.documento + " esta razonando"); 
    }
    public long getDocumento()
    {
        return documento;
    }
    public void setDocumento(long documento)
    {
        this.documento = documento;
    }
}