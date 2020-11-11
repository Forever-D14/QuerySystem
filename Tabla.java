
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
public class Tabla {
    public String nombre;
    public String descriptor[];
    public ArrayList <Columna> columnas = new ArrayList();

    public Tabla(String nombre, String d[]) {
        this.nombre = nombre;
        this.descriptor = d;
        for(int i = 1;i<d.length;i+=3){
            this.columnas.add(new Columna(d[i],(Integer.parseInt(d[i+2])-Integer.parseInt(d[i+1]))+1));
        }
        
    }

    public Tabla(String nombre) {
        this.nombre = nombre;
    }
    
    public  void agreggate(String instancia){
        char x[] = instancia.toCharArray();
        int posicion=0;
        int j;
        for(int i=0;i<this.columnas.size();i++){
            instancia = "";
            for(j = 0;j<this.columnas.get(i).tamaño;j++){
                instancia+=Character.toString(x[j+posicion]);
                
            }
            posicion+=j;
            this.columnas.get(i).instancias.add(instancia);
        }
    }
    
    public void describe(){
        for(int i=0;i<this.columnas.size();i++){
            System.out.print("COLUMNA " + i+ ": " + this.columnas.get(i).nombre + "\n"
                    + "Tamaño: " + this.columnas.get(i).tamaño + "\n");
            
        }
            
    }
    
    
    
}
