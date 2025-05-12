package sanatorio;

public class Administracion {
    public static void mostrarDatos(Paciente paciente) {
        System.out.println("Nombre: " + paciente.nombre);
        System.out.println("DNI: " + paciente.dni);
        System.out.println("Cobertura OS: " + paciente.getCoberturaObraSocial());
        System.out.println("Descuento: " + paciente.getDescuento() + "%");
        System.out.println("Vademecum: " + paciente.getVademecum());
        System.out.println("-------------");
    }
}