package cuarta_practica;

public class Main {
    public static void main(String[] args) {

        EmpleadoTiempoCompleto emp1 = new EmpleadoTiempoCompleto(
                "Carlos", "01", 1500, 1, "Desarrollo"
        );

        EmpleadoFreelance emp2 = new EmpleadoFreelance(
                "Diana", "02", 560, 40
        );


        System.out.println(" Empleado Tiempo Completo ");
        emp1.mostrarInfo();
        System.out.println("Bonificación: " + emp1.calcularBonificacion());
        System.out.println("Descuento Seguro: " + emp1.aplicarDescuentoSeguro());
        System.out.println("Salario Total: " + emp1.calcularSalario());

        System.out.println("\nEmpleado Freelance ");
        emp2.mostrarInfo();
        System.out.println("Bonificación: " + emp2.calcularBonificacion());
        System.out.println("Descuento Seguro: " + emp2.aplicarDescuentoSeguro());
        System.out.println("Salario Total: " + emp2.calcularSalario());
    }
}

