
package Semana8_Lab7_XO;

public class admin {
    String nombre;
    String password;
    String partida[];
    int partidasJugadas;
    public admin(String name, String password){
        nombre=name;
        this.password=password;
        partida = new String[100];
        partidasJugadas=0;
    }
    void Registrar(String gameActual){
        partida[partidasJugadas]=gameActual;
        partidasJugadas++;
    }
    
    String verPartida(){
        String allPartidas="";
        for (int i = 0; i < partidasJugadas; i++) {
            allPartidas += partida[i]+"\n";
        }
        
        return allPartidas;
    }
    
    
    
}
