package sanatorio;

public class Pediatrico extends Paciente {
    private double peso;
    private String celular;
    private String tutor;

    public Pediatrico(String dni, String nombre, String obraSocial, double peso, String celular, String tutor) {
        super(dni, nombre, obraSocial);
        this.peso = peso;
        this.celular = celular;
        this.tutor = tutor;
    }

    @Override
    public String getCoberturaObraSocial() {
        return obraSocial + " - Plan Pediátrico";
    }

    @Override
    public double getDescuento() {
        return 15.0;
    }

    @Override
    public String getVademecum() {
        return "Paracetamol Infantil, Ibuprofeno Pediátrico";
    }

    public String getDieta() {
        return "Dieta blanda con alto contenido calórico";
    }
}