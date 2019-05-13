/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasmock;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author Aaron
 */
public class DB_Table_Vendedores {
    protected String conexion;
    protected ArrayList vendedores = new ArrayList();
    
    public DB_Table_Vendedores(String conexion){
        conexion = conexion;
    }
    
    public boolean anyadir_Vendedor(vendedor v){
        boolean anyadido = true;
        return anyadido;
    }
    
    public boolean modificar_Vendedor(int num_vend,Array modificar){
        boolean mod = true;
        return mod;
    }
    
    public boolean borrar_Vendedor(int num_vend){
        boolean borrar=true;
        return borrar;
    }
    
    public ArrayList buscar_Vendedor(String provincia){
        return vendedores;
    }
    
    public void desconectar(){
        
    }
}
