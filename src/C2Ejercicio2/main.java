package C2Ejercicio2;

import C2Ejercicio2.models.ingresarDatos;

import java.util.Scanner;
import static C2Ejercicio2.models.numeroSuerte.numeroSuerte;

public class main {
    public static void main(String[] args) {
        ingresarDatos datos = new ingresarDatos();
        datos.ingresarDatos();
        numeroSuerte(datos.dia, datos.mes, datos.anio);
    }
}
