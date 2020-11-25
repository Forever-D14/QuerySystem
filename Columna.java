
import java.util.*;

class Columna {
    public String nombre;
    public int tamano;
    public ArrayList<String> instancias = new ArrayList();

    public Columna(String nombre, int tamano) {
        this.nombre = nombre;
        this.tamano = tamano;
    }
    
    public Columna(String nombre){
        this.nombre=nombre;
    }
    
    
}
