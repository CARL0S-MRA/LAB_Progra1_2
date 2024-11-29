
package Semana8_Lab7_XO;

public class ManejooAdmin {
    admin usuario[];
     int UsuarioActual;
    public ManejooAdmin(){
        usuario= new admin[100];
        UsuarioActual=0;
        
    }
    
     admin Buscar(String nombre){
        for (int i = 0; i < UsuarioActual; i++) {
            if (usuario[i].nombre.equals(nombre)) {
                System.out.println("USUARIO NO ENCONTRADO");
                return usuario[i];
            }
        }
        return null;
    }
     
     void Registro(admin NuevoUsuario){
         if(Buscar(NuevoUsuario.nombre) ==  null){
         usuario[UsuarioActual]=NuevoUsuario;
         UsuarioActual++;
             System.out.println(" SE REGISTRO");
         }else{
             System.out.println("No SE REGISTRO");
         }
     }
     
}
