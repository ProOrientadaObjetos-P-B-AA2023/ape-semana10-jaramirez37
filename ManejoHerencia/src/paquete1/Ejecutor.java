package paquete1;

import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;
import paquete5.Persona;
import paquete6.InstitucionEducativa;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejecutor {

    public static void main(String[] args) {
        boolean inte = true;
        Scanner sc = new Scanner(System.in);
        ArrayList<PrestamoAutomovil> automovils = new ArrayList<>();
        ArrayList<PrestamoEducativo> educativos = new ArrayList<>();
        while (inte) {
            try {
                System.out.println("1: INGRESAR DATOS PARA UN PRESTAMO DE AUTOMOVIL");
                System.out.println("2: INGRESAR DATOS PARA UN PRESTAMO EDUCATIVO");
                System.out.println("3: MOSTRAR PRESTAMOS");
                System.out.println("4: SALIR");
                int opc = sc.nextInt();
                switch (opc) {
                    case 1:
                        Persona persona;
                        Persona garante;
                        System.out.println("INGRESE: NOMBRE, APELLIDO, USUARIO");
                        persona = new Persona(sc.next(), sc.next(), sc.next());
                        System.out.println("INGRESE GARANTE: NOMBRE; APELLIDO, USUARIO");
                        garante = new Persona(sc.next(), sc.next(), sc.next());
                        System.out.println("INGRESE: TIEMPO PRESTAMO;CIUDAD PRESTAMO ;TIPO AUTO; MARCA AUTO; VALOR AUTO");
                        automovils.add(new PrestamoAutomovil(persona, sc.nextInt(), sc.next(), sc.next(), sc.next(), garante, sc.nextDouble()));
                        break;
                    case 2:
                        Persona persona2;
                        InstitucionEducativa institucion;
                        System.out.println("INGRESE: NOMBRE, APELLIDO, USUARIO");
                        persona2 = new Persona(sc.next(), sc.next(), sc.next());
                        System.out.println("INGRESE: NOMBRE INSTITUCION; SIGLAS");
                        institucion = new InstitucionEducativa(sc.next(), sc.next());
                        System.out.println("INGRESE: TIEMPO PRESTAMO; CIUDAD PRESTAMO; NIVEL ESTUDIO; VALOR CARRERA");
                        educativos.add(new PrestamoEducativo(persona2, sc.nextInt(), sc.next(), sc.next(), institucion, sc.nextDouble()));
                        break;
                    case 3:
                        System.out.println("PRESTAMOS DE AUTOMOVILES");
                        for (PrestamoAutomovil pr : automovils) {
                            pr.calcularvalorMensualPagoPrestamoAutomovil();
                            System.out.println(pr);
                        }
                        System.out.println("PRESTAMOS EDUCATIVOS");
                        for (PrestamoEducativo ins : educativos) {
                            ins.calcularValorMensualPagoPrestamoCarrera();
                            System.out.println(ins);
                        }
                        inte = false;
                        break;
                    case 4:
                        inte = false;
                        break;
                    default:
                        System.out.println("OPCION INCORRECTA");
                        break;
                }
            } catch (Exception err) {
                System.out.println("OPCION INCORRECTA");
                sc.next();
            }
        }
    }
}
