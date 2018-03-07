/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora2;

import java.util.*;

/**
 *
 * @author Sergio
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Calculadora miCalculadora = new Calculadora();
        Trigonométrica miTrigo = new Trigonométrica();

        Scanner miScanner = new Scanner(System.in);

        float entrada;
        System.out.println("Ingrese digito");
        entrada = miScanner.nextFloat();
        miCalculadora.setX(entrada);

        System.out.println("Ingrese digito");
        entrada = miScanner.nextFloat();
        miCalculadora.setY(entrada);

        miCalculadora.sumar();
        System.out.println("el resultado de la suma es: ");
        System.out.println(miCalculadora.getR());

        miCalculadora.restar();
        System.out.println("el resultado de la resta es: ");
        System.out.println(miCalculadora.getR());

        miCalculadora.dividir();
        System.out.println("el resultado de la division es: ");
        System.out.println(miCalculadora.getR());

        miCalculadora.multiplicar();
        System.out.println("el resultado de la multiplicación es: ");
        System.out.println(miCalculadora.getR());

        miTrigo.sen();
        System.out.println("el resultado de la sen es: ");
        System.out.println(miTrigo.getX());

    }

}
