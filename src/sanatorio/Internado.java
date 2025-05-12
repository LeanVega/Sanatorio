package sanatorio;

public class Internado extends Paciente {
    private String habitacion;
    private int presionArterial;
    private String rh;

    public Internado(String dni, String nombre, String obraSocial, String habitacion, int presionArterial, String rh) {
        super(dni, nombre, obraSocial);
        this.habitacion = habitacion;
        this.presionArterial = presionArterial;
        this.rh = rh;
    }

    @Override
    public String getCoberturaObraSocial() {
        return obraSocial + " - Plan Internación";
    }

    @Override
    public double getDescuento() {
        return 20.0;
    }

    @Override
    public String getVademecum() {
        return "Antibióticos, Analgésicos, Anticoagulantes";
    }

    public String getDieta() {
        return "Dieta hiposódica y controlada";
    }

    public String getEstudios() {
        return "Rx de abdomen, Perfil hepático";
    }
}