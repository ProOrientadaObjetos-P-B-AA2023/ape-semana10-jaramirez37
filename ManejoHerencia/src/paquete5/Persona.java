package paquete5;

public class Persona {

    private String nombre;
    private String apellido;
    private String usuario;

    public Persona(String nombre, String apellido, String usuario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
    }

    public Persona() {
    }

    @Override
    public String toString() {
        return "Persona{"
                + "nombre='" + nombre + '\''
                + ", apellido='" + apellido + '\''
                + ", usuario='" + usuario + '\''
                + '}';
    }
}
