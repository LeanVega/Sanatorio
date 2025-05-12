package sanatorio;

public class Adulto extends Paciente {

    private double PA;
    private double altura;
    private double peso;

    public Adulto(String nombre, String dni, String obraSocial, double PA, double altura, double peso) {
        super(nombre, dni, obraSocial);
        this.PA = PA;
        this.altura = altura;
        this.peso = peso;
    }

    // Getters y setters
    public double getPA() {
        return PA;
    }

    public void setPA(double PA) {
        this.PA = PA;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String obtenerInformacion() {
        return super.obtenerInformacion() + "\nP.A: " + PA + "\nAltura: " + altura + "\nPeso: " + peso;
    }
}
