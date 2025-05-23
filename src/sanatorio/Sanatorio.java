package sanatorio;

public class Sanatorio {

    public static void main(String[] args) {
        //pacientes con dientas
        Pediatrico pediatrico = new Pediatrico("Lucía Something", "12345678", "OSDE - Plan Pediátrico", 12.5, "155555555", "Ana", "Dieta libre de gluten");
        Adulto adulto = new Adulto("Carlos Carlitos", "23456789", "Swiss Medical - Plan Adulto", 120, 1.75, 80);
        Internado internado = new Internado("Jorge Jorgeloooni", "34567890", "Galeno - Plan Internación", "12A", 130, "A+", "Dieta hiposódica y controlada");

        // departamentos
        Administracion administracion = new Administracion();
        Nutricion nutricion = new Nutricion();
        ClinicaMedica clinicaMedica = new ClinicaMedica();

        // info de los pacientes
        administracion.obtenerInformacionPaciente(pediatrico);
        administracion.obtenerInformacionPaciente(adulto);
        administracion.obtenerInformacionPaciente(internado);

        // obtener dietas
        nutricion.obtenerDietaPaciente(pediatrico);
        nutricion.obtenerDietaPaciente(internado);

        // recetar estudios
        clinicaMedica.recetarEstudios(adulto);
        clinicaMedica.recetarEstudios(internado);
    }
}
