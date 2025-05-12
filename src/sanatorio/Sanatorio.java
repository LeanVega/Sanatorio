package sanatorio;

public class Sanatorio {
    public static void main(String[] args) {
        Pediatrico p1 = new Pediatrico("12345678", "Lucía", "OSDE", 35.5, "1123456789", "María");
        Adulto a1 = new Adulto("23456789", "Carlos", "Swiss Medical", 120, 1.75, 80.0);
        Internado i1 = new Internado("34567890", "Jorge", "Galeno", "A101", 110, "B+");

        Administracion.mostrarDatos(p1);
        Administracion.mostrarDatos(a1);
        Administracion.mostrarDatos(i1);

        System.out.println();

        Nutricion.recomendarDieta(p1);
        Nutricion.recomendarDieta(i1);

        System.out.println();

        ClinicaMedica.recetarEstudios(a1);
        ClinicaMedica.recetarEstudios(i1);
    }
}