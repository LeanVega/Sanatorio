package sanatorio;

public class Nutricion {
    public static void recomendarDieta(Paciente paciente) {
        if (paciente instanceof Pediatrico) {
            System.out.println("Dieta recomendada (Pediátrico): " + ((Pediatrico) paciente).getDieta());
        } else if (paciente instanceof Internado) {
            System.out.println("Dieta recomendada (Internado): " + ((Internado) paciente).getDieta());
        }
    }
}