package sanatorio;

public class ClinicaMedica {

    public void recetarEstudios(Paciente paciente) {
        if (paciente instanceof Adulto) {
            System.out.println("Estudios para Adulto: Rx de tórax, Análisis de sangre");
        } else if (paciente instanceof Internado) {
            System.out.println("Estudios para Internado: Rx de abdomen, Perfil hepático");
        } else {
            System.out.println("El paciente no requiere estudios.");
        }
    }
}
