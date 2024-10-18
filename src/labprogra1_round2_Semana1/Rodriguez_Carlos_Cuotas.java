
package labprogra1_round2_Semana1;
import java.util.Scanner;

public class Rodriguez_Carlos_Cuotas {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        
        double montoPrestamo;
        int plazoMeses;
        double tasaInteres;
        double comisionCuota;
        double seguroMensual;
        
        System.out.println("Ingrese monto: ");
         montoPrestamo=lea.nextDouble();
        
        System.out.println("Ingresar el plazo de meses: ");
        plazoMeses=lea.nextInt();
        
        System.out.println("Ingresar el tasa de interes");
        tasaInteres =lea.nextDouble()/100;

        System.out.println("Ingresar la comision por cuota");
        comisionCuota =lea.nextDouble();

        System.out.println("Ingresar el porcentaje del seguro mensual");
        seguroMensual =lea.nextDouble()/100;
        
       double cuotaMensual = (montoPrestamo/plazoMeses);
       double Intereses = (cuotaMensual*tasaInteres);
       double Comisiones = (cuotaMensual*comisionCuota);
       double Seguros = (cuotaMensual*seguroMensual);
       double totalPagar = (cuotaMensual+Intereses+Comisiones+Seguros);
       
        System.out.println("---- CUOTAS MENSUALES ----"+
                "\n Cuota de Pago Mensual: "+cuotaMensual+
                "\n Total a Pagar: "+totalPagar);
    }
}
