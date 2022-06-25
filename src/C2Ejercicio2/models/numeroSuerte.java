package C2Ejercicio2.models;

public class numeroSuerte {
    private static int suerte, valor1, valor2, valor3, valor4;

    public static void numeroSuerte(int dia, int mes, int ano){
        int suma = 0;
        suma = dia+mes+ano;
        valor1 = suma/1000;
        valor2 = suma/100%10;
        valor3 = suma/10%10;
        valor4 = suma%10;
        suerte = valor1+valor2+valor3+valor4;
        System.out.println("Su numero de la suerte es: " + suerte);

    }
}
