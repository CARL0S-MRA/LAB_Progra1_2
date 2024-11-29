/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package labprogra1_round2_Semana1;
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class Alumno {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        String nombreAlumno , carrera;
        String apellido;
        int numeroCuenta;
        double promedio;
        
        System.out.println("Ingrese el nombre del Alumno: ");
        nombreAlumno=lea.nextLine();
        
        System.out.println("Ingrese el apellido del Alumno: ");
        apellido=lea.nextLine();
        
        System.out.println("Ingrese el numero de Cuenta del Alumno: ");
        numeroCuenta=lea.nextInt();
        
        System.out.println("Inrgese la carrera del Alumno: ");
        carrera=lea.next();
        
        System.out.println("Ingrese el promedio del Alumno: ");
        promedio=lea.nextDouble();
        
        System.out.println(
                "\n"+"++++DATOS DE ALUMNO++++"+
                "\n"+"Nombre de Alumno: "+nombreAlumno+" "+apellido+
                "\n"+"Numero de Cuenta: "+numeroCuenta+
                "\n"+"Nombre de la Carrera: "+carrera+ 
                "\n"+"Promedio: "+promedio);
    }
    
}
