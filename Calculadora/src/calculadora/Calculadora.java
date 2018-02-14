package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Principal miCalculadora;
        miCalculadora = new Principal();

        Scanner miEscanner;
        miEscanner = new Scanner(System.in);

        float entrada;
        System.out.println("porfavor ingrese el valor de x");
        entrada = miEscanner.nextInt();
        miCalculadora.setX(entrada);

        System.out.println("porfavor ingrese el valor de y");
        entrada = miEscanner.nextInt();
        miCalculadora.setY(entrada);

        miCalculadora.sumar();
        System.out.println("el resultado de la suma es: ");
        System.out.println(miCalculadora.getR());

        miCalculadora.restar();
        System.out.println("el resultado de la suma es: ");
        System.out.println(miCalculadora.getR());

        Trigonometrica miTrigo;
        miTrigo = new Trigonometrica();
        System.out.println("ingrese el valor para hallar cos: ");


    }
}
