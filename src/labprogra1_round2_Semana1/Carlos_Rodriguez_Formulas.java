
package labprogra1_round2_Semana1;
import java.util.Scanner;
public class Carlos_Rodriguez_Formulas {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        
        //Ejercicio A
        System.out.println("Ejercicio A");
        System.out.println("Numerador 1");
        int numerador1A =lea.nextInt();
        System.out.println("Denominador 1");
        int denominador1A =lea.nextInt();
        System.out.println("Numerador 2");
        int numerador2A =lea.nextInt();
        System.out.println("Denominador 2");
        int denominador2A =lea.nextInt();
        
        //Resultados
        double resultadoA = (numerador1A/denominador1A)+(numerador2A/denominador2A);
        System.out.println("El resultado del ejercicio A es  "+resultadoA);
        
        //Ejercicio B
        System.out.println("Ejercicio B");
        System.out.println("Numerador 1");
        int numerador1B =lea.nextInt();
        System.out.println("Denominador 1 Variable");
        int denominador1varB =lea.nextInt();
        System.out.println("Denominador 1");
        int denominador1B =lea.nextInt();
        System.out.println("Numerador 2");
        int numerador2B =lea.nextInt();
        System.out.println("Numerador 2 Varianle 1");
        int numerador2var1B =lea.nextInt();
        System.out.println("Numerador 2 Variable 2");
        int numerador2var2B =lea.nextInt();
        System.out.println(" Denominador 2");
        int denominador2B =lea.nextInt();
        
        // Resultado
        double resultadoB = (numerador1B/denominador1varB+denominador1B)-(numerador2B*numerador2var1B*numerador2var2B/denominador2B);
        System.out.println(" El resultado del ejercicio B "+resultadoB);
        
        //Ejercicio C
        System.out.println("Ejercicio C");
        System.out.println(" Numerador 1");
        int numerador1C =lea.nextInt();
        System.out.println("Denomirador 1");
        int denominador1C =lea.nextInt();
        System.out.println("Numerador 2");
        int numerador2C =lea.nextInt();
        
        //Resultado
        double resultadoC = (numerador1C/denominador1C)+(numerador2C);
        System.out.println("El resultado del ejercicio C"+resultadoC);
        
        //Ejercicio D
        
        System.out.println("Ejercicio D");
        System.out.println("Numerador 1");
        int numerador1D=lea.nextInt();
        System.out.println("Numerador 2");
        int numerador2D=lea.nextInt();
        System.out.println("Denominador 2");
        int denominador2D=lea.nextInt();
        
        //Resultado 
        double resultadoD = (numerador1D)+(numerador2D/denominador2D);
        System.out.println("El resultado del ejercicio D "+resultadoD);     
    }
}
