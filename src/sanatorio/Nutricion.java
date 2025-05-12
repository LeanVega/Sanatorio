package sanatorio;

public class Nutricion {

    public void obtenerDietaPaciente(Paciente paciente) {
        if (paciente instanceof Pediatrico) {
            Pediatrico pediatrico = (Pediatrico) paciente;
            System.out.println("Dieta recomendada (Pediátrico): " + pediatrico.getDieta());
        } else if (paciente instanceof Internado) {
            Internado internado = (Internado) paciente;
            System.out.println("Dieta recomendada (Internado): " + internado.getDieta());
        } else {
            System.out.println("El paciente no tiene dieta recomendada.");
        }
    }
}
