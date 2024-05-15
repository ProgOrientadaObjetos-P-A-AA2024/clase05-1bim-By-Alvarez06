package paquete02;

import paquete01.LibretaCalificacion;

public class Ejecutor2 {

    public static void main(String[] args) {
        double[] notas = {10, 9, 8, 10};
        String nombreEstudiante = "René Elizalde";
        LibretaCalificacion libreta1 = new LibretaCalificacion(nombreEstudiante, 
                notas);
        libreta1.establecerPromedio();
        libreta1.establecerPromedioCualitativo();

        System.out.printf("\n%s\n", libreta1);
    }

}
