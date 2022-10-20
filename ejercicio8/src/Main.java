public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();// Creacion de objeto persona en el main

        //Utilizacion de get y set
        persona.setNombre("Boris Guiñez");
        persona.setEdad(43);
        persona.setTelefono("78994541");
        // Impresion de datos por consola
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Telefono: " + persona.getTelefono());
    }
}

class Persona{ // Creacion de clase Persona
    // Creacion de variables
    private String nombre;
    private int edad;
    private String telefono;

    //Creacion de gets y sets de cada propiedad
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getTelefono(){
        return this.telefono;
    }
}