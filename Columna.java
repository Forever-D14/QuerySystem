
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nacho
 */
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
