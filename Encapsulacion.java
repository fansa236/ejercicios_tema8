
//  Ejercicio del tema 8: tarea para practicar la encasulación

public class Encapsulacion {

    public static void main(String[] args) {
        
        //  Creación del objeto persona (instancia de la clase Persona)

        Persona persona = new Persona();

        //  Uso de los Setters para asignar el valor a las propiedades

        persona.setEdad(50);
        persona.setNombre("Fernando");
        persona.setTelefono("+584246262323");

        //  Uso de los Getters para obtener el valor de las propiedades
        //  y salida por la consola (forma directa)

        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getTelefono());

    }
}

//  Creación de la clase Persona

class Persona {

    //  Declaración de las propiedades (variables) privadas de la clase

    private int edad;
    private String nombre;
    private String telefono;

    //  Sets y Gets de la variable edad

    public void setEdad(int valor) {
        this.edad = valor;
    }

    public int getEdad() {
        return this.edad;
    }

    //  Sets y Gets de la variable nombre

    public void setNombre(String valor) {
        this.nombre = valor;
    }

    public String getNombre() {
        return this.nombre;
    }

    //  Sets y Gets de la variable telefono

    public void setTelefono(String valor) {
        this.telefono = valor;
    }

    public String getTelefono() {
        return this.telefono;
    }


}