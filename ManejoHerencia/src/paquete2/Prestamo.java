package paquete2;

import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class Prestamo {

    private Persona beneficiario;
    private int tiempoPrestamo;
    private String ciudadPrestamo;

    public Prestamo() {
    }

    public Prestamo(Persona beneficiario, int tiempoPrestamo, String ciudadPrestamo) {
        this.beneficiario = beneficiario;
        this.tiempoPrestamo = tiempoPrestamo;
        this.ciudadPrestamo = ciudadPrestamo.toLowerCase();
    }

    public Persona getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(Persona beneficiario) {
        this.beneficiario = beneficiario;
    }

    public int getTiempoPrestamo() {
        return tiempoPrestamo;
    }

    public void setTiempoPrestamo(int tiempoPrestamo) {
        this.tiempoPrestamo = tiempoPrestamo;
    }

    public String getCiudadPrestamo() {
        return ciudadPrestamo;
    }

    public void setCiudadPrestamo(String ciudadPrestamo) {
        this.ciudadPrestamo = ciudadPrestamo.toLowerCase();
    }

    @Override
    public String toString() {
        return "Prestamo{"
                + "beneficiario=" + beneficiario
                + ", tiempoPrestamo=" + tiempoPrestamo
                + ", ciudadPrestamo='" + ciudadPrestamo + '\''
                + '}';
    }
}
