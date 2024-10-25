
package Semana3;
import java.util.Scanner;
public class Lab2 {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
         int opcion=0;
        
        while(opcion !=4){
            System.out.println(" ");
            System.out.println("----MENU----"+
                    "\n 1 - CADENA"+
                    "\n 2 - NOTAS"+
                    "\n 3 - CLASE"+
                    "\n 4 - SALIR");
            System.out.println("Ingresar numero asignado");
            opcion=lea.nextInt();
            
            if(opcion==1){
                System.out.println("----CADENA----");
                System.out.println("Ingrese una cadena de texto:");
                String cadena=lea.next();

                int longitud=cadena.length();
                int maxRepeticiones=0;
                char caracterRepetido=' ';
                char caracteres=0;

                while (caracteres<256) {
                    int contador=0;
                    int contadorCaracter=0;

                    while (contadorCaracter<longitud) {
                        if (cadena.charAt(contadorCaracter)==caracteres) {
                            contador++;
                        }
                        contadorCaracter++;
                    }

                    if (contador>maxRepeticiones) {
                        maxRepeticiones=contador;
                        caracterRepetido=caracteres;
                    }

                    caracteres++;
                }
                System.out.println("El caracter que mas veces se repite en la cadena es: " + caracterRepetido);
                System.out.println("Numero de veces que se repite en la cadena: " + maxRepeticiones);
        }   
               
            else if(opcion==2){
                System.out.println("----NOTAS----");
                System.out.println("Ingresar cantidad de notas que desea: ");
                int cantidadNotas=lea.nextInt();
                int contador=0;
                double Sumarnota=0;
                double promedio=0;
                double notamayor=0;
                double notamenor=100;
                
                
                while(contador++<cantidadNotas){
                    System.out.println("Nota#"+contador+": ");
                    double nota=lea.nextDouble();
                    Sumarnota+=nota;
                    
                     
                    while(nota<=-1 || nota>=101){
                        System.out.println("Nota#"+contador+": ");
                        nota=lea.nextDouble();
                        
                        while(nota>notamayor){
                        notamayor=nota;
                    }
                        while(nota<notamenor){
                        notamenor=nota;
                    }
                }
                }
                
                promedio=Sumarnota/cantidadNotas;
                System.out.println("PROMEDIO: "+String.format("%.2f",promedio));
                System.out.println("NOTA MENOR: "+notamenor);
                System.out.println("NOTA MAYOR: "+notamayor);
            }
                
            else if (opcion==3){
                System.out.println("----CLASE----");
                int inicio=0;
                System.out.println(" Ingrese la fecha actual en el siguiente formato: dia, DD/MM");
                String fecha=lea.next().toLowerCase();
                int coma = fecha.indexOf(',');
                int pleca = fecha.indexOf('/');
                String dia = fecha.substring(inicio, coma);
                String examen;
                int aprobado;
                String numeroDia = fecha.substring(coma + 1, pleca);
                int numeroDias = Integer.parseInt(numeroDia);
                String numeroMes= fecha.substring(pleca + 1);
                int mes = Integer.parseInt(numeroMes);
                
                if (numeroDias > 31 && numeroDias < 0) {
                    System.out.println("ERROR | FECHA INCORRECTA");
                }
                if (mes > 12 && mes < 0) {
                    System.out.println("ERROR | FECHA INCORRECTA");
                }
                
                if (dia.equals("lunes")) {
                    System.out.println("Nivel Inicial"
                    +"\n Ese dia hubo examen?");
                    examen=lea.next().toLowerCase();
                    if (examen.equals("si")) {
                        System.out.println("Ingrese cuantos aprobaron: ");
                        aprobado =lea.nextInt();  
                    } 
                }
                if (dia.equals("martes")) {
                        System.out.println("Nivel Intermedio"
                        +"\n Ese dia hubo exxamen?");
                        examen=lea.nextLine().toLowerCase();
                        if (examen.equals("si")) {
                            System.out.println("Ingrese cuantos aprobaron: ");
                            aprobado=lea.nextInt();
                        }
                    }
                if (dia.equals("miercoles")) {
                    System.out.println("Nivel Avanzado"
                    +"\n Ese dia hubo examen?");
                    examen=lea.nextLine().toLowerCase();
                    if (examen.equals("si")) {
                        System.out.println("Ingrese cuantos aprobaron: ");
                        aprobado=lea.nextInt();       
                    }
                }
                
                if (dia.equals("jueves")) {
                    System.out.println("Practicas Habladas"+" No tienen examen");
                    System.out.println("Ingrese el procentaje de asistencia: ");
                    int asistencia=lea.nextInt();
                    if (asistencia >50) {
                        System.out.println("Asistio la mayoria");
                    }else{
                        System.out.println("No asistio la mayoria");
                    }
                }else if(dia.equals("viernes")) {
                    System.out.println("Ingles para viajeros"+" No tienen examen");
                    if (numeroDias == 1 && (mes == 1 || mes == 7)) {
                        System.out.println("Comienza nuevo ciclo");
                        System.out.println("Ingrese la cantidad de alumnos del nuevo ciclo: ");
                        int alumnos=lea.nextInt();
                        System.out.println("Ingrese el precio $ por cada alumno: ");
                        double precio=lea.nextInt();
                        double total=alumnos*precio;
                        System.out.println("Ingreso total en $: "+total);
                        
                    }else{
                        System.out.println("No es el inicio de un nuevo ciclo");
                    }
                }else{
                    System.out.println("ERROR | FECHA INCORRECTA");
                }
            }
    }
    }
    }

  
