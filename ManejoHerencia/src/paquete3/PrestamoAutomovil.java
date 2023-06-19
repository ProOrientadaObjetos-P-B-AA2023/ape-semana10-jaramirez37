package paquete3;

import paquete2.Prestamo;
import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo {

    private String tipoAutomovil;
    private String marcaAutomovil;
    private Persona garante1;
    private double valorAutomovil;
    private double valorMensualPagoPrestamoAutomovil;

    public PrestamoAutomovil() {
    }

    public PrestamoAutomovil(Persona beneficiario, int tiempoPrestamo, String ciudadPrestamo, String tipoAutomovil, String marcaAutomovil, Persona garante1, double valorAutomovil) {
        super(beneficiario, tiempoPrestamo, ciudadPrestamo);
        this.tipoAutomovil = tipoAutomovil;
        this.marcaAutomovil = marcaAutomovil;
        this.garante1 = garante1;
        this.valorAutomovil = valorAutomovil;
    }

    public void calcularvalorMensualPagoPrestamoAutomovil() {
        valorMensualPagoPrestamoAutomovil = valorAutomovil / this.getTiempoPrestamo();
    }

    @Override
    public String toString() {
        return super.toString()
                + "PrestamoAutomovil{"
                + "tipoAutomovil='" + tipoAutomovil + '\''
                + ", marcaAutomovil='" + marcaAutomovil + '\''
                + ", garante1=" + garante1
                + ", valorAutomovil=" + valorAutomovil
                + ", valorMensualPagoPrestamoAutomovil=" + valorMensualPagoPrestamoAutomovil
                + '}';
    }
}
