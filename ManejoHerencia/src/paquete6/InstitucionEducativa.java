package paquete6;

public class InstitucionEducativa {

    private String nombre;
    private String siglas;

    public InstitucionEducativa(String nombre, String siglas) {
        this.nombre = nombre;
        this.siglas = siglas;
    }

    @Override
    public String toString() {
        return "InstituciónEducativa{"
                + "nombre='" + nombre + '\''
                + ", siglas='" + siglas + '\''
                + '}';
    }
}
