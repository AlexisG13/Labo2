/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo2;

/**
 *
 * @author Alexis Gomez
 */
public class Proveedor {
    private String nombre;
    private int telefono;
    private String empresa;
    
    public Proveedor(){};
   
   public Proveedor(String nombre,int telefono,String empresa){
       this.nombre=nombre;
       this.telefono=telefono;
       this.empresa=empresa;
   }
   
   public String getNombre(){
       return nombre;
   }
   
   public void SetNombre(String nombre){
       this.nombre=nombre;
   }
   
   public int getTelefono(){
       return telefono;
   }
   
   public void SetTelefono(int telefono){
       this.telefono=telefono;
   }
   
   public String getEmpresa(){
       return empresa;
   }
   
   public void SetEmpresa(String empresa){
       this.empresa=empresa;
   }
   
}
