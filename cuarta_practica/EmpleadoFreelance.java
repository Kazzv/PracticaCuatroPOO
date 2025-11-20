package cuarta_practica;

public class EmpleadoFreelance extends Empleado implements Beneficiable {

    private int horasTrabajadas;
    private double tarifaHora;

    public EmpleadoFreelance(String nombre, String id,
                             int horasTrabajadas, double tarifaHora) {
        super(nombre, id, horasTrabajadas * tarifaHora);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    @Override
    public double calcularSalario() {
        double salarioBaseFreelance = horasTrabajadas * tarifaHora;
        return salarioBaseFreelance + calcularBonificacion();
    }

    @Override
    public double calcularBonificacion() {
        double salarioBaseFreelance = horasTrabajadas * tarifaHora;
        if (horasTrabajadas > 160) {
            return salarioBaseFreelance * 0.05;
        }
        return 0.0;
    }

    @Override
    public double aplicarDescuentoSeguro() {
        double salarioTotal = calcularSalario();
        return salarioTotal * 0.03;
    }
}

