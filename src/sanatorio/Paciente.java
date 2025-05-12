package sanatorio;

public class Paciente {
    private String nombre;
    private String dni;
    private String obraSocial;

    public Paciente(String nombre, String dni, String obraSocial) {
        this.nombre = nombre;
        this.dni = dni;
        this.obraSocial = obraSocial;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }

    public String obtenerInformacion() {
        return "Nombre: " + nombre + "\nDNI: " + dni + "\nCobertura OS: " + obraSocial;
    }
}
