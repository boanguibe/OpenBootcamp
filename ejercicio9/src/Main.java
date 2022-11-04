public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nombre = "Katherine Pedraza";
        cliente.edad = 41;
        cliente.telefono = "+56 9 98862554";
        cliente.credito = 500000;
        System.out.println("Cliente: " + cliente.nombre + " Edad: " + cliente.edad + " Telefono: " + cliente.telefono);
        System.out.println("Total de Credito: " + cliente.credito);

        Trabajador trabajador1 = new Trabajador();
        trabajador1.nombre = "Boris Guiñez";
        trabajador1.edad = 43;
        trabajador1.telefono = "+56 9 78995445";
        trabajador1.salario = 1500000;
        System.out.println("Trabajador: " + trabajador1.nombre + " Edad: " + trabajador1.edad + " Telefono: " + trabajador1.telefono);
        System.out.println("Total de Salario: " + trabajador1.salario);
    }
}

class Persona {
    String nombre;
    int edad;
    String telefono;
}
class Cliente extends Persona{
    int credito;
}
class Trabajador extends Persona{
    int salario;
}