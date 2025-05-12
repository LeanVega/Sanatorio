package sanatorio;

public class ClinicaMedica {
    public static void recetarEstudios(Paciente paciente) {
        if (paciente instanceof Adulto) {
            System.out.println("Estudios para Adulto: " + ((Adulto) paciente).getEstudios());
        } else if (paciente instanceof Internado) {
            System.out.println("Estudios para Internado: " + ((Internado) paciente).getEstudios());
        }
    }
}