package C2Ejercicio2.models;

import java.util.Scanner;

public class ingresarDatos {
    public int dia, mes, anio;

    public ingresarDatos() {}
    public void ingresarDatos(){
        Scanner entrada = new Scanner(System.in);
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
    }
}
