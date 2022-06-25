package C2Ejercicio2;

import java.util.Scanner;
import static C2Ejercicio2.models.numeroSuerte.numeroSuerte;

public class main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia, mes, ano;
        System.out.println("Ingrese su fecha de nacimiento");
        System.out.print("Dia: ");
        dia = entrada.nextInt();
        System.out.print("Mes: ");
        mes = entrada.nextInt();
        System.out.print("Año: ");
        ano = entrada.nextInt();
        numeroSuerte(dia, mes,ano);
    }

}
