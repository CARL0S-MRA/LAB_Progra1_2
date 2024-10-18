
package labprogra1_round2_Semana1;
import java.util.Scanner;
public class Carlos_Rodriguez_Clicks {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        double totalPagar=0;
        double ISV=0.16;
        double CPC=0;
        double totalISV=0;
        int clicsTotales;
        int clic1;
        double precioClic1;
        int clic2;
        double precioClic2;
        int clic3;
        double precioClic3;
        
        
        
        System.out.println("Ingrese los clics totales: ");
        clicsTotales=lea.nextInt();
        
        System.out.println("Ingresar primeros clics: ");
        clic1=lea.nextInt();
        System.out.println("Precio de primeros clics: ");
        precioClic1=lea.nextDouble();
        
        System.out.println("Ingresar segundos clics: ");
        clic2=lea.nextInt();
        System.out.println("Precio primeros clics: ");
        precioClic2=lea.nextDouble();
        
        System.out.println("Ingresar terceros clics: ");
        clic3=lea.nextInt();
        System.out.println("Precio terceros cliscs: ");
        precioClic3=lea.nextDouble();
        
        totalPagar = precioClic1*clic1 + precioClic2*clic2 + precioClic3*clic3;
        CPC = totalPagar/clicsTotales;
        totalISV = totalPagar * ISV;
        
        System.out.println("CPC: "+String.format(" %.2f", CPC));
        System.out.println("Total ISV: "+String.format(" %.2f", totalISV));
    }
}
