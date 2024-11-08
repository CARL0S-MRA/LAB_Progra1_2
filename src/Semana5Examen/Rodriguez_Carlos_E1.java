package Semana5Examen;
import java.util.Scanner;
public class Rodriguez_Carlos_E1 {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        int opcion=0;
        do{
            System.out.println("---MENU---"
            +"\n 1. Piramide"
            +"\n 2. El Mayor"
            +"\n 3. Caja | Cliente"
            +"\n 4. Caracteres Vocales"
            +"\n 5. Salir");
            System.out.println("Ingrese una opcion");
            opcion=lea.nextInt();
            
            switch(opcion){
                case 1:
                    int numero=1;
                    int numeroFilas=6;
                    
                    for (int filas = 1; filas <=numeroFilas; filas++) {
                        int sumaLinea=0;
                        for (int espacio = 0; espacio < filas; espacio++) {
                            System.out.print(numero+" ");
                            sumaLinea+=numero;
                            numero+=2;
                        }
                        System.out.println("= "+sumaLinea);
                    }
                    break;
                    
                case 2:
                    System.out.println("----EL MAYOR----");
                    String otraVez;
                    int numeros;
                    int suma=0;
                    int contador=0;
                    int mayor=0;
                    double promedio=0.0;
                    
                    boolean primerNum = true;
                    do{
                        System.out.println("Ingrese un numero: ");
                        numeros=lea.nextInt();
                        if (primerNum) {
                            mayor=numeros;
                            primerNum=false;
                        }else{
                            if (numeros > mayor) {
                                mayor=numeros;
                            }
                        }
                        suma+=numeros;
                        contador++;
                        
                        System.out.println("Desea ingresar otro numero? [ si | no ]");
                        otraVez=lea.next().toLowerCase();
                    }while(otraVez.equals("si"));
                    promedio=suma/contador;
                    
                    System.out.println("El numero mayor ingresado es: "+mayor);
                    System.out.println("El promedio es: "+String.format("%.2f", promedio)+" %");
                    break;
                    
                case 3:
                    System.out.println("--CAJA | CLIENTE--");
                    String nombreCliente;
                    String otroCanal;
                    System.out.println("Ingrese nombre del cliente: ");
                    nombreCliente=lea.next();
                    int contarHD = 0;
                    int contarNORMAL=0;
                    double subTotal=0.0;
                    do{
                    
                        System.out.println("Ingrese tipo de canal [HD | NORMAL]");
                        String tipoCanal=lea.next().toUpperCase();
                        if (tipoCanal.equals("HD")) {
                            contarHD++;
                            subTotal+=30;
                        }else if(tipoCanal.equals("NORMAL")){
                            contarNORMAL++;
                            subTotal+=20;
                        }
                        
                        System.out.println("Desea ingresar otro canal [SI | NO]");
                        otroCanal=lea.next().toUpperCase();
                    }while(otroCanal.equals("SI"));
                    
                    System.out.println("Ingrese tipo de caja digital [LIGHTBOX | HDBOX | DVRBOX]");
                    String tipoCaja=lea.next().toUpperCase();
                    double precioCaja=0;
                    if (tipoCaja.equals("LIGHTBOX")) {
                        precioCaja=50;
                    }else if(tipoCaja.equals("HDBOX")){
                        precioCaja=100;
                    }else if(tipoCaja.equals("DVRBOX")){
                        precioCaja=150;
                    }else{
                        System.out.println("CAJA NO VALIDA");
                        continue;
                    }
                    
                    subTotal+=precioCaja;
                    double impuesto = subTotal *0.15;
                    double total = subTotal + impuesto;
                    System.out.println("|-------------------------FACTURA-----------------------|"
                                    +"\n|- Nombre Cliente: "+nombreCliente
                                    +"\n|- Numero de canal NORMAL: "+contarNORMAL
                                    +"\n|- Numero de canal HD: "+contarHD
                                    +"\n|- Subtotal: "+subTotal
                                    +"\n|- Impuesto (15%): "+String.format("%.2f", impuesto)
                                    +"\n|- Total a Pagar: "+total
                                    +"\n|_______________________________________________________|");
                    break;
                    
                case 4:
                    System.out.println("---CARACTERES VOCALES---");
                    String cadena;
                    int contVocales=0;
                    System.out.println("Ingrese cadena de texto: ");
                    cadena=lea.next().toLowerCase();
                    for (int contar = 0; contar < cadena.length();contar++) {
                        char caracter=cadena.charAt(contar);
                        switch(caracter){
                            case 'a':
                            case 'e':
                            case 'i':
                            case 'o':
                            case 'u':
                                contVocales++;
                                break;
                        }
                    }
                    System.out.println("La cadena de caracteres tiene "+contVocales+" vocales");
                    break;
                case 5:
                    System.out.println("-HASTA LUEGO-");
            }
            
        }while(opcion !=5);
    }
}
