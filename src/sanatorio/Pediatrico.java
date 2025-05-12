package sanatorio;

public class Pediatrico extends Paciente {

    private double peso;
    private String celular;
    private String tutor;
    private String dieta; 

    public Pediatrico(String nombre, String dni, String obraSocial, double peso, String celular, String tutor, String dieta) {
        super(nombre, dni, obraSocial);
        this.peso = peso;
        this.celular = celular;
        this.tutor = tutor;
        this.dieta = dieta; 
    }

    //
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public String getDieta() {
        return dieta; 
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    @Override
    public String obtenerInformacion() {
        return super.obtenerInformacion() + "\nPeso: " + peso + "\nCelular: " + celular + "\nTutor: " + tutor + "\nDieta: " + dieta;
    }
}
