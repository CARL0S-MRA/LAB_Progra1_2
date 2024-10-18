package labprogra1_round2_Semana1;
import java.util.Scanner;
public class Rodriguez_Carlos_PlantillaEmpleado {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        String nombre;
        int horasMensuales;
        double tarifa;
        
        
        
        System.out.println("Ingrese el nombre del Empleado: ");
        nombre=lea.next();
        
        System.out.println("Ingrese numero de horas mensuales de trabajo: ");
        horasMensuales=lea.nextInt();
        
        System.out.println("Ingrese la tarifa por hora: ");
        tarifa=lea.nextInt();
        
        double salario=(horasMensuales*tarifa);
        
        System.out.println("----PLANTILLA DE EMPLEADO----"+
                "\n Nombre del Empleado: "+nombre+
                "\n Horas de Trabajo: "+horasMensuales+
                "\n Tarifa por Hora: "+tarifa+
                "\n Salario: "+salario+" %");
        
        
    }
}
