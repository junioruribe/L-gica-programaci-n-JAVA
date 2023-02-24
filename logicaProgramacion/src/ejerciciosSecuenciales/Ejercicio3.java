package ejerciciosSecuenciales;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        double comTo, comT, comM, comR, tdv;
        int sb, vAT, vAM, vAR, vlrTo, vlrM, vlrRe;

        System.out.println("Ingrese por favor su salario basico: ");
        sb = leer.nextInt();

        System.out.println("Ingrese por favor el valor del auto Toyota: ");
        vlrTo = leer.nextInt();

        System.out.println("Ingrese por favor el valor del auto Mazda: ");
        vlrM = leer.nextInt();

        System.out.println("Ingrese por favor el valor del auto Renault: ");
        vlrRe = leer.nextInt();

        System.out.println("Ingrese por favor el numero de autos vendidos de la marca Toyota: ");
        vAT = leer.nextInt();

        System.out.println("Ingrese por favor el numero de autos vendidos de la marca Mazada: ");
        vAM = leer.nextInt();
        
        System.out.println("Ingrese por favor el numero de autos vendidos de la marca Renault: ");    
        vAR = leer.nextInt();
        
        comT = (vlrTo*vAT) * 0.15;
        comM = (vlrM *vAM ) * 0.05;
        comR = (vlrRe*vAR ) * 0.035;
        comTo = comT + comM + comR;
        
        tdv = sb + comTo;
        
        System.out.println("La comision recibida por el auto Toyota es de: "+ comT + "\nLa comision recibida por el auto Mazda es de: "+ comM + "\nLa comision recibida por el auto Renault es de: " + comR);
        System.out.println("El total de comision que recibe por todos los automoviles es de: " + comTo);
        System.out.println("El total devengado por el vendedor es de: " + tdv);
    }

}
