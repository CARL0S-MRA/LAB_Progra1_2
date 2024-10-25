
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
                char caracter=0;

                while (caracter<256) {
                    int contador=0;
                    int contadorCaracter=0;

                    while (contadorCaracter<longitud) {
                        if (cadena.charAt(contadorCaracter)==caracter) {
                            contador++;
                        }
                        contadorCaracter++;
                    }

                    if (contador>maxRepeticiones) {
                        maxRepeticiones=contador;
                        caracterRepetido=caracter;
                    }

                    caracter++;
                }
                System.out.println("El caracter que mas veces se repite en la cadena es: " + caracterRepetido);
                System.out.println("Numero de veces que se repite en la cadena: " + maxRepeticiones);
        }   
               
            else if(opcion==2){
                System.out.println("----NOTAS----");
                System.out.println("Ingresar cantidad de notas que desea: ");
                int cantidadNotas=lea.nextInt();
                int contador=0;
                double sumarnota=0;
                double promedio=0;
                double notamayor=0;
                double notamenor=100;
                
                
                while(contador++<cantidadNotas){
                    System.out.println("Nota#"+contador+": ");
                    double nota=lea.nextDouble();
                    sumarnota+=nota;
                    
                     
                    while(nota<=-1|| nota>=101){
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
                
                promedio=sumarnota/cantidadNotas;
                System.out.println("PROMEDIO: "+String.format("%.2f",promedio));
                System.out.println("NOTA MENOR: "+notamenor);
                System.out.println("NOTA MAYOR: "+notamayor);
            }
                
            else if (opcion==3){
                System.out.println("----CLASE----");
                
            }
    }
    }
    }

  
