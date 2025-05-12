package sanatorio;

public class Adulto extends Paciente {
    private int presionArterial;
    private double altura;
    private double peso;

    public Adulto(String dni, String nombre, String obraSocial, int presionArterial, double altura, double peso) {
        super(dni, nombre, obraSocial);
        this.presionArterial = presionArterial;
        this.altura = altura;
        this.peso = peso;
    }

    @Override
    public String getCoberturaObraSocial() {
        return obraSocial + " - Plan Adulto";
    }

    @Override
    public double getDescuento() {
        return 10.0;
    }

    @Override
    public String getVademecum() {
        return "Paracetamol, Enalapril, Amoxicilina";
    }

    public String getEstudios() {
        return "Rx de tórax, Análisis de sangre";
    }
}