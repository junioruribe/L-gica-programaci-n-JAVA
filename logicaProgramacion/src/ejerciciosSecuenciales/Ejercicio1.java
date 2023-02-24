package ejerciciosSecuenciales;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        int nh, nm,ta;
        double ph,pm;
        Scanner leer =new Scanner(System.in);
        
        System.out.println("Ingrese numero de mujeres");
        nm=leer.nextInt();
        System.out.println("Ingrese numero de hombres");
        nh=leer.nextInt();
        
        ta = nm+nh;
//        ph = (nh*100)/ta;
//        pm = (nm*100)/ta;
        ph = ((double)nh/(double)ta)*100;
        pm = (nm/ta)*100;
        System.out.println("Total aprendiz: "+ta);
        System.out.println("Poncentaje de mujer: "+pm);
        System.out.println("Poncentaje de hombre: "+ph);
    }
    
}
