package paquete4;

import paquete2.Prestamo;
import paquete5.Persona;
import paquete6.InstitucionEducativa;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo {

    private String nivelEstudio;
    private InstitucionEducativa centroEducativo;
    private double valorCarrera;
    private double valorMensualPagoPrestamoCarrera;

    public PrestamoEducativo() {
    }

    public PrestamoEducativo(Persona beneficiario, int tiempoPrestamo, String ciudadPrestamo, String nivelEstudio, InstitucionEducativa centroEducativo, double valorCarrera) {
        super(beneficiario, tiempoPrestamo, ciudadPrestamo);
        this.nivelEstudio = nivelEstudio;
        this.centroEducativo = centroEducativo;
        this.valorCarrera = valorCarrera;
    }

    public void calcularValorMensualPagoPrestamoCarrera() {
        valorMensualPagoPrestamoCarrera = ((valorCarrera / this.getTiempoPrestamo()) - (0.10 * valorCarrera / this.getTiempoPrestamo()));
    }

    @Override
    public String toString() {
        return super.toString()
                + "PrestamoEducativo{"
                + "nivelEstudio='" + nivelEstudio + '\''
                + ", centroEducativo=" + centroEducativo
                + ", valorCarrera=" + valorCarrera
                + ", valorMensualPagoPrestamoCarrera=" + valorMensualPagoPrestamoCarrera
                + '}';
    }
}
