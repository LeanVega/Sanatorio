package sanatorio;

public class Internado extends Paciente {

    private String habitacion;
    private double PA;
    private String Rh;
    private String dieta;

    public Internado(String nombre, String dni, String obraSocial, String habitacion, double PA, String Rh, String dieta) {
        super(nombre, dni, obraSocial);
        this.habitacion = habitacion;
        this.PA = PA;
        this.Rh = Rh;
        this.dieta = dieta;
    }

    // gtts y sts
    public String getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    public double getPA() {
        return PA;
    }

    public void setPA(double PA) {
        this.PA = PA;
    }

    public String getRh() {
        return Rh;
    }

    public void setRh(String Rh) {
        this.Rh = Rh;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    @Override
    public String obtenerInformacion() {
        return super.obtenerInformacion() + "\nHabitación: " + habitacion + "\nP.A: " + PA + "\nRh: " + Rh + "\nDieta: " + dieta;
    }
}
