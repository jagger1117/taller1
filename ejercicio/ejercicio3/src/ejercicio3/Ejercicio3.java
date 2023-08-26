package ejercicio3;
public class Ejercicio3 {
    public static void main(String[] args) {
        int horasTrabajadas = 48;
        double valorHora = 5000;
        double retencionPorcentaje = 12.5;

        double salarioBruto = horasTrabajadas * valorHora;
        double retencionFuente = (salarioBruto * retencionPorcentaje) / 100;
        double salarioNeto = salarioBruto - retencionFuente;

        System.out.println("Salario Bruto: " + salarioBruto);
        System.out.println("Retencion en la Fuente: " + retencionFuente);
        System.out.println("Salario Neto: " + salarioNeto);
    }
}