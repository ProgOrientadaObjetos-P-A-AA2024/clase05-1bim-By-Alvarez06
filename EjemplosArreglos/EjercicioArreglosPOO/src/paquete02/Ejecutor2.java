package paquete02;

import paquete01.LibretaCalificacion;

public class Ejecutor2 {

    public static void main(String[] args) {
        double[] notas = {10, 9, 8, 10};
        String nombreEstudiante = "René Elizalde";
        LibretaCalificacion libreta1 = new LibretaCalificacion(nombreEstudiante, 
                notas);
        
        /*
        Si se deja comentada la linea en la cual llama al metodo establecer
        Promedio, al nunca llamar a ese método el valor que va a presentar por
        pantalla va a ser igual al valor por defecto de una variable de numero
        es decir, 0
        */
        libreta1.establecerPromedio();
        /*
        Por otro lado, si se deja comentada la linea en la cual llama al metodo
        estalecerPromedioCualitativo, al nunca llamar a ese método el valor que
        va a presentar por pantalla va a ser igual al valor por defecto de una
        variable de tipo cadena, es decir, null
        */
        libreta1.establecerPromedioCualitativo();

        System.out.printf("\n%s\n", libreta1);
    }

}
