package C2Ejercicio2;

import java.util.Scanner;
import static C2Ejercicio2.models.numeroSuerte.numeroSuerte;

public class main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia, mes, anio;
        System.out.println("Ingrese su fecha de nacimiento");
        do {
            System.out.print("Dia: ");
            dia = entrada.nextInt();
        } while (dia<=0 || dia>=32);
        do {
            System.out.print("Mes: ");
            mes = entrada.nextInt();
        } while (mes<=0 || mes>=13);
        do {
            System.out.print("Año (1990 - 2030): ");
            anio = entrada.nextInt();
        } while (anio<=1989 || anio>=2031);
        numeroSuerte(dia, mes,anio);
    }
}
