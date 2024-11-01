package Semana4;
import java.util.Scanner;
import java.util.Random;
public class Rodriguez_Carlos_Lab3_Estructura {
    
    //colores de los votantes
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        Random random=new Random();
        int opcion=0;
        int contaAlreves=0;
        int contaPerfectos=0;
        int contaPrimos=0;
        int contaVotaciones=0;
        
        do{
            System.out.println("---MENU---"
            +"\n 1- Palabra Alreves"
            +"\n 2- Numeros Perfectos"
            +"\n 3- Primos"
            +"\n 4- Votaciones"
            +"\n 5- Salir");
            System.out.println("Ingresar numero de cada opcion: ");
            opcion=lea.nextInt();
            switch(opcion){
                case 1:
                    contaAlreves++;
                    String palabra;
                    System.out.println("---PALABRA ALREVES---");
                    //Ingresamos la palabra
                    //le ponemos .toUpperCase(); para que el futuro lo imprima en mayusculas
                    System.out.println("Ingrese una palabra: ");
                    palabra =lea.next();
                    int length = palabra.length();
                    // Hacemos un for para que cuando ingresemo la palabra esta nos la imprima al reves.
                    for(int reves = palabra.length() -1; reves >= 0; reves--){
                        System.out.print(palabra.charAt(reves));
                    }
                    System.out.println(); 
                break;
                
                case 2:
                    contaPerfectos++;
                    // Agregamos las variables que vamos a usar
                    int Contador =0;
                    int Numero =0;
                    int Divisor=0;
                    System.out.println("---NUMEROS PERFECTOS---");
                    //Pedimos que nos ingrese un numero
                    System.out.println("Ingrese un numero: ");
                    Numero=lea.nextInt();
                    // hacemos un for con contador para que recorra todos los numeros exceptuando el 1
                    //Le agregramos un if para que este verifique que el numero que ponga el contador sea divisor al numero que nosostros ingresemos
                    for(Contador = 1; Contador < Numero; Contador++){
                        if(Numero % Contador == 0){
                            Divisor += Contador;
                        }
                    }
                    //Le ponemos un if para que compare Si la suma de los divisores es igual al numero que nosotros ingresamos asi que nos imprima que es un numero perfecto.
                    // Si no es asi se imprime lo contrario utilizando else
                    if(Divisor == Numero){
                    System.out.println(+Numero+" <=es un numero perfecto");
                    }else{
                        System.out.println(+Numero+" <=no es numero perfecto");
                    }
                break;
                
                case 3:
                    contaPrimos++;
                    //Ponemos una variable y la igualamos a random para que asi pueda imprimir numeros aleatorios del 1 al 100
                    int numeroRandom = random.nextInt(100);
                    // Esta variable un contador y la igualamos a 1 para que comienze A contar los numeros divisores desde 1
                    int contadorDivisor = 1;
                    int primo =0;
                    
                    System.out.println("---PRIMOS---");
                    
                    System.out.println("El numero generado es: "+numeroRandom);
                    // Hacemos un bucle con while para encontrar los divisores del numero generado
                    
                    while(contadorDivisor <= numeroRandom){
                        // En if verifica si el contador es divisor del numero aleatorio
                        if(numeroRandom % contadorDivisor ==0){
                            primo += contadorDivisor;
                        }
                        contadorDivisor++;
                    }
                        // En el if hacemos que compare si es primo el numero random generado
                        // Si es primo que genero que se dividido por dos numeros y que ha sido por 1 y el numero random\
                        // Si es lo contario solo se imprime que no es primo
                        if(primo==numeroRandom + 1){
                            System.out.println("El "+numeroRandom+" es divisor de dos numeros");
                            System.out.println("Divisores de "+numeroRandom+" son: 1 y "+numeroRandom);
                        }else{
                            System.out.println("No es un numero primo");
                        }

                break;  
                
                case 4:
                    contaVotaciones++;
                    int votosAzul =0;
                    int votosAmarillo=0;
                    int votosRojo=0;
                    int votosNegro=0;
                    int votosNulos=0;
                    int repetidor=0;
                    
                    System.out.println("---VOTACIONES---");
                    System.out.println("Ingrese cantidad de votantes: ");
                    int votantes=lea.nextInt();
                    for(repetidor =0; repetidor<votantes; repetidor++){
                        
                        System.out.println("--PLANILLA--"
                        +ANSI_BLUE+  "\n - AZUL"
                        +ANSI_YELLOW+"\n - AMARILLO"
                        +ANSI_RED+   "\n - ROJO"
                        +ANSI_BLACK+ "\n - NEGRO");
                        System.out.println("Ingrese el voto en cualquier planilla: ");
                        String planilla=lea.next().toUpperCase();
                        
                        switch(planilla){
                            case "AZUL" :
                                votosAzul++;
                                break;
                            case "AMARILLO" :
                                votosAmarillo++;
                                break;
                            case "ROJO":
                                votosRojo++;
                                break;
                            case "NEGRO":
                                votosNegro++;
                                break;
                            default:
                                votosNulos++;
                                break;
                                
                        }
                    }
                    int votosValidos = votosAzul + votosRojo + votosNegro + votosAmarillo;
                    if (votosValidos >= votantes * 0.6) {
                        String planillaGanadora ="";
                        int maxVotos = 0;
                        if (votosAzul > maxVotos) {
                            maxVotos = votosAzul;
                            planillaGanadora = "AZUL";
                        }
                        if (votosRojo > maxVotos) {
                            maxVotos = votosRojo;
                            planillaGanadora = "ROJO";
                        }
                        if (votosNegro > maxVotos) {
                            maxVotos = votosNegro;
                            planillaGanadora = "NEGRO";
                        }
                        if (votosAmarillo > maxVotos) {
                            maxVotos = votosAmarillo;
                            planillaGanadora = "AMARILLO";
                        }

                        // Imprime la planilla ganadora
                        System.out.println("La planilla ganadora es: " + planillaGanadora);
                    } else {
                        // Imprime que la votación ha fallado si no se cumplen los requisitos
                        System.out.println("VOTACION FALLIDA");
                    }
                break;
                
                case 5:
                    System.out.println("Veces de Palabra Alreves: "+contaAlreves);
                    System.out.println("Veces de Numeros Perfectos: "+contaPerfectos);
                    System.out.println("Veces de Primos: "+contaPrimos);
                    System.out.println("Veces de Votaciones: "+contaVotaciones);
                    
            }
        }while(opcion !=5);
    }
}
