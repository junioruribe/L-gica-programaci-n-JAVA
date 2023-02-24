package ejerciciosSecuenciales;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        double c1,c2,c3,ef,tf,prom,ppar,pef,ptf,cf;
        Scanner leer;
        leer=new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println("Ingrese calificacion 1:");
        c1=leer.nextDouble();
        System.out.println("Ingrese calificacion 2:");
        c2=leer.nextDouble();
        System.out.println("Ingrese calificacion 3:");
        c3=leer.nextDouble();
        System.out.println("Ingrese calificacion examen final:");
        ef=leer.nextDouble();
        System.out.println("Ingrese calificacion trabajo final:");
        tf=leer.nextDouble();
        prom = (c1+c2+c3)/3;
        ppar=prom*0.55;
        pef=ef*0.30;
        ptf=tf*0.15;
        cf=ppar+pef+ptf;
        System.out.println("La calificacion final es: "+cf);
    }
    
}
