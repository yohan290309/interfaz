package interfazaccioneshumanas;

import java.util.Scanner;

public class Interfaces
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Humano objHumano;
        Animal objAnimal;
        Hombre objHombre;

        objHumano = new Humano();
        objHumano.setDocumento(123456789);
        objHumano.razonar();
        // ...
        
        objAnimal = new Animal();
        objAnimal.setRaza("Perro");
        objAnimal.desplazar();
        objAnimal.jugar();
        
        objHombre = new Hombre();
        objHombre.documento = 987654321;
        objHombre.nombre = "Oscar";
        objHombre.dormir();
        System.out.println("El Hombre con documento " + objHombre.getDocumento() + " se llama " + objHombre.getNombre());
                
    }    
}